/**
PROJECT TITLE: 16.02 Assignment
PURPOSE OF PROJECT: To practice replacements in an array/arraylist
VERSION or DATE: 3/27/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Making replacements in an array was easy
           
*******************************************************************************
In the future: Find out how to initialize an ArrayList with an Array
*/

public class TestCandidate3
{
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
	
}
