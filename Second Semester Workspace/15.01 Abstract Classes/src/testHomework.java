/**
PROJECT TITLE: 15.01
PURPOSE OF PROJECT: To use abstract classes
VERSION or DATE: 3/8/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using abstract classes was easy

           
*******************************************************************************
In the future: Use abstract classes to make neater code
*/

import java.util.ArrayList;

public class testHomework
{
	public static void main(String[] args)
	{
		ArrayList<Homework> homeworkList = new ArrayList<Homework>();
		homeworkList.add(new MyMath());
		homeworkList.add(new MyScience());
		homeworkList.add(new MyEnglish());
		homeworkList.add(new MyJava());
		homeworkList.get(0).createAssignment(4);
		homeworkList.get(1).createAssignment(6);
		homeworkList.get(2).createAssignment(10);
		homeworkList.get(3).createAssignment(5);
		for (Homework h : homeworkList)
		{
			System.out.println(h.toString());
		}
	}
}
