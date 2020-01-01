import java.util.ArrayList;

public class CO2FootPrint
{
	private int numPeople;
	private int fillNumber, day, startMiles, endMiles;
	private int numLights;
	
	private boolean paper;
	private boolean plastic;
	private boolean glass;
	private boolean cans;
	
	private double averageBill;
	private double averagePrice;
	private double annualCO2;
	private double gallonsUsed;
	private double pricePerGallon;
	private double grossWasteEmission;
	private double wasteReduction;
	private double netWasteEmission;
	private double bulbReduction;
	private double myGallonsUsed = 0;
	private double myTonsCO2 = 0;
	private double myPoundsCO2 = 0;
		
	CO2FootPrint(double gallons, double averageBill, double averagePricePerKWH, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numLights)
	{
		
		this.numPeople = numPeople;
		this.paper = paper;
		this.plastic = plastic;
		this.glass = glass;
		this.cans = cans;
		this.averageBill = averageBill;
		this.averagePrice = averagePricePerKWH;
		this.numLights = numLights;
		this.myGallonsUsed = gallons;
		calcGrossWasteEmission();
		calcElectricityCO2(this.averageBill, this.averagePrice);
		calcWasteReduction();
		calcNetWasteReduction();
		calcTonsCO2();
		this.myPoundsCO2 =  this.myTonsCO2 * 2000;
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
	public int getFill()
	{
		return this.fillNumber;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public int getStartMiles()
	{
		return this.startMiles;
	}
	
	public int getEndMiles()
	{
		return this.endMiles;
	}
	
	public double getGallonsUsed()
	{
		return this.gallonsUsed;
	}
	
	public double getPricePerGallon()
	{
		return this.pricePerGallon;
	}
	
	public int getDistance()
	{
		return this.endMiles - this.startMiles;
	}
	
	public double getMPG()
	{
		return getDistance() / this.gallonsUsed;
	}
	
	public double getTotalCost()
	{
		return this.gallonsUsed * this.pricePerGallon;
	}
	
	public double getAverageBill()
	{
		return this.averageBill;
	}
	
	public double getAveragePrice()
	{
		return this.averagePrice;
	}
	
	//total * (365 / (last day))
	public static double getAnnualProjection(int lastDay, double total)
	{
		return total * (365 / lastDay);
	}

	double calcAverageBill(ArrayList<Double> monthlyBill)
	{
		double total = 0;
		
		for (double bill : monthlyBill)
		{
			total += bill;
		}
		this.averageBill = total / monthlyBill.size();
		return this.averageBill;
	}
	
	double calcAveragePrice(ArrayList<Double> monthlyPrice)
	{
		double total = 0;
		
		for (double price : monthlyPrice)
		{
			total += price;
		}
		this.averagePrice = total / monthlyPrice.size();
		return this.averagePrice;
	}

	double calcElectricityCO2(double avgBill, double avgPrice)
	{
		this.annualCO2 = (avgBill / avgPrice) * 1.37 * 12;
		return this.annualCO2;
	}
	
	double getBulbReduction()
	{
		return this.numLights * 1.37 * 73;
	}

	void calcTonsCO2()
	{
		this.myTonsCO2 = 8.78e-3 * this.myGallonsUsed;
	}

	void convertTonsToPoundsCO2()
	{
		this.myPoundsCO2 =  this.myTonsCO2 * 2000;
	}
	
	double getTonsCO2()
	{
		return this.myTonsCO2;
	}
	
	double getPoundsCO2()
	{
		return this.myPoundsCO2;
	}
}
