
public class CO2FromWaste
{
	private int numPeople;
	
	private boolean paper;
	private boolean plastic;
	private boolean glass;
	private boolean cans;
	
	private double grossWasteEmission;
	private double wasteReduction;
	private double netWasteEmission;
	
	CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
	{
		this.numPeople = numPeople;
		this.paper = paper;
		this.plastic = plastic;
		this.glass = glass;
		this.cans = cans;
	}
	
	public int getNumPeople()
	{
		return this.numPeople;
	}
	
	public boolean getPaper()
	{
		return this.paper;
	}
	
	public boolean getPlastic()
	{
		return this.plastic;
	}
	
	public boolean getGlass()
	{
		return this.glass;
	}
	
	public boolean getCans()
	{
		return this.cans;
	}
	
	
	public void calcGrossWasteEmission()
	{
		this.grossWasteEmission = (this.numPeople * 1018);
	}
	
	public void calcWasteReduction()
	{
		this.wasteReduction = 0;
		
		if (this.paper)
			this.wasteReduction += (this.numPeople * 184);
		if (this.plastic)
			this.wasteReduction += (this.numPeople * 25.6);
		if (this.glass)
			this.wasteReduction += (this.numPeople * 46.6);
		if (this.cans)
			this.wasteReduction += (this.numPeople * 165.8);
	}
	
	public void calcNetWasteReduction()
	{
		this.netWasteEmission = getGrossWasteEmission() - getWasteReduction();
	}
	
	public double getGrossWasteEmission()
	{
		calcGrossWasteEmission();
		return this.grossWasteEmission;
	}
	
	public double getWasteReduction()
	{
		calcWasteReduction();
		return this.wasteReduction;
	}
	
	public double getNetWasteReduction()
	{
		calcNetWasteReduction();
		return this.netWasteEmission;
	}
}
