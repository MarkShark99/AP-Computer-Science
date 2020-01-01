
public class AnnualFuelUse
{
	private int fillNumber, day, startMiles, endMiles;
	private double gallonsUsed, pricePerGallon;
	
	AnnualFuelUse(int fillNumber, int day, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon)
	{
		this.fillNumber = fillNumber;
		this.day = day;
		this.startMiles = startMiles;
		this.endMiles = endMiles;
		this.gallonsUsed = gallonsUsed;
		this.pricePerGallon = pricePerGallon;
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
	
	//total * (365 / (last day))
	public static double getAnnualProjection(int lastDay, double total)
	{
		return total * (365 / lastDay);
	}
}
