/**
PROJECT TITLE: 13.04 Assignment
PURPOSE OF PROJECT: To practice overriding methods
VERSION or DATE: 2/26/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Overriding was easy
           
*******************************************************************************
In the future: Override methods so subclassed methods can do different things.
*/

public class TestNew
{
	public static void main(String[] args)
	{
		Rectangle3 mRectangle = new Rectangle3(5, 20);
		Box3 mBox1 = new Box3(4, 4, 4);
		Box3 mBox2 = new Box3(4, 10, 5);
		Cube3 mCube = new Cube3(4);
		
		System.out.println(mRectangle.toString());
		System.out.println(mBox1.toString());
		System.out.println(mBox2.toString());
		System.out.println(mCube.toString());
		System.out.println(mBox1.equals(mCube));
		System.out.println(mBox2.equals(mCube));
	}
	
	public void showEffectBoth(Rectangle3 r)
	{
		System.out.println(r);
	} 
}
