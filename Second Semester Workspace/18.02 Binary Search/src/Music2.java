
public class Music2
{
	private String title;
	private int year;
	private String singer;
	
	Music2(String title, int year, String singer)
	{
		this.title = title;
		this.year = year;
		this.singer = singer;
	}
	
	@Override
	public String toString()
	{
		return this.title + ", " + Integer.toString(this.year) + ", " + this.singer;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String getSinger()
	{
		return this.singer;
	}
}
