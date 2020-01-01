/**
PROJECT TITLE: Recursion
PURPOSE OF PROJECT: To practice recursion
VERSION or DATE: 1/26/17
AUTHORS: Mark Washington

 **************************** P M R *********************************************

<+s>: Recursion is easy as long as it doesn't get stuck looping


 *******************************************************************************
In the future: Use recursion more to save space in code
 */

public class Piecewise
{
	public static void main(String[] args)
	{	
		System.out.println("Problem 1: " + problem1(25));
		System.out.println("Problem 2: " + problem2(30));
		System.out.println("Problem 4: " + problem4(500));
		System.out.println(f(15));
	}
	//1, 2, and 4
	public static int problem1(int x)
	{
		if (x <= 10)
		{
			return -7;
		}
		else
		{
			return problem1(x - 4) + 2;
		}
	}
	public static int problem2(int x)
	{
		if (x <= 25)
		{
			return 20;
		}
		else
		{
			return problem2(x / 12 + 5) - 3;
		}
	}
	public static int problem4(int x)
	{
		if (x > 20)
		{
			return -100;
		}
		else 
		{
			return problem4(x * 2) - 4;
		}
	}
	public static int testProblem(int x)
	{
		if (x <= 10)
		{
			return -5;
		}
		else
		{
			return testProblem(x-3) + 2;
		}
	}

	public static int f(int x)
	{
		if (x <= 14)
		{
			return -8;
		}
		else
		{
			return f(x - 12) + 3;
		}
	}

}

