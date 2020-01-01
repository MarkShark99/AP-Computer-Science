import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FrequencyAnalysis
{
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private HashMap<Character, Integer> alphabetMap = new HashMap<Character, Integer>(); //HashMap to map letters to their frequencies
	private Scanner mScanner;
	private int totalLetters = 0;
	private String filename;
	private String outputFilename;

	public FrequencyAnalysis(String filename, String outputFilename)
	{	
		this.filename = filename;
		this.outputFilename = outputFilename;

		try 
		{
			mScanner = new Scanner(new File(this.filename));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		for (char letter : alphabet.toCharArray()) //Fill the hashmap
		{
			alphabetMap.put(letter, 0); // Set every key in the hashmap to zero
		}
	}

	public void calculateFrequency()
	{
		String currentLine;
		while (mScanner.hasNext())
		{
			currentLine = this.mScanner.nextLine();
			for (char letter : currentLine.toLowerCase().toCharArray())
			{
				if (this.alphabet.indexOf(letter) >= 0)
				{
					alphabetMap.put(letter, alphabetMap.get(letter) + 1);
				}
			}
		}
		this.totalLetters  = getTotalLetters();
		printFrequency();
		try
		{
			printFrequencyToFile();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		mScanner.close();
	}

	private int getTotalLetters()
	{
		int total = 0;
		for (char letter : this.alphabet.toCharArray())
		{
			total += this.alphabetMap.get(letter);
		}
		return total;
	}

	private void printFrequency()
	{
		System.out.println("Letter    Frequency (&)    Frequency(#)");
		System.out.println("---------------------------------------");
		for (char letter : alphabet.toCharArray())
		{
			System.out.print("    " + letter + "   ");
			System.out.printf("%9.2f%%    %10d%n", ((double)this.alphabetMap.get(letter) / (double)this.totalLetters) * 100, this.alphabetMap.get(letter));
		}
	}

	private void printFrequencyToFile() throws IOException
	{
		PrintWriter mPrintWriter = new PrintWriter(new File(this.outputFilename));
		
		mPrintWriter.println("Letter    Frequency (&)    Frequency(#)");
		mPrintWriter.println("---------------------------------------");
		
		for (char letter : alphabet.toCharArray())
		{
			mPrintWriter.print("    " + letter + "   ");
			mPrintWriter.printf("%9.2f%%    %10d%n", ((double)this.alphabetMap.get(letter) / (double)this.totalLetters) * 100, this.alphabetMap.get(letter));
		}
		mPrintWriter.close();
	}
}

/**
 * A - I
 * B - P
 * C - J
 * D - Q
 * E - K
 * F - S
 * G - C
 * H - U
 * I - T
 * J - W
 * K - A
 * L - X
 * M - B
 * N - M
 * O - F
 * P - V
 * Q - H
 * R - Y
 * S - L
 * T - G
 * U - Z
 * V - D
 * W - N
 * X - R
 * Y - O
 * Z - E
 */