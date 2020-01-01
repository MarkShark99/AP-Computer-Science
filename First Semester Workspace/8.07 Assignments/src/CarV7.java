public class CarV7
{
	private String carType; //What kind of car
	private int startMiles, endMiles, distance; //Starting miles, ending miles, distance traveled
	private double gallonsUsed, pricePerGallon, fillupCost, mpg, gpm; //Gallons of fuel used, price per gallon of fuel, cost to fill tank
	
	CarV7() //Default constructor which makes a 2007 saab 9-3
	{
		this.carType = "2007 SAAB 9-3";
	}
	
	CarV7(String carType, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon) //Overloaded constructor with parameters
	{
		this.carType = carType;                                       //The type of car
		this.startMiles = startMiles;                                 //Miles at start
		this.endMiles = endMiles;                                     //Miles at end
		this.distance = endMiles - startMiles;                        //Total distance traveled between start and end
		this.gallonsUsed = gallonsUsed;                               //Number of gallons of fuel used
		this.pricePerGallon = pricePerGallon;                         //$/gal of fuel
		this.fillupCost = (this.pricePerGallon * this.gallonsUsed);   //Cost for one fill-up
		this.mpg = calcMPG(this.distance, this.gallonsUsed);          //Miles per gallon of fuel 
		this.gpm = calcGPM(this.distance);                            //Gallons of fuel used per mile of driving
	}
	
	public int calcDistance(int sMiles, int eMiles) //Calculate distance
	{
		return eMiles - sMiles;
	}
	
	public double calcMPG(int dist, double gals) //Calculate MPG
	{
		return dist / gals;
	}
	
	public double calcGPM(int dist)
	{
		return this.gallonsUsed / dist;
	}
	
	public double totalCost()
	{
		this.fillupCost = this.pricePerGallon * this.gallonsUsed;
		return this.fillupCost;
	}
	public String getCarInfo()
	{
		return this.carType;
	}
	
}
