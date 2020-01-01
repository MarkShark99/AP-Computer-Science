
public abstract class Homework
{
	public int pagesRead;
	public String typeHomework = "";
	
	
	public Homework()
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
	
}
