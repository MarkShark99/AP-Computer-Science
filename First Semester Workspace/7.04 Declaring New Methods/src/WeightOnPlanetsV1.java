/**
PROJECT TITLE: 7.03 Declaring New Methods / WeightOnPlanetsV1.java
PURPOSE OF PROJECT: To calculate a person's weight on each planet in the solar system
VERSION or DATE: 11/16/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Making the methods was easy, and now I know you can use arrays as a return type
      
<-s>: My calculations were rounded up compared to the ones in the assignment instructions

           
*******************************************************************************
In the future: Make neater code by planning out how things are gonna work
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WeightOnPlanetsV1
{	
	public static void main(String[] args) throws IOException
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("What is your weight on Earth? ");
		double weight = Double.parseDouble(mScanner.nextLine());
		String[] planetArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double[] gravityArray = getGravity();
		double[] weightArray = calculateWeight(weight, gravityArray);
		printResults(planetArray, gravityArray, weightArray);
		writeToFile(weightArray);
		mScanner.close();
	}
	public static double[] getGravity() throws IOException //Calculates gravity
	{
		double[] originalGravity = readFromFile();
		double[] correctGravity = new double[originalGravity.length];
		
		for (int x = 0; x < originalGravity.length; x++)
		{
			correctGravity[x] = originalGravity[x] * 10e-2;
		}
		
		return correctGravity;
	}
	
	public static double[] readFromFile() throws IOException //Method to read gravity data in from file
	{
		File gravityFile = new File("gravity1.txt");
		Scanner mScanner = new Scanner(gravityFile);
		double[] lines = new double[8];
		
		for (int x = 0; mScanner.hasNext(); x++)
		{
			lines[x] = Double.parseDouble(mScanner.next());
		}
		
		mScanner.close();
		return lines;
	}
	
	public static void writeToFile(double[] weights) throws IOException //Method to save the calculated weights to a file
	{
		PrintWriter mPrintWriter = new PrintWriter("weights.txt");
		
		for (double x : weights)
		{
			mPrintWriter.printf("%.2f%n", x);
		}
		
		mPrintWriter.close();
	}
	
	public static void printResults(String[] planets, double[] gravity, double[] weights) //Method to print results
	{
		System.out.println("         My Weight on the Planets");
		System.out.println("   Planet        Gravity     Weight(lbs)");
		System.out.println("----------------------------------------");
		
		for (int x = 0; x < planets.length; x++)
		{
			System.out.printf("   %7s%13.2f%14.2f%n", planets[x], gravity[x], weights[x]);
		}
	}
	
	public static double[] calculateWeight(double weight, double[] gravity)
	{
		double[] weightArray = new double[8];
		gravity[2] = 1.0;
		for(int x = 0; x < weightArray.length; x++)
		{
			weightArray[x] = gravity[x] * weight;
		}
		return weightArray;
	}
	
	public static double round(double a, int d)
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
