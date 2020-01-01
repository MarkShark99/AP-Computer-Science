/**
PROJECT TITLE: TDEE / TDEE.java
PURPOSE OF PROJECT: To calculate someone's TDEE
VERSION or DATE: 9/25/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Nested if statements are easy to use
      
<-s>: When checking if the user entered a valid menu selection, I accidentally used an assignment operator

           
*******************************************************************************
In the future: Organize giant if statements before I make them
*/

import java.util.Scanner;
public class TDEE
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String name = mScanner.nextLine();
		System.out.print("Enter your BMR: ");
		String sBMR = mScanner.nextLine();
		System.out.print("Enter your gender (M/F): ");
		String gender = mScanner.nextLine();

		double BMR = Double.parseDouble(sBMR);

		gender = gender.toUpperCase();

		boolean doCalculateTDEE = true;

		if (gender.equals("M") || gender.equals("F"))
		{

			System.out.println("\nSelect Your Activity Level");
			System.out.println("[0] Resting (Sleeping, reclining)");
			System.out.println("[1] Sedentary (Watching TV, Reading)");
			System.out.println("[2] Light (Walking)");
			System.out.println("[3] Moderate (Dancing, Riding a bike)");
			System.out.println("[4] Very Active (Sports, Manual Labor)");
			System.out.println("[5] Extremely Active (Full-time athlete, Heavy Manual Labor)");

			System.out.print("Enter the number corresponding to your fitness level: ");
			String choice = mScanner.nextLine();
			double activityFactor = 1.0;
			if (gender.equals("M"))
			{
				if (choice.equals("0"))
				{
					activityFactor = 1.0;
				}
				else if (choice.equals("1"))
				{
					activityFactor = 1.3;
				}
				else if (choice.equals("2"))
				{
					activityFactor = 1.6;
				}
				else if (choice.equals("3"))
				{
					activityFactor = 1.7;
				}
				else if (choice.equals("4"))
				{
					activityFactor = 2.1;
				}
				else if (choice.equals("5"))
				{
					activityFactor = 2.4;
				}
				else
				{
					System.out.println("\nYou entered an invalid selection");
					doCalculateTDEE = false;
				}
			}
			else if (gender.equals("F"))
			{
				if (choice.equals("0"))
				{
					activityFactor = 0;
				}
				else if (choice.equals("1"))
				{
					activityFactor = 1.3;
				}
				else if (choice.equals("2"))
				{
					activityFactor = 1.5;
				}
				else if (choice.equals("3"))
				{
					activityFactor = 1.6;
				}
				else if (choice.equals("4"))
				{
					activityFactor = 1.9;
				}
				else if (choice.equals("5"))
				{
					activityFactor = 2.2;
				}
				else
				{
					System.out.println("\nYou entered an invalid selection");
					doCalculateTDEE = false;
				}
			}
			System.out.println("\nName: " + name);
			System.out.println("Gender: " + gender);
			System.out.println("BMR: " + BMR + " calories");
			System.out.println("Activity Factor: " + activityFactor);
			double TDEE = BMR * activityFactor;
			System.out.print("TDEE: ");
			
			if (doCalculateTDEE == true)
			{
				System.out.print(TDEE + " calories");
			}
			else
			{
				System.out.println("Unable to be calculated");
			}
		}
		else
		{
			System.out.println("Error: That gender doesn't exist");
		}
		mScanner.close();
	}
}
