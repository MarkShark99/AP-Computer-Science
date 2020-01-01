
public class MyJava2 extends Homework2
{
	public MyJava2()
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
	
	@Override
	public void doReading()
	{
		System.out.println("Before Reading:");
		System.out.println(this.toString());
		System.out.println("After Reading:");
		System.out.println(this.typeHomework + " - must read " + (this.getPagesRead() - 4) + " pages.");
	}
}
