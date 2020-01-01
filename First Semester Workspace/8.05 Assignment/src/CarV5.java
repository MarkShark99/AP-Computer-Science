/**
PROJECT TITLE: CarV5.java
PURPOSE OF PROJECT: To enhance the CarV3 class with a constructor with parameters
VERSION or DATE: 12/8/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Making a new constructor was easy
      
<-s>: Eclipse was giving me an error with the constructor with arguments

           
*******************************************************************************
In the future: Add more comments while writing
*/

public class CarV5
{
	private String carType; //What kind of car
	private int startMiles, endMiles, distance; //Starting miles, ending miles, distance traveled
	private double gallonsUsed, pricePerGallon, fillupCost, mpg, gpm; //Gallons of fuel used, price per gallon of fuel, cost to fill tank
	
	CarV5() //Default constructor which makes a 2007 saab 9-3
	{
		this.carType = "2007 SAAB 9-3";
	}
	
	CarV5(String carType, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon) //Overloaded constructor with parameters
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
	
	public static void main(String[] args) //Main function
	{		
		String carType1 = "2007 SAAB 9-3";
		int startMiles1 = 91265;
		int endMiles1 = 91611;
		double gallons1 = 15.94;
		double pricePerGallon1 = 2.28;
		CarV5 car1 = new CarV5(carType1, startMiles1, endMiles1, gallons1, pricePerGallon1);
		int distance1 = car1.calcDistance(startMiles1, endMiles1);
		double mpg1 = car1.calcMPG(car1.distance, gallons1);
		double gpm1 = car1.calcGPM(car1.distance);
		double totalCost1 = car1.totalCost();
		
		System.out.println("                                       Gas Mileage Calculations");
		System.out.println("Type of Car     Start Miles    End Miles    Distance    Gallons   Price    Cost    Miles/Gal   Gal/Mile");
		System.out.println("=======================================================================================================");
		System.out.printf("%-16s%9d  %11d  %11d %10.1f%9.2f %8.2f%10.1f%12.3f", car1.carType, startMiles1, endMiles1, distance1, gallons1, pricePerGallon1, totalCost1, mpg1, gpm1);
	}
}
