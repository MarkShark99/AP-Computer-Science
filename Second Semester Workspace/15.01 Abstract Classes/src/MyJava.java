
public class MyJava extends Homework
{
	public MyJava()
	{
		super();
	}
	
	public void createAssignment(int p)
	{
		this.setPagesRead(p);
		this.typeHomework = "Java"; 
	}
	
	public String toString()
	{
		return this.typeHomework + " - must read " + this.pagesRead + " pages.";
	}
}
