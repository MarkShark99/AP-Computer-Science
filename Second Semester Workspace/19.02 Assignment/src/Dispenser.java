public class Dispenser
{
	private int numberOfItems;
	private int cost;
	
	public Dispenser()
	{
		this.numberOfItems = 50;
		this.cost = 50;
	}
	
	public Dispenser(int numberOfItems, int cost)
	{
		if (numberOfItems > 0 && cost > 0)
		{
			this.numberOfItems = numberOfItems;
			this.cost = cost;
		}
		else
		{
			throw new IllegalArgumentException("A dispenser must have more than 0 items or a cost greater than 0");
		}
	}
	
	public int getCount()
	{
		return numberOfItems;
	}
	
	public int getProductCost()
	{
		return this.cost;
	}
	
	public void makeSale()
	{
		if (this.numberOfItems > 0)
		{
			this.numberOfItems--;
		}
		else
		{
			throw new RuntimeException("Dispenser is empty");
		}
	}
	
}