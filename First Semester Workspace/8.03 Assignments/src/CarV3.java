/**
PROJECT TITLE: 08.03 Assignments / CarV3.java
PURPOSE OF PROJECT: To learn OOP
VERSION or DATE: 12/5/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Making the class and its constructor was easy
      The "this" keyword made my code more readable

<-s>: I was having an issue because I was accidentally calling methods statically

           
*******************************************************************************
In the future: Practice OOP more
*/

public class CarV3 
{
	public String make; //Who made the car
	public String model; //What model
	public String color; //Color
	public int year; //Year
	
	CarV3() //Default constructor which makes a 2007 saab 9-3
	{
		this.make = "SAAB";
		this.model = "9-3";
		this.color = "White";
		this.year = 2007;
	}
	//For later
	/*	
	CarV3(String make, String model, String color, int year)
	{
		this.make = make;
		this.model = "9-3";
		this.color = "White";
		this.year = 2007;
	}
	 */
	
	public int calcDistance(int sMiles, int eMiles) //Calculate distance
	{
		return eMiles - sMiles;
	}
	
	public double calcMpg(int dist, double gals) //Calculate MPG
	{
		return dist / gals;
	}
	
	public static void main(String[] args) //Main function
	{		
		CarV3 car1 = new CarV3();
		
		String yearMakeModel = car1.year + " " + car1.make + " " + car1.model;
		int startMiles1 = 91265;
		int endMiles1 = 91611;
		double gallons1 = 15.94;
		int distance1 = car1.calcDistance(startMiles1, endMiles1);
		double mpg1 = car1.calcMpg(distance1, gallons1);
		
		System.out.println("                         Gas Mileage Calculations");
		System.out.println("Type of Car     Start Miles    End Miles    Distance    Gallons    Miles/Gal");
		System.out.println("============================================================================");
		System.out.printf("%-16s%10d %12d     %7d %10.2f %11.1f", yearMakeModel, startMiles1, endMiles1, distance1, gallons1, mpg1);
	}
}
