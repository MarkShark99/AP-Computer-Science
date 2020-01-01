/**
PROJECT TITLE: Hurricane Data / Hurricans2.java
PURPOSE OF PROJECT: To organize information about hurricanes
VERSION or DATE: 11/10/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Formatting and splitting the arrays was easy
      
<-s>: I couldn't use the split() method for strings because of the additional spaces on some lines

           
*******************************************************************************
In the future: Plan out the program before I write it so it's less confusing
*/

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hurricanes2
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("hurcdata2.txt");
		Scanner inputFile = new Scanner(file);
		PrintWriter mPrintWriter = new PrintWriter("Summary.txt");
		
		int[] yearArray = new int[59];
		String[] monthArray = new String[59];
		int[] pressureArray = new int[59];
		int[] windSpeedArray = new int[59];
		String[] nameArray = new String[59];
		int[] categoryArray = new int[59];
		String currentLine = "";
		int currentCategory = 0;
		int totalCategories = 0;
		int[] categoryTotals = new int[5];
		
		int categoryMax = 0;
		int categoryMin = 0;
		int categoryAvg = 0;
		int pressureTotal = 0;
		int pressureMax = 0;
		int pressureMin = 0;
		int pressureAvg = 0;
		int windSpeedTotal = 0;
		int windSpeedMax = 0;
		int windSpeedMin = 0;
		int windSpeedAvg = 0;
		
		for (int l = 0; l < 59; l++)
		{
			currentLine = inputFile.nextLine();
			//System.out.println(currentLine);
			yearArray[l] = Integer.parseInt(currentLine.substring(0, 4));
			monthArray[l] = currentLine.substring(5, 8);
			pressureArray[l] = Integer.parseInt(currentLine.substring(9, 13).replace("\t", "").replace(" ", ""));
			windSpeedArray[l] = (int)((Integer.parseInt(currentLine.substring(13, 16).replace("\t", "").replace(" ", ""))) * 1.15078);
			nameArray[l] = currentLine.substring(16).replace("\t", "");
			//System.out.println(l + " " + yearArray[l] + " " + monthArray[l] + " " + pressureArray[l] + " " + windSpeedArray[l] + " " + nameArray[l]);
		}
		System.out.println("                      Hurricanes 1980 - 2006\n");
		System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
		System.out.println("=====================================================================");
		for (int i = 0; i < 59; i++)
		{
			if (windSpeedArray[i] >= 74 && windSpeedArray[i] <= 95)
			{
				currentCategory = 1;
				categoryTotals[currentCategory - 1] += currentCategory;
			}
			else if (windSpeedArray[i] >= 96 && windSpeedArray[i] <= 110)
			{
				currentCategory = 2;
				categoryTotals[currentCategory - 1] += currentCategory;
			}
			else if (windSpeedArray[i] >= 111 && windSpeedArray[i] <= 129)
			{
				currentCategory = 3;
				categoryTotals[currentCategory - 1] += currentCategory;
			}
			else if (windSpeedArray[i] >= 130 && windSpeedArray[i] <= 156)
			{
				currentCategory = 4;
				categoryTotals[currentCategory - 1] += currentCategory;
			}
			else if (windSpeedArray[i] >= 157)
			{
				currentCategory = 5;
				categoryTotals[currentCategory - 1] += currentCategory;
			}
			categoryArray[i] = currentCategory;
			System.out.printf("%-10d%-16s%-13d%-18d%4d%n", yearArray[i], nameArray[i], currentCategory, pressureArray[i], windSpeedArray[i]);
		}
		for (int i : categoryTotals) //Add up categories
		{
			//System.out.println(i);
			totalCategories += i;
		}
		categoryAvg = totalCategories / 59; 
		
		//Category min and max********
		Integer min = Integer.MAX_VALUE;
		for (int i : categoryArray)
		{
			if (i < min)
			{
				min = i;
			}
		}
		categoryMin = min;
		
		Integer max = Integer.MIN_VALUE;
		for (int i : categoryArray)
		{
			if (i > max)
			{
				max = i;
			}
		}
		categoryMax = max;
		
		//Pressure min and max********
		min = Integer.MAX_VALUE;
		for (int i : pressureArray)
		{
			if (i < min)
			{
				min = i;
			}
		}
		pressureMin = min;
		
		max = Integer.MIN_VALUE;
		for (int i : pressureArray)
		{
			if (i > max)
			{
				max = i;
			}
		}
		pressureMax = max;
				
		//Wind speed min and max********
		min = Integer.MAX_VALUE;
		for (int i : windSpeedArray)
		{
			if (i < min)
			{
				min = i;
			}
		}
		windSpeedMin = min;
		
		max = Integer.MIN_VALUE;
		for (int i : windSpeedArray)
		{
			if (i > max)
			{
				max = i;
			}
		}
		windSpeedMax = max;
		
		
		for (int i : windSpeedArray) //Find the average wind speed
		{
			//System.out.println(i);
			windSpeedTotal += i;
		}
		windSpeedAvg = windSpeedTotal / 59;
		for (int i : pressureArray) //Find the average pressure
		{
			//System.out.println(i);
			pressureTotal += i;
		}
		pressureAvg = pressureTotal / 59;
		System.out.println("=====================================================================");
		System.out.printf("%-26s%-12d%4d                %3d%n", "Average", categoryAvg, pressureAvg, windSpeedAvg);
		System.out.printf("%-26s%-12d%4d                %3d%n", "Maximum", categoryMax, pressureMax, windSpeedMax);
		System.out.printf("%-26s%-12d%4d                %3d%n%n", "Maximum", categoryMin, pressureMin, windSpeedMin);
		System.out.println("Number of Category 1: " + categoryTotals[0] / 1);
		System.out.println("Number of Category 2: " + categoryTotals[1] / 2);
		System.out.println("Number of Category 3: " + categoryTotals[2] / 3);
		System.out.println("Number of Category 4: " + categoryTotals[3] / 4);
		System.out.println("Number of Category 5: " + categoryTotals[4] / 5);
		mPrintWriter.println("Summary");
		mPrintWriter.println("              Category     Pressure (mb)     Wind Speed (mph)");
		mPrintWriter.printf("%-18s%-11d%5d                %3d%n", "Average", categoryAvg, pressureAvg, windSpeedAvg);
		mPrintWriter.printf("%-18s%-11d%5d                %3d%n", "Maximum", categoryMax, pressureMax, windSpeedMax);
		mPrintWriter.printf("%-18s%-11d%5d                %3d%n", "Minimum", categoryMin, pressureMin, windSpeedMin);

		mPrintWriter.close();
	}
}
