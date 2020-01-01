/**
PROJECT TITLE: 13.01 Extending classes
PURPOSE OF PROJECT: To practice extending classes
VERSION or DATE: 2/13/2017
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Extending classes was easy

           
*******************************************************************************
In the future: Use inheritance more in the future
*/

public class TestTriangles
{
	public static void main(String[] args)
	{
		Triangle one = new Triangle(4, 5, 6);
		Equilateral two = new Equilateral(5);
		IsoscelesRight three = new IsoscelesRight(1.5);
		
		TestCube.test();
		
		System.out.println("\nTriangle has sides A = " + one.getSideA() + ", B = " + one.getSideB() + ", C = " + one.getSideC());
		System.out.println("Equilateral triangle has sides A = " + two.getSideA() + ", B = " + two.getSideB() + ", C = " + two.getSideC());
		System.out.println("Isosceles right triangle has sides A = " + three.getSideA() + ", B = " + three.getSideB() + ", C = " + three.getSideC());

	}
}
