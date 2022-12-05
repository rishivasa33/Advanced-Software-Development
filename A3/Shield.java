import java.util.ArrayList;
import java.util.ListIterator;

public class Shield extends ShieldDecorator implements IObserver {

    private int shieldHealth;
    private ArrayList<BoardComponent> children;

    private Square squareObjectToBeDecorated;

    private int x;
    private int y;

    public Shield(Square squareObjectToBeDecorated, int x, int y) {
        //Decorate the Board Component with a shield
        super();

        //Copy Square's children to the Shield to perform further operations
        ArrayList<BoardComponent> squareChildren = squareObjectToBeDecorated.getChildren();
        this.children = new ArrayList<>();
        for (BoardComponent child : squareChildren) {
            Add(child);
        }

        //Save the shield co-ordinates for using later to reattach square
        this.x = x;
        this.y = y;

        //Save the square object to reattach later after shield dies
        this.squareObjectToBeDecorated = squareObjectToBeDecorated;

        //Add Shield to the composite in place of the Square
        GameBoard.Instance().GetBoard().get(x).set(y, this);

        //Initialize shield health to 2
        this.shieldHealth = 2;
        System.out.print(" with health: " + this.shieldHealth + "\n");

        //Attach shield to the observer
        AsteroidImpacts.instance().attach(this);
    }

    @Override
    public void Operation() {
        ArrayList<BoardComponent> childrenCopy = new ArrayList<>(children);
        for (BoardComponent child : childrenCopy) {
            child.Operation();
        }
    }

    @Override
    public void Add(BoardComponent child) {
        // I am now this child's parent.
        this.children.add(child);
        child.SetParent(this);
    }

    @Override
    public void Remove(BoardComponent child) {
        children.remove(child);
    }

    @Override
    public void updateWhenAsteroidHits() {
        // No Update on the shield itself when getting notified of Asteroid hit.
        // This is handled by update method which is notified by the observer
        // Sorry, Liskov
    }

    // This Update method is called by the observer when the square witnesses an asteroid strike
    // It will decrement shield health by 1
    // If shield health becomes 0, it will copy its updated children to the square object it is decorating,
    // It will also return the updated square object to the composite
    // It will then stop observing for events and reattach the square to the observer
    @Override
    public void update(Subject subject) {
        Shield currentShield = (Shield) subject.getValue("square");

        if (currentShield.shieldHealth > 0) {
            currentShield.shieldHealth -= 1;
            System.out.println("Asteroid Strike on Shield at: (" + currentShield.x + "," + currentShield.y + ") !! Shield health: " + currentShield.shieldHealth);
        }

        if (currentShield.shieldHealth == 0) {

            //Copy updated children of the shield to the square object
            ArrayList<BoardComponent> childrenCopy = new ArrayList<>(this.squareObjectToBeDecorated.getChildren());
            for (BoardComponent boardComponent : childrenCopy) {
                this.squareObjectToBeDecorated.Remove(boardComponent);
            }
            for (BoardComponent newChild : currentShield.children) {
                this.squareObjectToBeDecorated.Add(newChild);
            }

            //Return the Square object to the composite
            GameBoard.Instance().GetBoard().get(x).set(y, this.squareObjectToBeDecorated);
            BoardComponent reattachedSquare = GameBoard.Instance().GetBoard().get(x).get(y);

            //Detach the shield object from the list of observers
            //Reattach the square object to the list of observers
            ListIterator<IObserver> iterator = AsteroidImpacts.instance().getListOfObservers().listIterator();
            while (iterator.hasNext()) {
                IObserver observer = iterator.next();
                if (observer.equals(this)) {
                    iterator.remove();
                    iterator.add((IObserver) reattachedSquare);
                }
            }

            System.out.println("Shield at: (" + currentShield.x + "," + currentShield.y + ") is dead, RIP!!");
        }
    }
}
