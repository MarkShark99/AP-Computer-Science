/**
PROJECT TITLE: 12.05 Fibonacci
PURPOSE OF PROJECT: To practice recursion
VERSION or DATE: 129/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Recursion for the fibonacci sequence was very straightforward and easy

           
*******************************************************************************
In the future: Use recursion more
*/

import java.util.Scanner;

public class FibonacciNumber
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		int n; //Input number
		int f; //Fibonacci number
		while (true)
		{
			System.out.print("Input: ");

			n = mScanner.nextInt();

			f = getFibonacciNumber(n); //Get fibonacci number
			if (f == -1) break; //If invalid input then break
			else System.out.println("Fibonacci number: " + f); //Output the fibonacci number
			System.out.print("Continue? (Y\\n): "); //Continue prompt
			if (!mScanner.next().toLowerCase().equals("y")) break; //If input is not "y" then break

		}
		mScanner.close();
		System.out.println("Done");
	}

	/**
	 * Get the fibonacci number for a given number n
	 * @param n Input number
	 * @return Fibonacci number for given input
	 */
	public static int getFibonacciNumber(int n)
	{
		if (n == 0 || n == 1)
		{
			return n;
		}
		else if (n > 1)
		{
			return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
		}
		else 
		{
			System.out.println("Invalid input");
			return -1; //Error
		}
	}
}
