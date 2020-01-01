import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MorseCode
{
	/*
	 * Function to convert a string to morse code
	 */
	public static boolean isLoaded = false;
	public static String englishAlphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
	public static String[] morseAlphabet = new String[36];

	public static void load() throws IOException
	{
		File file = new File("morsecode.txt");
		Scanner mScanner = new Scanner(file);
		for (int i = 0; mScanner.hasNextLine(); i++)
		{
			morseAlphabet[i] = mScanner.nextLine();
			//System.out.println(morseAlphabet[i]);
		}
		mScanner.close();
	}

	public static String convertToMorse(String s) throws IOException
	{
		s = s.toLowerCase();
		String convertedString = "";
		if (!isLoaded)
		{
			load();
		}
		for (char c : s.toCharArray())
		{
			if (englishAlphabet.indexOf(c) >= 0)
			{
				convertedString += morseAlphabet[englishAlphabet.indexOf(c)] + " ";
			}
		}
		return convertedString;
	}
}
