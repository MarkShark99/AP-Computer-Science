/**
PROJECT TITLE: Basal Metabolic Rate / BMR.java
PURPOSE OF PROJECT: To calculate someone's BMR
VERSION or DATE: 9/25/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: If-else statements were easy to use
      
<-s>: I was trying to compare strings using == when I should have used String.equals()

           
*******************************************************************************
In the future: Remember to compare strings with the dedicated function
*/

import java.util.Scanner;

public class BMR
{
	public static void main(String[] args)
	{
		final double cmConversionFactor = 0.393701;
		final double kgConversionFactor = 2.20462;
		
		//Declare strings
		String name;
		String gender;
		String stringAge;
		String stringHeight;
		String stringWeight;
				
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = mScanner.nextLine();
		System.out.print("Gender (M or F): ");
		gender  = mScanner.nextLine();
		System.out.print("Enter your age: ");
		stringAge = mScanner.nextLine();
		System.out.print("Enter your height (in inches): ");
		stringHeight = mScanner.nextLine();
		System.out.print("Enter your weight (in pounds): ");
		stringWeight = mScanner.nextLine();
		
		//Parse weight, height, and age from strings
		double height = Double.parseDouble(stringHeight);
		double weight = Double.parseDouble(stringWeight);
		int age = Integer.parseInt(stringAge);
		
		//Do conversions
		double heightInCm = height / cmConversionFactor;
		double weightInKg = weight / kgConversionFactor;
		
		//Print information
		System.out.println("\n\nCalculate your basal metabolism\n");
		System.out.println("Name:        " + name);
		System.out.println("Gender:      " + gender);
		System.out.println("Weight (kg): " + (double)(Math.round(weightInKg * Math.pow(10, 2)) / Math.pow(10, 2)));
		System.out.println("Height (cm): " + (double)(Math.round(heightInCm * Math.pow(10, 2)) / Math.pow(10, 2)));
		
		double BMR = 0.0;
		
		if (gender.equals("M") == true) //If person is male
		{
			System.out.println("Male");
			BMR = (13.397 * weightInKg) + (4.799 * heightInCm) + (5.677 * age) + 88.362;
			System.out.println("Your BMR is " + (double)(Math.round(BMR * Math.pow(10, 1)) / Math.pow(10, 1)) + " calories per day."); //Output BMR formatted to 1 decimal

		}
		else if (gender.equals("F") == true) //if person is not male but is female
		{
			System.out.println("Female");
			BMR = (9.247 * weightInKg) + (3.098 * heightInCm) + (4.330 * age) + 88.362;
			System.out.println("Your BMR is " + (double)(Math.round(BMR * Math.pow(10, 1)) / Math.pow(10, 1)) + " calories per day."); //Output BMR formatted to 1 decimal
		}
		else //something else is entered that isn't M or F
		{
			System.out.println("Error calculating BMR");
		}
		mScanner.close();
	}
}
