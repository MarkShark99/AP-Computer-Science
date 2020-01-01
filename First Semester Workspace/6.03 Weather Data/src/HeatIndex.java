/**
PROJECT TITLE: 6.03 Weather Data / HeatIndex.java
PURPOSE OF PROJECT: To calculate the heat index of the various months in a certain area
VERSION or DATE: 11/3/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: The for-each statements were easy to use
      
<-s>: It was strange at first to use the java syntax for the for each loop since I'm used to python's syntax for it

           
*******************************************************************************
In the future: Use the grid to write out how I'm going to align text
*/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class HeatIndex
{
	public static void main(String[] args) throws IOException
	{
		double tempAvg = 0.0;
		double humidAvg = 0.0;
		double HIAvg = 0.0;

		String currentLineString = "";
		File keyWestHumidFile = new File("KeyWestHumid.txt");
		File keyWestTempFile = new File("KeyWestTemp.txt");
		Scanner humidScanner = new Scanner(keyWestHumidFile);
		Scanner tempScanner = new Scanner(keyWestTempFile);
		PrintWriter mPrintWriter = new PrintWriter("HeatIndex.txt");

		currentLineString = humidScanner.nextLine();
		String[] humidArray = currentLineString.split(" "); //Split the lines in the humidity file at each space into an array
		currentLineString = tempScanner.nextLine();
		String[] tempArray = currentLineString.split("   ");

		String[] monthArray = new String[]{" Jan", " Feb", " Mar", " Apr", " May", " Jun", " Jul", " Aug", " Sep", " Oct", " Nov", " Dec"};
		System.out.print("              ");
		for (String index : monthArray) //Loop to print months
		{
			System.out.printf("%-6s", index);
		}
		System.out.println("Avg");
		System.out.println("******************************************************************************************");
		System.out.print("Temp (F)      ");
		for (String index : tempArray) //Loop to print the temperatures
		{
			System.out.printf("%-6.1f", Double.parseDouble(index));
			tempAvg += Double.parseDouble(index); //Add current month's temperature to the total
		}
		tempAvg /= tempArray.length; //Calculate average temp
		System.out.printf("%3.1f%n", tempAvg);
		System.out.print("Humidity (%)");
		for (String index : humidArray)
		{
			System.out.print("    " + index);
			humidAvg += (double)(Integer.parseInt(index));
		}
		humidAvg /= (double)(humidArray.length);
		System.out.printf("  %3.1f%n", humidAvg);
		System.out.print("HI (F)        ");
		for (int i = 0; i < tempArray.length; i++) //Loop to print the heat index for each column
		{
			double currentHI;
			currentHI = calculateHeatIndex(Double.parseDouble(tempArray[i]), Double.parseDouble(humidArray[i]));
			System.out.printf("%-6.1f", currentHI);
			mPrintWriter.printf("%-4.1f ", currentHI);
			HIAvg += currentHI;
		}
		HIAvg /= tempArray.length; //Divide the heat index total by the number of months to get the average 
		System.out.printf("%-3.1f", HIAvg);
		//mPrintWriter.printf("%-4.1f", HIAvg); //Uncomment this to print the average to the file
		humidScanner.close(); //Close the scanner for humidity
		tempScanner.close(); //Close the scanner for temperature
		mPrintWriter.close(); //Close the PrintWriter for the output file
	}

	public static double calculateHeatIndex(double temp, double humidity) //A function to calculate the heat index
	{
		double HI = 0.0;
		if (temp > 80.0)
		{
			HI = (-42.379 + (2.04901523 * temp) + (10.14333127 * humidity) - (0.22475541 * temp * humidity) - (6.83783 * Math.pow(10, -3) * Math.pow(temp, 2)) - (5.481717 * Math.pow(10, -2) * Math.pow(humidity, 2)) + (1.22874 * Math.pow(10, -3) * Math.pow(temp, 2) * humidity) + (8.5282 * Math.pow(10, -4) * temp * Math.pow(humidity, 2)) - (1.99 * Math.pow(10, -6) * Math.pow(temp, 2) * Math.pow(humidity, 2)));
		}
		else
		{
			HI = temp;
		}
		return HI;
	}
}
