
public class MyMath extends Homework
{
	public MyMath()
	{
		super();
	}
	
	public void createAssignment(int p)
	{
		this.setPagesRead(p);
		this.typeHomework = "Math"; 
	}
	
	public String toString()
	{
		return this.typeHomework + " - must read " + this.pagesRead + " pages.";
	}
}
