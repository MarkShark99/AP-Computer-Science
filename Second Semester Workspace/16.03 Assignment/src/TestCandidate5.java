/**
PROJECT TITLE: 16.03
PURPOSE OF PROJECT: To practice inserting into an array
VERSION or DATE: 3/28/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This program was easy
      
*******************************************************************************
In the future: Use arrays for insertions, not arraylists
*/

public class TestCandidate5
{
	static int totalVotes;
	public static Candidate[] election = {
			new Candidate("John Smith", 5000),
			new Candidate("Mary Miller", 4000),
			new Candidate("Michael Duffy", 6000),
			new Candidate("Tim Robinson", 2500),
			new Candidate("Joe Ashtony", 1800),
			new Candidate("Mickey Jones", 3000),
			new Candidate("Rebecca Morgan", 2000),
			new Candidate("Kathleen Turner", 8000),
			new Candidate("Tory Parker", 500),
			new Candidate("Ashton Davis", 10000)
	};

	public static void main(String[] args)
	{
		System.out.println("Original Results:");
		printResults();

		insertPosition(election, 5, new Candidate("Woody Pride", 19300));
		System.out.println("Added Woody Pride, 19300 votes\n");

		printResults();
		System.out.println("\nTotal number of votes in election: " + totalVotes + "\n");

		insertCandidate(election, "Kathleen Turner", new Candidate("Joy Anderson", 1100));
		System.out.println("Added Joy Anderson, 1100 votes\n");
		printResults();
	}

	public static int getTotal()
	{
		int total = 0;
		for (Candidate c : election)
		{
			//System.out.println(c);
			total += c.getVotes();
		}
		return total;
	}

	public static void printResults()
	{
		totalVotes = getTotal();
		System.out.println("\nCandidate               Votes Received      % of total votes");
		for (Candidate c : election)
		{
			System.out.printf("%-20s    %-14d      %-3.0f%n", c.getName(), c.getVotes(), ((double)c.getVotes() / totalVotes) * 100);
		}
		System.out.println("\nTotal number of votes in election: " + totalVotes + "\n");
	}

	public static void replaceName(Candidate[] candidateArray, String name, String replacementName)
	{
		for (Candidate c : candidateArray)
		{
			if (c.getName().equals(name))
			{
				c.setName(replacementName);
			}
		}
	}

	public static void replaceVotes(Candidate[] candidateArray, String name, int replacementVotes)
	{
		for (Candidate c : candidateArray)
		{
			if (c.getName().equals(name))
			{
				c.setVotes(replacementVotes);
			}
		}
	}

	public static void replaceCandidate(Candidate[] candidateArray, String name, String replacementName, int replacementVotes)
	{
		for (Candidate c : candidateArray)
		{
			if (c.getName().equals(name))
			{
				c.setName(replacementName);
				c.setVotes(replacementVotes);
			}
		}
	}

	public static void insertPosition(Candidate[] candidateArray, int position, Candidate newCandidate)
	{
		Candidate[] newCandidateArray = new Candidate[candidateArray.length + 1];
		for (int i = 0; i < candidateArray.length; i++)
		{
			newCandidateArray[i] = candidateArray[i];
		}
		
        for(int i = newCandidateArray.length - 1; i > position; i--)
        {
            newCandidateArray[i] = candidateArray[i - 1];
        }
        newCandidateArray[position] = newCandidate;
        election = newCandidateArray;
	}

	public static void insertCandidate(Candidate[] candidateArray, String name, Candidate newCandidate)
	{
		int position = 0;
		for (int i = 0; i < candidateArray.length; i++)
		{
			if (candidateArray[i].getName().equals(name))
			{
				position = i;
				break;
			}
		}
		insertPosition(candidateArray, position, newCandidate);
	}
}
