/**
PROJECT TITLE: Guessing Game V1 / GuessingGameV1.java
PURPOSE OF PROJECT: A simple number guessing game where the computer generates a random number and the user has to guess
VERSION or DATE: 10/3/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using a while loop for repeating the guess was easy
      
<-s>: Making sure the number was between 1 and 100 was challenging

           
*******************************************************************************
In the future: Do rounding and number generation with a calculator before putting it into the code
*/

import java.util.Scanner;

public class GuessingGameV1
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		int guess = 0;
		int guesses = 0;
		boolean numberFound = false; 
		int targetNumber = (int)(roundToPlace(Math.random(), 2) * Math.pow(10, 2)); //Generate a random number betweem 1 and 100
		
		while (numberFound == false)
		{
			System.out.print("Enter your guess: ");
			guess = mScanner.nextInt();
			System.out.println();
			if (guess > targetNumber) //Check if guess is too high
			{
				System.out.println("Too high");
			}
			else if (guess < targetNumber) //Check if guess is too low
			{
				System.out.println("Too low");
			}
			else if (guess == targetNumber) //Check if guess is equal to the random number
			{
				numberFound = true;
			}
			guesses++; //Inrement number of guesses
		}
		System.out.println("The random number was " + targetNumber); //Display the random number
		System.out.println("Number of guesses: " + guesses); //Display the number of guesses the user made
		mScanner.close();
	}
	
	public static double roundToPlace(double a, int d)
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
