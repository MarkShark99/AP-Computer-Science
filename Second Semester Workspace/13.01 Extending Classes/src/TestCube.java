public class TestCube
{
	public static void test()
	{
		Rectangle One = new Rectangle(2, 4);
		Cube mCube = new Cube(4);
		System.out.println("One's dimensions are " + One.getLength() + " X " + One.getWidth());
		System.out.println("Cube's dimensions are " + mCube.getLength() + " X " + mCube.getWidth() + " X " + mCube.getHeight());
	}
}
