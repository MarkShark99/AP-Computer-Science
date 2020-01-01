/**
PROJECT TITLE: Prime Numbers
PURPOSE OF PROJECT: To practice using the this keyword
VERSION or DATE: 3/6/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This program was easy to write
           
*******************************************************************************
In the future: Use the this keyword more
*/

import java.util.Scanner;

public class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Prime Number Finder");
		System.out.print("Enter Upper Limit For Search: ");

		PrimeNumberFinder mFinder = new PrimeNumberFinder(mScanner.nextInt());
		mFinder.findPrimeNumbers();
		System.out.println("Done Searching.");
		System.out.println("Number of prime numbers found: " + mFinder.getTotalPrimeNumbers());
	}
}
