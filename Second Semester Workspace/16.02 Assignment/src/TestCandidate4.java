import java.util.ArrayList;

public class TestCandidate4
{
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
		System.out.println("----------------------");
		int totalVotes = getTotal();
		
		/**
		for (Candidate c : election)
		{
			System.out.println(c.toString());
		}
		*/
		
		System.out.println("\nCandidate               Votes Received      % of total votes");
		for (Candidate c : election)
		{
			System.out.printf("%-20s    %-14d      %-3.0f%n", c.getName(), c.getVotes(), ((double)c.getVotes() / totalVotes) * 100);
		}
		System.out.println("\nNumber of votes in election: " + totalVotes);
		
		replaceName(election, "Michael Duffy", "John Elmos");
		replaceVotes(election, "Mickey Jones", 2500);
		replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
		
		System.out.println("Result after changes:");
		System.out.println("----------------------");
		totalVotes = getTotal();
		
		System.out.println("\nCandidate               Votes Received      % of total votes");
		for (Candidate c : election)
		{
			System.out.printf("%-20s    %-14d      %-3.0f%n", c.getName(), c.getVotes(), ((double)c.getVotes() / totalVotes) * 100);
		}
		System.out.println("\nNumber of votes in election: " + totalVotes);
	}
	
	public static int getTotal()
	{
		int total = 0;
		for (Candidate c : election)
		{
			total += c.getVotes();
		}
		return total;
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
	
}
