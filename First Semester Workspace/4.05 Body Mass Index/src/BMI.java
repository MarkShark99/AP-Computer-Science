/**
PROJECT TITLE: Body Mass Index / BMI.java
PURPOSE OF PROJECT: to calculate someone's BMI
VERSION or DATE: 9/25/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: The if-else statements made it easy to determine the category
      
<-s>: Separating the name and height using substring() wasn't as neat as using arrays

           
*******************************************************************************
In the future: Make code look neater
*/

import java.util.Scanner;

public class BMI
{
	public static void main(String[] args)
	{
		final double metersConversionFactor = 0.3048;
		final double kilogramsConversionFactor = 0.453592;
		
		Scanner mScanner = new Scanner(System.in);
		
		System.out.print("Enter your name (first last): ");
		String fullName = mScanner.nextLine();
		String[] splitName = fullName.split(" ");
		String firstName = splitName[0];
		String lastName = splitName[1]; //Splitting strings the easy way
		
		//The hard way
		//String firstName = fullName.substring(0, fullName.indexOf(" ")); //Splitting strings the hard way
		//String lastName = fullName.substring(fullName.indexOf(" "), fullName.length());
		
		System.out.print("Enter your weight in pounds (e.g. 153): ");
		int weight = Integer.parseInt(mScanner.nextLine());
		
		System.out.print("Enter you height in feet and inches (e.g. 5 11)");
		String height = mScanner.nextLine();
		String[] splitHeight = height.split(" ");
		double heightFeet = (double)Integer.parseInt(splitHeight[0]);
		double heightInches = (double)Integer.parseInt(splitHeight[1]);

		double totalHeight = heightFeet + (heightInches / 12.0);
		
		double heightMeters = totalHeight * metersConversionFactor;
		double weightKg = weight * kilogramsConversionFactor;
		
		double BMI = weightKg / Math.pow(heightMeters, 2);
		
		System.out.println("\nBody Mass Index Calculator");
		System.out.println("==========================");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Height: " + (double)(Math.round(heightMeters * Math.pow(10, 1)) / Math.pow(10, 1)) + " meters");
		System.out.println("Weight: " + (double)(Math.round(weightKg * Math.pow(10, 1)) / Math.pow(10, 1)) + " kg");
		System.out.println("BMI: " + (double)(Math.round(BMI * Math.pow(10, 1)) / Math.pow(10, 1)));
		
		String category = "";
		//Find the category
		if (BMI < 18.5)
		{
			category = "Underweight";
		}
		else if (BMI >= 18.5 && BMI <= 24.9)
		{
			category = "Normal";
		}
		else if (BMI >= 25.0 && BMI <= 29.9)
		{
			category = "Overweight";
		}
		else if (BMI > 30.0)
		{
			category = "Obese";
		}
		System.out.println("Category: " + category);
		mScanner.close();
	}
}
