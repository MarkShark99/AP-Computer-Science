import java.util.ArrayList;
import java.util.Arrays;

public class TestCandidate6
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
}
