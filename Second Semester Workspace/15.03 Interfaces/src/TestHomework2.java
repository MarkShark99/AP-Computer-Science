/**
PROJECT TITLE: 15.03
PURPOSE OF PROJECT: To use interfaces
VERSION or DATE: 3/8/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using an interface was simple

           
*******************************************************************************
In the future: Use interfaces to abstract my code
*/

import java.util.ArrayList;

public class TestHomework2
{
	public static void main(String[] args)
	{
		ArrayList<Homework2> homeworkList = new ArrayList<Homework2>();
		homeworkList.add(new MyMath2());
		homeworkList.add(new MyScience2());
		homeworkList.add(new MyEnglish2());
		homeworkList.add(new MyJava2());
		homeworkList.get(0).createAssignment(4);
		homeworkList.get(1).createAssignment(6);
		homeworkList.get(2).createAssignment(10);
		homeworkList.get(3).createAssignment(5);
		for (Homework2 h : homeworkList)
		{
			h.doReading();
		}
	}
}
