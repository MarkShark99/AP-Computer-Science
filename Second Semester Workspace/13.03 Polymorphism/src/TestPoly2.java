/**
PROJECT TITLE: 13.03 Polymorphism
PURPOSE OF PROJECT: To practice polymorphism
VERSION or DATE: 2/26/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Extending classes was easy
           
*******************************************************************************
In the future: Extend classes for easier coding
*/

import java.util.ArrayList;

public class TestPoly2
{
	public static void main(String[] args)
	{
		Circle2 mCircle = new Circle2(2, 4, 2);
		Cylinder2 mCylinder = new Cylinder2(10, 15, 2, 5);
		Oval2 mOval = new Oval2(25, 10, 5, 6);
		OvalCylinder2 mOvalCylinder = new OvalCylinder2(40, 10, 2, 5, 10);
		
		ArrayList<Circle2> circleList = new ArrayList<Circle2>();
		circleList.add(mCircle);
		circleList.add(mCylinder);
		circleList.add(mOval);
		circleList.add(mOvalCylinder);
		
		for (Circle2 c : circleList)
		{
			showCenter(c);
		}
}
	
	public static void showCenter(Circle2 c)
	{
		System.out.println("For " + c + " " + c.center() + "\n");
	}
}
