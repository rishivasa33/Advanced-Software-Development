import java.util.ArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent implements IObserver
{
	private final ArrayList<BoardComponent> children;
	private BoardComponent parent;
	
	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
		AsteroidImpacts.instance().attach(this);
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}

	@Override
	public void UpdateOnAsteroidHit() {
		//No Update on getting notified of Asteroid hit
		//Sorry, Liskov
	}

	// This method is invoked when the square is hit with an Asteroid
	// It then notifies its children via the Composite to take some action (if required)
	@Override
	public void update(Subject subject) {

		Square currentSquare = (Square) subject.getValue("square");

		//Iterate through the current square's children and notify them to take action on asteroid hit
		ArrayList<BoardComponent> currentSquareChildren = new ArrayList<>(currentSquare.children);
		for (int i = 0; i < currentSquareChildren.size(); i++) {
			BoardComponent child = currentSquareChildren.get(i);
			child.UpdateOnAsteroidHit();
		}
	}

}