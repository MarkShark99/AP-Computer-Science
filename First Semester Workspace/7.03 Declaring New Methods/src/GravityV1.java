/**
PROJECT TITLE: 7.03 Declaring New Methods / GravityV1.java
PURPOSE OF PROJECT: To calculate weight on different planets
VERSION or DATE: 11/14/16
AUTHORS: Mark Washington

**************************** P M R *********************************************

<+s>: Declaring methods was easy
      
<-s>: I wasn't able to declare the PrintWriter as part of the class

           
*******************************************************************************
In the future: Look over the rubric before I write programs
*/

import java.io.PrintWriter;
import java.io.IOException;

public class GravityV1
{	
	//6.67E-17 times the massOfPlanet divided by the radius of the planet squared
	public static double[] calculateGravity(double[] diameter, double[] mass)
	{
		double[] gravity = new double[8];
		for (int x = 0; x < diameter.length; x++)
		{
			gravity[x] = (6.67e-17 * mass[x]) / Math.pow(diameter[x] / 2, 2);
		}
		return gravity;
	}

	public static void printResults(String[] names, double[] diameter, double[] mass, double[] gravity)
	{
		System.out.println("                        Planetary Data");
		System.out.println("  Planet       Diameter (km)      Mass (kg)      g (m/s^2)");
		System.out.println("------------------------------------------------------------");
		for (int x = 0; x < names.length; x++)
		{
			System.out.printf ("  %-7s%15.0f%18.2e%14.2f%n", names[x], diameter[x], mass[x], gravity[x]);
		}
	}

	public static void saveToFile(double[] gravity) throws IOException
	{
		PrintWriter gravityWriter = new PrintWriter("gravity1.txt");
		for (double x : gravity)
		{
			gravityWriter.printf("%5.2f%n", x);
		}
		gravityWriter.close();
	}

	public static void main(String[] args) throws IOException
	{
		String[] planetArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double[] massArray = {3.30e23, 4.869e24, 5.97e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
		double[] diameterArray = {4880.0, 12103.6, 12756, 6794, 142984, 120536, 51118, 49532};		
		double[] gravityArray = new double[9];

		gravityArray = calculateGravity(diameterArray, massArray);
		printResults(planetArray, diameterArray, massArray, gravityArray);
		saveToFile(gravityArray);
	}
}
