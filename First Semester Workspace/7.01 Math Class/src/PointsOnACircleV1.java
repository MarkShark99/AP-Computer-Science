/**
PROJECT TITLE: Math Class Methods / PointsOnACircleV1.java
PURPOSE OF PROJECT: To calculate the value of y on a circle for a given x
VERSION or DATE: 11/11/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: The math class methods were easy to use
      
<-s>: I was having issues where it was looping past where it should for some reason until I rounded the x value to two decimal places, I think because the doubles were varying and that was causing issues.

           
*******************************************************************************
In the future: Remember that doubles can vary in value slightly
*/

public class PointsOnACircleV1
{
	public static void main(String[] args)
	{
		double radius = 1.0;
		double y = 0.0;
		double increment = 0.1;
		System.out.println("   Points on a Cicle of Radius 1.0");
		System.out.println("   x1      y1           x1      y2");
		System.out.println("--------------------------------------");
		for (double x = -radius; x < radius + increment ; x += increment)
		{
			y = roundToPlace(-Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2)), 2);
			if (roundToPlace(x, 2) < radius + increment)
			{
				//System.out.println("X: " + x + " Y: " + y);
				System.out.printf("% 6.2f %8.2f% 13.2f% 8.2f%n", -x, Math.abs(y), -x, y);
			}
		}
	}
	public static double roundToPlace(double a, int d)
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
