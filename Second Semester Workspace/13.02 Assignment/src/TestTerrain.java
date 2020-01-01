/**
PROJECT TITLE: 13.02 Assignment
PURPOSE OF PROJECT: To practice inheritance
VERSION or DATE: 2/26/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Extending classes was easy
           
*******************************************************************************
In the future: Extend classes for easier coding
*/

public class TestTerrain
{
	public static void main(String[] args)
	{
		Forest mForest = new Forest(100, 200, 100);
		Mountain mMountain = new Mountain(300, 400, 25);
		WinterMountain mWinterMountain = new WinterMountain(500, 600, 10.0, 15);
		System.out.println(mForest.forestData());
		System.out.println(mMountain.mountainData());
		System.out.println(mWinterMountain.winterMountainData());
	}
}
