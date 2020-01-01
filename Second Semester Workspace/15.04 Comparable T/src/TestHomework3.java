/**
PROJECT TITLE: 15.04
PURPOSE OF PROJECT: To use comparable<t>
VERSION or DATE: 3/13/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using a comparable was simple

           
*******************************************************************************
In the future: Use comparables to compare two objects
*/

import java.util.ArrayList;

public class TestHomework3
{
	public static void main(String[] args)
	{
		ArrayList<Homework3> homeworkList = new ArrayList<Homework3>();
		homeworkList.add(new MyMath3());
		homeworkList.add(new MyScience3());
		homeworkList.add(new MyEnglish3());
		homeworkList.add(new MyJava3());
		homeworkList.get(0).createAssignment(10);
		homeworkList.get(1).createAssignment(6);
		homeworkList.get(2).createAssignment(10);
		homeworkList.get(3).createAssignment(5);
		for (Homework3 h : homeworkList)
		{
			System.out.println(h.toString());
		}
		int compare = homeworkList.get(0).compareTo(homeworkList.get(2));
		if (compare == 0)
		{
			System.out.println("The homework for math and english are the same number of pages");
		}
		else if (compare == 1)
		{
			System.out.println("The homework for math has less pages than english");
		}
		else if (compare != -1)
		{
			System.out.println("The homework for math has more pages than English");
		}
	}
}
