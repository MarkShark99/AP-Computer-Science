/**
PROJECT TITLE: 7.06 Challenge Program / Darts.java
PURPOSE OF PROJECT: To estimate the value of pi using a dartboard
VERSION or DATE: 11/18/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Checking to see if the attempt was a hit or a miss was easy
      
<-s>: The output number wasn't being calculated at first for some reason

           
*******************************************************************************
In the future: Make sure the output looks correct
*/

import java.util.Scanner;

public class Darts
{
	public static double x = (2 * Math.random()) - 1;
	public static double y = (2 * Math.random()) - 1;
	
	public static int getHits(int trials) //Get the number of hits in the given number of trials
	{
		int hits = 0;
		for (int i = 0; i < trials; i++)
		{
			x = (2 * Math.random()) - 1;
			y = (2 * Math.random()) - 1;
			if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
			{
				hits++;
			}
		}
		return hits;
	}
	
	public static double getPi(int hits, int dartsThrown) //Get pi given the number of hits and the number of darts thrown
	{
		double pi = (4 * ((double)(hits)) / dartsThrown);
		return pi;
	}
	
	public static void main(String[] args) //Main method
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("How many darts should be thrown for each trial? ");
		int dartsPerTrial = mScanner.nextInt();
		System.out.print("How many trials should be done? ");
		int numberOfTrials = mScanner.nextInt();
		double[] trialsArray = new double[numberOfTrials];
		double piTotal = 0.0;
		for (int i = 0; i < numberOfTrials; i++)
		{
			int hits = getHits(dartsPerTrial);
			double pi = getPi(hits, dartsPerTrial);
			trialsArray[i] = pi;
			System.out.printf("Trial [ " + i + "]: pi = %8f%n", pi);
		}
		for (double d : trialsArray)
		{
			piTotal += d;
		}
		double average = (piTotal / numberOfTrials);
		System.out.printf("Estimate of pi = %8f%n", average);
		mScanner.close();
	}
}
