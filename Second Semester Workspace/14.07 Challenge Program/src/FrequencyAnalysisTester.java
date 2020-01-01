/**
PROJECT TITLE: 14.07 Challenge Program
PURPOSE OF PROJECT: To get the frequency of each letter in the alphabet in a string
VERSION or DATE: 3/16/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: The program was very easy to write, especially with a HashMap to map each letter to a frequency value
      
<-s>: I felt like the part of the assignment where I had to decode the message was a lot more difficult than it
      should have been, and the similarities between the frequencies of some letters just made it more difficult
      and time consuming.

           
*******************************************************************************
In the future: Use maps for problems like this.
*/

import java.util.Scanner;

public class FrequencyAnalysisTester
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		
		System.out.print("Input Filename (Ex: \"input.txt\"): ");
		String filename = mScanner.nextLine();
		
		System.out.print("Output Filename (Ex: \"output.txt\"): ");
		String outputFilename = mScanner.nextLine();
		
		FrequencyAnalysis mFreq = new FrequencyAnalysis(filename, outputFilename);
		mFreq.calculateFrequency();
		mScanner.close();
	}
}
