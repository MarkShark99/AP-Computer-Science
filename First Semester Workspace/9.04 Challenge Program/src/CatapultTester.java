/**
PROJECT TITLE: Catapults
VERSION or DATE: 1/12/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This was a very easy project

           
*******************************************************************************
In the future: Practice OOP more
*/

public class CatapultTester
{
	/**
	 * Main method
	 * @param args Arguments?
	 */
	public static void main(String[] args)
	{
		int[] degreeList = {25, 30, 35, 40, 45, 50};
		int[] velocityList = {20, 25, 30, 25, 40, 45, 50};
		double launchResults;
		
		Catapult mySiegeWeapon = new Catapult(); //Not as cool as a trebuchet
		
		System.out.print("    MPH");
		for (int i : degreeList)
		{
			System.out.printf("%12d deg", i);
		}
		
		System.out.println("\n==========================================================================================================");
		
		int index = 0;
		for (int v : velocityList)
		{
			System.out.print("     " + velocityList[index]);
			for (int d : degreeList)
			{
				launchResults = mySiegeWeapon.launch(d, v);
				System.out.printf("%16.2f", launchResults);
			}
			System.out.println();
			index++;
		}
	}
}
