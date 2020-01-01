/**
PROJECT TITLE: Guessing Game V2 / GuessingGameV2.java
PURPOSE OF PROJECT: A simple number guessing game where the computer generates a random number between two numbers and the user has to guess
VERSION or DATE: 10/3/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using a while loop for repeating the guess was easy
      
<-s>: Making sure the number was between the minimum and maximum was challenging

           
*******************************************************************************
In the future: Do rounding and number generation with a calculator before putting it into the code
*/

import java.util.Scanner;

public class GuessingGameV2
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter the minimum number: "); //Get the minimum number
		int minGuess = mScanner.nextInt();
		System.out.print("\nEnter the maximum number: "); //Get the maximum number
		int maxGuess = mScanner.nextInt();
		
		double rand = Math.random(); //Create a random number
		int range = (maxGuess + 1) - minGuess; //Calculate the range of possible values
		int targetNumber = (int)((rand * range) + minGuess); //Calculate the target number
		
		int guess = 0;
		int guesses = 0;
		boolean numberFound = false;
		
		while (numberFound == false)
		{
			System.out.print("Enter your guess: "); //The user enters their guess
			guess = mScanner.nextInt(); 
			System.out.println(); //Make a new line
			if (guess > targetNumber) //Check if guess is too high
			{
				System.out.println("Too high");
			}
			else if (guess < targetNumber) //Check if guess is too low
			{
				System.out.println("Too low");
			}
			else if (guess == targetNumber) //Check if guess matches the target
			{
				numberFound = true;
			}
			guesses++; //increment the number of guesses
		}
		System.out.println("The random number was " + targetNumber);
		System.out.println("Number of guesses: " + guesses);
		mScanner.close();
	}
	
	public static double roundToPlace(double a, int d) //Function to make it easier to round numbers
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d)); //Return the rounded number
	}
}
