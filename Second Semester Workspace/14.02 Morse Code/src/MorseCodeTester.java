/**
PROJECT TITLE: 14.02 Morse Code
PURPOSE OF PROJECT: To practice using static methods
VERSION or DATE: 2/26/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using static methods was easy, but I prefer using objects when it's necessary to load things
           
*******************************************************************************
In the future: Use static methods more
*/

import java.io.IOException;
import java.util.Scanner;

public class MorseCodeTester
{
	public static void main(String[] args) throws IOException
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter a message without punctuation: ");
		System.out.println(MorseCode.convertToMorse(mScanner.nextLine()));
		mScanner.close();
	}
}
