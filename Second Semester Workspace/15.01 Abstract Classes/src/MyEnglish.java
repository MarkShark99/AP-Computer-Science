public class MyEnglish extends Homework
{
	public MyEnglish()
	{
		super();
	}
	
	public void createAssignment(int p)
	{
		this.setPagesRead(p);
		this.typeHomework = "English"; 
	}
	
	public String toString()
	{
		return this.typeHomework + " - must read " + this.pagesRead + " pages.";
	}
}
