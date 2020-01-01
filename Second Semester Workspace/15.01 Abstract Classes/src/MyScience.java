
public class MyScience extends Homework
{
	public MyScience()
	{
		super();
	}
	
	public void createAssignment(int p)
	{
		this.setPagesRead(p);
		this.typeHomework = "Science"; 
	}
	
	public String toString()
	{
		return this.typeHomework + " - must read " + this.pagesRead + " pages.";
	}
}
