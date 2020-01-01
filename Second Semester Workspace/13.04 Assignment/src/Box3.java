
/**
 * box demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	@Override
	public String toString()
	{
		return "Box - " + this.getLength() + " X " + this.getWidth() + " X " + this.getHeight();
	}
	
	public String equals(Box3 b)
	{
		if (b.getWidth() * b.getLength() * b.getHeight() == this.getLength() * this.getWidth() * this.getHeight())
		{
			return this.toString() + " is the same size as " + b.toString();
		}
		else
		{
			return this.toString() + " is not the same size as " + b.toString();
		}
	}  
}
