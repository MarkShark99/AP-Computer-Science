import java.util.Scanner;

public class HeadsOrTailsV1
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		System.out.print("How many times should the coin be flipped? ");
		int totalLoops = mScanner.nextInt();
	
		int currentLoop = 1;
		double randomNumber = 0.0;
		int heads = 0;
		int tails = 0;
		String currentSide;
		
		while (currentLoop <= totalLoops)
		{
			randomNumber = Math.random();
			if (randomNumber < 0.5)
			{
				currentSide = "Heads";
				heads++;
			}
			else
			{
				currentSide = "Tails";
				tails++;
			}
			System.out.println("Current Side: " + currentSide + "\tTotal Heads: " + heads + "\tTotal Tails: " + tails);
			currentLoop++;
		}
		System.out.println("Heads: " + heads + "\tTails: " + tails);
	}
}
