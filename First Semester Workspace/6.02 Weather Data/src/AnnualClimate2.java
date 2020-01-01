/**
PROJECT TITLE: Weather Data 2 / AnnualClimate2.java
PURPOSE OF PROJECT: To practice formatting data
VERSION or DATE: 10/26/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using arrays was very easy, though I prefer ArrayLists because they are dynamic
      
<-s>: Using the formatting codes for printf was a bit confusing at first

           
*******************************************************************************
In the future: Save the documentation for printf on Oracle's website for use in future programs
*/

import java.util.Scanner;

public class AnnualClimate2
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String[] monthArray = new String[]{"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};

		String city = "Orlando, Florida";
		double[] temperatureArray = new double[]{60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
		double[] precipitationArray = new double[]{2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};

		//		String city = "Miami, Florida";
		//		double[] temperatureArray = new double[]{68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};
		//		double[] precipitationArray = new double[]{1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};

		String temperatureUnit = "";
		String lengthUnit = "";

		int mode = 0;
		double temperatureTotal = 0.0;
		double precipitationTotal = 0.0;
		double averageTemperature = 0.0;
		double averagePrecipitation = 0.0;
		while(mode < 1 || mode > 2)
		{
			System.out.println("1) Fahrenheit and Inches");
			System.out.println("2) Celsius and Centimeters");
			System.out.print("Select a mode: ");
			mode = mScanner.nextInt();
			System.out.println("\n\n");
		}
		if (mode == 1)
		{
			temperatureUnit = "F";
			lengthUnit = "in.";
		}
		else if (mode == 2)
		{
			temperatureUnit = "C";
			lengthUnit = "cm.";
		}
		else 
		{
			System.out.println("Error");
		}
		System.out.println("                   Climate Data");
		System.out.println("           Location: " + city + "\n");
		System.out.println("Month      Temperature (" + temperatureUnit + ")    Precipitation (" + lengthUnit + ")");
		System.out.println("*************************************************");

		for (int i = 0; i < 12; i++)
		{
			System.out.print(" " + monthArray[i]);

			//System.out.println(i);
			if (mode == 1)
			{
				temperatureTotal += temperatureArray[i];
				precipitationTotal += precipitationArray[i];
				System.out.printf("          %-11.1f           %3.1f%n", temperatureArray[i], precipitationArray[i]);
			}

			else if (mode == 2)
			{
				temperatureTotal += ((temperatureArray[i] - 32) * 5 / 9);
				precipitationTotal += precipitationArray[i] * 2.54;
				System.out.printf("          %-11.1f           %3.1f%n", ((temperatureArray[i] - 32) * 5 / 9), precipitationArray[i] * 2.54);

			}
		}
		averageTemperature = temperatureTotal / temperatureArray.length;
		averagePrecipitation = precipitationTotal / precipitationArray.length;
		System.out.println("*************************************************\n");
		System.out.printf("      Average: %-14.1fAnnual: %.1f", averageTemperature, averagePrecipitation);
		mScanner.close();
	}
}
