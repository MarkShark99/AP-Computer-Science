import java.util.ArrayList;

public class TestCandidate8
{
	static int totalVotes;
	static ArrayList<Candidate> election = new ArrayList<Candidate>();

	public static void main(String[] args)
	{
		election.add(new Candidate("John Smith", 5000));
		election.add(new Candidate("Mary Miller", 4000));
		election.add(new Candidate("Michael Duffy", 6000));
		election.add(new Candidate("Tim Robinson", 2500));
		election.add(new Candidate("Joe Ashtony", 1800));
		election.add(new Candidate("Mickey Jones", 3000));
		election.add(new Candidate("Rebecca Morgan", 2000));
		election.add(new Candidate("Kathleen Turner", 8000));
		election.add(new Candidate("Tory Parker", 500));
		election.add(new Candidate("Ashton Davis", 10000));
		
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

	public static void replaceName(ArrayList<Candidate> candidateArray, String name, String replacementName)
	{
		for (Candidate c : candidateArray)
		{
			if (c.getName().equals(name))
			{
				c.setName(replacementName);
			}
		}
	}

	public static void replaceVotes(ArrayList<Candidate> candidateArray, String name, int replacementVotes)
	{
		for (Candidate c : candidateArray)
		{
			if (c.getName().equals(name))
			{
				c.setVotes(replacementVotes);
			}
		}
	}

	public static void replaceCandidate(ArrayList<Candidate> candidateArray, String name, String replacementName, int replacementVotes)
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

	public static void insertPosition(ArrayList<Candidate> candidateArray, int position, Candidate newCandidate)
	{
		//Candidate[] newCandidateArray = new Candidate[candidateArray.length + 1];
		ArrayList<Candidate> newCandidateArray = candidateArray;
		newCandidateArray.add(null);

		for (int i = 0; i < candidateArray.size(); i++)
		{
			newCandidateArray.set(i, candidateArray.get(i));
		}
        for (int i = newCandidateArray.size() - 1; i > position; i--)
        {
            newCandidateArray.set(i, candidateArray.get(i - 1));
        }
        newCandidateArray.set(position, newCandidate);
        election = newCandidateArray;
	}

	public static void insertCandidate(ArrayList<Candidate> candidateArray, String name, Candidate newCandidate)
	{
		int position = 0;
		for (int i = 0; i < candidateArray.size(); i++)
		{
			if (candidateArray.get(i).getName().equals(name))
			{
				position = i;
				break;
			}
		}
		insertPosition(candidateArray, position, newCandidate);
	}
	
	public static void deleteByLoc(ArrayList<Candidate> candidateArray, int position)
	{
		candidateArray.remove(position);
		election = candidateArray;
	}
	
	public static void deleteByName(ArrayList<Candidate> candidateArray, String name)
	{
		int index = -1;
		for (int i = 0; i < candidateArray.size(); i++)
		{
			if (candidateArray.get(i).getName().equals(name))
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
