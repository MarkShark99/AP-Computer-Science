/**
PROJECT TITLE: 19.01
PURPOSE OF PROJECT: To practice using assertions and exceptions
VERSION or DATE: 4/19/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Assertions and exceptions were easy
           
*******************************************************************************
In the future: Use exceptions and try-catches in my code
*/

public class TestProgStudentData
{
	public static void main(String[] args)
	{
		
		StudentData a = new StudentData("John", "Doe", new double[] {100.0, 90.0, 80.0, 83.0});
		System.out.println(a.toString());

		try 
		{
			StudentData b = new StudentData("John", "Johnson", new double[] {});
			System.out.println(b.toString());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			StudentData c = new StudentData("Jonathan", "", new double[] {100.0});
			System.out.println(c.toString());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}