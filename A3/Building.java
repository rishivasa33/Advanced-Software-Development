// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings.
// Buildings cannot have children.
public class Building extends BoardComponent
{
	private int buildingHealth;

	public Building()
	{
		super();
		buildingHealth = 2;
		System.out.print(" with health: " + buildingHealth + "\n");
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	// This Method reduces the health of the building by 1
	// when it is notified of an Asteroid Strike by the Square.
	// It then removes the building from the BoardComponent Composite
	// and decrements total building count if the health of the building becomes 0.
	@Override
	public void updateWhenAsteroidHits() {
		if (buildingHealth > 0) {
			this.buildingHealth -= 1;
			System.out.println("Asteroid Strike on Building!! Building health: " + buildingHealth );
		}
		if (buildingHealth == 0) {
			parent.Remove(this);
			GameBoard.Instance().DecrementBuildingCount();
			System.out.println("Total building count: " + GameBoard.Instance().GetBuildingCount());
		}
	}

}