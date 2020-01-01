/**
PROJECT TITLE: Target Zone / TargetZone.java
PURPOSE OF PROJECT: To calculate the target zone of a person's heart rate after exercising, and use if statements to determine if their heart rate is within the zone
VERSION or DATE: 9/22/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: If statements are easy
      
<-s>: The lack of else if statements could cause problems later

           
*******************************************************************************
In the future: Use if else once we learn about it
*/

import java.util.Scanner;

public class TargetZone
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);

		System.out.println("Determine Your Target Heart Rate For Cardiovascular Excercise\n");

		//Get info from user
		System.out.print("What is your resting heart rate? ");
		String stringRestingHeartRate = mScanner.nextLine();
		System.out.print("What is your age? ");
		String stringAge = mScanner.nextLine();
		System.out.print("What is your heart rate after Exercising? ");
		String stringHeartRateAfterExercising = mScanner.nextLine();
		System.out.println("\n");
		
		//turn the above strings into integers
		int age = Integer.parseInt(stringAge); 
		int restingHeartRate = Integer.parseInt(stringRestingHeartRate);
		int heartRateAfterExercising = Integer.parseInt(stringHeartRateAfterExercising);
		
		//calculate things
		int maximumHeartRate = (int)(206.9 - (0.67 * age));
		int heartRateReserve = (int)(maximumHeartRate - restingHeartRate);

		//Calculate the rest
		int lowerEnd = (int)((heartRateReserve * 0.65) + restingHeartRate);
		int upperEnd = (int)((heartRateReserve * 0.85) + restingHeartRate);
		
		System.out.println("Your target heart rate is between " + lowerEnd + " and " + upperEnd);
		
		if (heartRateAfterExercising >= lowerEnd && heartRateAfterExercising <= upperEnd)
		{
			System.out.println("Your heart rate after exercising is within your target zone");
		}
		if (heartRateAfterExercising <= lowerEnd)
		{
			System.out.println("Your heart rate after exercising is below your target zone");
		}
		if (heartRateAfterExercising >= upperEnd)
		{
			System.out.println("Your heart rate after exercising is above your target zone");
		}
		mScanner.close();
	}
}
