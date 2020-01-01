
public class Cube3 extends Box3
{
	Cube3(int lwh)
	{
		super(lwh, lwh, lwh);
	}
	
	@Override
	public String toString()
	{
		return "Cube - " + this.getLength() + " X " + this.getWidth() + " X " + this.getHeight();
	}
}

