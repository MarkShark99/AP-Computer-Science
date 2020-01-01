/**
 * rectangle Demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	@Override
	public String toString()
	{
		return "Rectangle - " + length + " X " + width;
	}
	
	public String equals(Rectangle3 r)
	{
		if (r.getWidth() * r.getLength() == this.length * this.width)
		{
			return this.toString() + " is the same size as " + r.toString();
		}
		else
		{
			return this.toString() + " is not the same size as " + r.toString();
		}
	}  
}
