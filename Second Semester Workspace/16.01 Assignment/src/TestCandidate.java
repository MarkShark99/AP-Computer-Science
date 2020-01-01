
public class TestCandidate
{
	public static Candidate[] election = {
			new Candidate("John Smith", 5000),
			new Candidate("Mary Miller", 4000),
			new Candidate("Michael Duffy", 6000),
			new Candidate("Tim Robinson", 2500),
			new Candidate("Joe Ashtony", 1800)
			};

	public static void main(String[] args)
	{
		System.out.println("Results per candidate:");
		System.out.println("----------------------");
		int totalVotes = getTotal();
		
		for (Candidate c : election)
		{
			System.out.println(c.toString());
		}
		
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
	
	
}
