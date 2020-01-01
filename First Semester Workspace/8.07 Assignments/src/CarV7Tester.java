/**
PROJECT TITLE: 08.07 Assignment / CarV7Tester.java and CarV7.java
PURPOSE OF PROJECT: To practice using multiple classes
VERSION or DATE: 12/9/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using multiple classes was easy
      
<-s>: I couldn't access the private variables since I wasn't inside the class anymore

           
*******************************************************************************
In the future: Document the code more
*/

public class CarV7Tester
{
	public static void main(String[] args) //Main function
	{		
		String carType1 = "07 SAAB 9-3";
		int startMiles1 = 91265;
		int endMiles1 = 91611;
		double gallons1 = 15.94;
		double pricePerGallon1 = 2.28;
		CarV7 car1 = new CarV7(carType1, startMiles1, endMiles1, gallons1, pricePerGallon1);
		int distance1 = car1.calcDistance(startMiles1, endMiles1);
		double mpg1 = car1.calcMPG(distance1, gallons1);
		double gpm1 = car1.calcGPM(distance1);
		double totalCost1 = car1.totalCost();
		
		String carType2 = "91 Honda CR-X";
		int startMiles2 = 199750;
		int endMiles2 = 200178;
		double gallons2 = 10.4;
		double pricePerGallon2 = 2.18;
		CarV7 car2 = new CarV7(carType2, startMiles2, endMiles2, gallons2, pricePerGallon2);
		int distance2 = car2.calcDistance(startMiles2, endMiles2);
		double mpg2 = car2.calcMPG(distance2, gallons2);
		double gpm2 = car2.calcGPM(distance2);
		double totalCost2 = car2.totalCost();
		
		String carType3 = "2004 GMC Envoy";
		int startMiles3 = 101106;
		int endMiles3 = 101396;
		double gallons3 = 20.3;
		double pricePerGallon3 = 2.24;
		CarV7 car3 = new CarV7(carType3, startMiles3, endMiles3, gallons3, pricePerGallon3);
		int distance3 = car1.calcDistance(startMiles3, endMiles3);
		double mpg3 = car3.calcMPG(distance3, gallons3);
		double gpm3 = car3.calcGPM(distance1);
		double totalCost3 = car3.totalCost();
		
		System.out.println("                                       Gas Mileage Calculations");
		System.out.println("Type of Car     Start Miles    End Miles    Distance    Gallons   Price    Cost    Miles/Gal   Gal/Mile");
		System.out.println("=======================================================================================================");
		System.out.printf("%-16s%9d  %11d  %11d %10.1f%9.2f %8.2f%10.1f%12.3f%n", carType1, startMiles1, endMiles1, distance1, gallons1, pricePerGallon1, totalCost1, mpg1, gpm1);
		System.out.printf("%-16s%9d  %11d  %11d %10.1f%9.2f %8.2f%10.1f%12.3f%n", carType2, startMiles2, endMiles2, distance2, gallons2, pricePerGallon2, totalCost2, mpg2, gpm2);
		System.out.printf("%-16s%9d  %11d  %11d %10.1f%9.2f %8.2f%10.1f%12.3f", carType3, startMiles3, endMiles3, distance3, gallons3, pricePerGallon3, totalCost3, mpg3, gpm3);
	
	}
}
