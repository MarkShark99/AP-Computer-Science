/**
PROJECT TITLE: Lottery Odds / Lottery.java
PURPOSE OF PROJECT: To simulate the generation and guessing of a three digit lottery number
VERSION or DATE: 10/6/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Concatenating the strings to make the 3-digit number was easy
      
<-s>: I had trouble generating the number between 0 and 9 because I was using an older formula from the last assignment

           
*******************************************************************************
In the future: Remember that substring doesn't actually include the second argument
*/

import java.util.Scanner;

public class Lottery
{
	public static void main(String[] args)
	{
		double digit;
		String lottoNumber = "";

		Scanner mScanner = new Scanner(System.in);


		for(int i = 0; i <= 2; i++)
		{
			digit = (int)(Math.random() * Math.pow(10 , 1));
			lottoNumber = lottoNumber.concat(Integer.toString((int)digit));
			//System.out.println(digit); //For debug
		}
		//System.out.println(lottoNumber); //Debugging
		System.out.print("Enter your three numbers (ex. 123): ");
		
		String guess = mScanner.nextLine();

		if (guess.substring(0, 2).equals(lottoNumber.substring(0, 2)) == true || guess.substring(2, 3).equals(lottoNumber.substring(2, 3)) == true || guess.equals(lottoNumber) == true)
		{
			System.out.println("\nWinner: " + lottoNumber);
			if (guess.equals(lottoNumber))
			{
				System.out.println("You correctly guessed the lottery number!");
			}
			else if (guess.substring(0, 2).equals(lottoNumber.substring(0, 2)))
			{
				System.out.println("You correctly guessed the first two digits of the lottery number!");
			}
			else if(guess.substring(1, 3).equals(lottoNumber.substring(1, 3)))
			{
				System.out.println("You correctly guessed the last two digits of the lottery number");
			}
		}
		else
		{
			System.out.println("Sorry, none of your numbers matched");
		}
		mScanner.close();
	}

	public static double roundToPlace(double a, int d) //My rounding function
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
