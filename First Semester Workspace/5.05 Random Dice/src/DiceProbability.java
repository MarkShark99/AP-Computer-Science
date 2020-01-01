/**
PROJECT TITLE: Random Dice / DiceProbability.java
PURPOSE OF PROJECT: To calculate the probabilities of rolling various combinations on a pair of dice.
VERSION or DATE: 10/10/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Once I looked over the sample program, the nested loops were easy to make
      
<-s>: The directions were very vague as to what I had to do for this assignment, but once I read the sample program I understood it.

           
*******************************************************************************
In the future: Look over sample programs to make sure I'm understanding the directions.
*/

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner mScanner = new Scanner(System.in);
		
		System.out.print("How many times shall the dice be rolled? ");
		int totalLoops = mScanner.nextInt();
		
		System.out.print("How many sides do the dice have? ");
		int sides = mScanner.nextInt();
		int die1 = 0;
		int die2 = 0;
		
		int largestPossibleSum = sides * 2;
		
		double matches = 0; //Number of matches with the target number
		
		System.out.println("Number of sides: " + ((sides - 1) + 1));
		System.out.println("Sum\t\tProbability");
		System.out.println("------------------------------------");
		for(int targetSum = 2; targetSum <= largestPossibleSum; targetSum++) //Current sum to match
		{
			for (int i = 0; i <= totalLoops; i++) //
			{
				die1 = rand.nextInt(sides - 1) + 2;
				die2 = rand.nextInt(sides - 1) + 2;
				if (die1 + die2 == targetSum)
				{
					matches++;
				}
			}
			System.out.println(targetSum + "s:\t\t" + ((matches / totalLoops) * Math.pow(10, 2)) + "%");
			matches = 0;
		}
		mScanner.close();
	}
}