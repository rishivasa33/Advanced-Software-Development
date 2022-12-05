public abstract class ShieldDecorator extends BoardComponent {

    public ShieldDecorator() {
        super();
    }

    @Override
    public abstract void Operation();

    @Override
    public abstract void Add(BoardComponent child);

    @Override
    public abstract void Remove(BoardComponent child);

}
