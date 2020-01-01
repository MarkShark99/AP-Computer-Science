/**
PROJECT TITLE: 16.04 Assignments
PURPOSE OF PROJECT: To delete from an array
VERSION or DATE: 3/29/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: It was easy deleting from an array, everything worked on the first try
           
*******************************************************************************
In the future: Use what I've learned to remove items from an array
*/

public class TestCandidate7
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

		deleteByLoc(election, 6);
		printResults();

		deleteByName(election, "Kathleen Turner");
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
	
	public static void deleteByLoc(Candidate[] candidateArray, int position)
	{
		int insertIndex = 0;
		candidateArray[position] = null;
		
		Candidate[] newCandidateArray = new Candidate[candidateArray.length - 1];
		for (int i = 0; i < candidateArray.length; i++)
		{
			if (candidateArray[i] != null)
			{
				newCandidateArray[insertIndex] = candidateArray[i];
				insertIndex++;
			}
		}
		election = newCandidateArray;
	}
	
	public static void deleteByName(Candidate[] candidateArray, String name)
	{
		int index = -1;
		for (int i = 0; i < candidateArray.length; i++)
		{
			if (candidateArray[i].getName().equals(name))
			{
				index = i;
				break;
			}
		}
		if (index != -1)
		{
			deleteByLoc(candidateArray, index);
		}
		else
		{
			System.out.println("Couldn't replace name.");
		}
	}
}
