
public class Tool implements Product, Comparable<Tool>
{
	private String name;
	private double cost;
	public Tool(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int compareTo(Tool t)
	{
		if (this.getCost() < t.getCost())
		{
			return 0;
		}
		else if (this.getCost() == t.getCost())
		{
			return 1;
		}
		else if (this.getCost() > t.getCost())
		{
			return 2;
		}
		else return -1;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public double getCost()
	{
		return this.cost;
	}
	
}
