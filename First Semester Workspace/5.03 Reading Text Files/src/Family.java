/**
PROJECT TITLE: File Input / Family.java
PURPOSE OF PROJECT: To calculate percentages that are too big to do by hand
VERSION or DATE: 10/4/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Reading files was easy
      
<-s>: Running the project in eclipse couldn't find the file, but it worked when I ran it from cmd

           
*******************************************************************************
In the future: Make sure files are in the right place to be read
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
	public static void main(String[] args) throws IOException
	{
		String token = "";
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter the name of the file to be read (Ex: file.txt): ");
		String fileName = mScanner.nextLine();
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		int oneBoyOneGirl = 0;
		int twoBoys = 0;
		int twoGirls = 0;
		int total = 0;
		
		while (inputFile.hasNext())
		{
			token = inputFile.next();
			if (token.equals("GB") || token.equals("BG")) //Check if family has one boy and one girl
			{
				oneBoyOneGirl++;
			}
			else if (token.equals("BB")) //Check if family has two boys
			{
				twoBoys++;
			}
			else if (token.equals("GG")) //Check if family has two girls
			{
				twoGirls++;
			}
			System.out.println(token);
			//System.out.println("" + oneBoyOneGirl + "\t" + twoBoys + "\t" + twoGirls); //For debugging
			total++;
		}
		
		double averageOfOneBoyOneGirl = roundToPlace((oneBoyOneGirl / (double)total) * Math.pow(10, 2), 2); //Round to two decimal places and multiply the value so it's readable
		double averageOfTwoBoys = roundToPlace((twoBoys / (double)total) * Math.pow(10, 2), 2);
		double averageOfTwoGirls = roundToPlace((twoGirls / (double)total) * Math.pow(10, 2), 2);
		
		System.out.println("Sample Size: " + total);
		System.out.println("Percentage of families with one boy and one girl: " + averageOfOneBoyOneGirl + "%");
		System.out.println("Percentage of families with two boys:             " + averageOfTwoBoys + "%");
		System.out.println("Percentage of families with two girls:            " + averageOfTwoGirls + "%");
		
		inputFile.close();
		mScanner.close();
	}
	
	public static double roundToPlace(double a, int d)
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
