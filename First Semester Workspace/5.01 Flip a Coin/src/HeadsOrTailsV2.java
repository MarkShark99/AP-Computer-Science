import java.util.Scanner;

public class HeadsOrTailsV2
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
		System.out.print("What percentage of flips should be heads? ");
		double ratio = mScanner.nextDouble();
		ratio = ratio * Math.pow(10, -2);
		System.out.println((ratio * Math.pow(10, 2)) +"% chance of heads\t" + (100 - (ratio * Math.pow(10, 2))) + "% chance of tails");
		if (ratio >= 0 && ratio <= 100)
		{
			while (currentLoop <= totalLoops)
			{
				randomNumber = Math.random();
				if (randomNumber < ratio)
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
}
