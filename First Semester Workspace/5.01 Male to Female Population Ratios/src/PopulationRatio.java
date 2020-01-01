/**
PROJECT TITLE: Proportion of Males and Females / PopulationRatio.java
PURPOSE OF PROJECT: To simulate the ratio of males to females in a country 
VERSION or DATE: 9/30/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: While loops are easy to use
      
<-s>: I used a <= instead of a < initially when the program would decide between males and females

           
*******************************************************************************
In the future: Write out how some things in the program will work on paper
*/

import java.util.Scanner;

public class PopulationRatio
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("What is the population size of your country? ");
		int totalLoops = mScanner.nextInt();

		int currentLoop = 1;
		double randomNumber = 0.0;
		int males = 0;
		int females = 0;
		String currentGender;
		System.out.print("What percentage of people should be males? ");
		double ratio = mScanner.nextDouble();
		ratio = ratio * Math.pow(10, -2); //converting the percent entered to one that works with random()
		if (ratio >= 0 && ratio <= 100)
		{
			while (currentLoop <= totalLoops)
			{
				randomNumber = Math.random();
				if (randomNumber < ratio)
				{
					currentGender = "Male";
					males++;
				}
				else
				{
					currentGender = "Female";
					females++;
				}
				System.out.println("Gender: " + currentGender + "\tTotal Males: " + males + "\tTotal Females: " + females);
				currentLoop++;
			}
			System.out.println("Males: " + males + "\tFemales: " + females);

		}
		mScanner.close();
	}
}
