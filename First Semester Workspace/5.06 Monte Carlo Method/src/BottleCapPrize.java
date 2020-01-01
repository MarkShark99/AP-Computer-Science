/**
PROJECT TITLE: Monte Carlo Method / BottleCapPrize.java
PURPOSE OF PROJECT: Using the monte carlo method to find the average number of bottle caps opened to win a prize
VERSION or DATE: 10/11/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Writing to the file was easy (especially compared to Python)
      
<-s>: I was accidentally using next() instead of nextLine when reading from the file so it was causing errors with my array

           
*******************************************************************************
In the future: Remember to use nextLine() instead of next() when I want to read the whole line.
*/

import java.io.IOException; //import necessary libraries
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class BottleCapPrize
{
	public static void main(String[] args) throws IOException
	{
		File mFile = new File("BottleCapPrize.txt"); //Create the file
		PrintWriter outputFile = new PrintWriter(mFile); //Create a PrintWriter to write to the file.
		Scanner mScanner = new Scanner(System.in); //Create a scanner to accept input and read the file
		Random mRandom = new Random(); //New random number generator
		
		int totalTrials = 0;
		System.out.print("How many trials should be done (Must be more than 1000)?: ");
		totalTrials = mScanner.nextInt();
		int caps = 0; //some variables
		int randomCap = 0;
		int total = 0;
		int lineNumber = 0;
		String currentLine = "";
		String[] currentLineArray;
		
		boolean hasWonPrize = false;
		for (int trial = 1; trial <= totalTrials; trial++)
		{
			//System.out.println("Trial " + trial);
			for(caps = 0; hasWonPrize == false; caps++)
			{
				randomCap = (mRandom.nextInt(5) + 1);
				//System.out.println("Random Cap: " + randomCap);
				if (randomCap == 5)
				{
					hasWonPrize = true;
				}
			}
			outputFile.println("Trial " + trial + ": " + caps + " caps"); //Output to the file
			caps = 0;
			hasWonPrize = false;
		}
		//System.out.println("Done testing");
		outputFile.close(); //Close the output file
		//System.out.println("Reading file");
		
		Scanner inputFile = new Scanner(mFile); //Create a new scanner for the input file
		for(lineNumber = 1; inputFile.hasNext() == true; lineNumber++)
		{
			currentLine = inputFile.nextLine(); //Read the next line in the file.
			currentLineArray = currentLine.split(" "); //Split the current line at " " into an array
			//System.out.println(currentLineArray[2]);
			total += (Integer.parseInt(currentLineArray[2])); //Add to the total number of caps opened
		}
		System.out.println("Average: " + (total / lineNumber)); //calculate the average
		mScanner.close(); //Close mScanner
		inputFile.close(); //Close the input file
	}
}
