
public abstract class Homework3 implements Comparable<Homework3>
{
	public int pagesRead;
	public String typeHomework = "";
	
	
	public Homework3()
	{
		this.pagesRead = 0;
		this.typeHomework = "none";
	}
	
	public int getPagesRead()
	{
		return this.pagesRead;
	}
	
	public void setPagesRead(int pagesRead)
	{
		this.pagesRead = pagesRead;
	}
	
	public abstract void createAssignment(int p);
	
	public int compareTo(Homework3 hw)
	{
		if (pagesRead == hw.pagesRead)
		{
			return 0;
		}
		else if (pagesRead < hw.pagesRead)
		{
			return 1;
		}
		else return -1;
	}
}
