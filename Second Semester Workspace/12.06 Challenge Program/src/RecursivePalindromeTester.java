/**
PROJECT TITLE: 12.06 Challenge Program
PURPOSE OF PROJECT: 1/29/16
VERSION or DATE: 1/29/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: It was easy once I figured out how to do it
      
<-s>: It was sort of challenging to figure out what to do

           
*******************************************************************************
In the future: Use recursion more
*/

import java.util.Scanner;

public class RecursivePalindromeTester
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String input; //Input number
		while (true)
		{
			System.out.print("Input: ");
			input = mScanner.nextLine();
			if (RecursivePalindrome.isPalindrome(input) == true)
			{
				System.out.println(input + " is a palindrome");
			}
			else
			{
				System.out.println(input + " is not a palindrome");
			}
			System.out.print("Continue? (Y\\n): ");
			if (!mScanner.nextLine().toLowerCase().equals("y")) break; //If input is not "y" then break

		}
		mScanner.close();
		System.out.println("Done");
	}
}
