/**
PROJECT TITLE: 16.01 Assignment
PURPOSE OF PROJECT: To practice using arrays
VERSION or DATE: 3/27/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Traversing an array was easy
           
*******************************************************************************
*/

import java.util.ArrayList;

public class TestCandidate2
{
	public static ArrayList<Candidate> election = new ArrayList<Candidate>();

	public static void main(String[] args)
	{
		election.add(new Candidate("John Smith", 5000));
		election.add(new Candidate("Mary Miller", 4000));
		election.add(new Candidate("Michael Duffy", 6000));
		election.add(new Candidate("Tim Robinson", 2500));
		election.add(new Candidate("Joe Ashtony", 1800));

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
