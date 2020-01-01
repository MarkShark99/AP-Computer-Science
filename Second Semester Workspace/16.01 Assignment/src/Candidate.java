
public class Candidate
{
	private String name;
	private int numVotes;
	
	public Candidate(String name, int numVotes)
	{
		this.name = name;
		this.numVotes = numVotes;
	}
	
	@Override
	public String toString()
	{
		return this.name + " received " + this.numVotes + " votes.";
	}
	
	public int getVotes()
	{
		return this.numVotes;
	}
	
	public String getName()
	{
		return this.name;
	}
}
