
public abstract class Homework2 implements Processing
{
	public int pagesRead;
	public String typeHomework = "";
	
	
	public Homework2()
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
