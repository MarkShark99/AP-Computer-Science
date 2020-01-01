/**
PROJECT TITLE: ArrayLists II
PURPOSE OF PROJECT: To practice using ArrayLists
VERSION or DATE: 1/10/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Arraylists were easy to use
           
*******************************************************************************
In the future: Practice using arraylists more
*/

import java.util.ArrayList;

public class CO2FromWasteTester
{
	public static void main(String[] args)
	{
		ArrayList<CO2FromWaste> list = new ArrayList<CO2FromWaste>();
		list.add(new CO2FromWaste(1, true, true, true, true));
		list.add(new CO2FromWaste(3, true, false, true, true));
		list.add(new CO2FromWaste(4, false, false, false, false));
		list.add(new CO2FromWaste(1, true, true, true, true));
		list.add(new CO2FromWaste(1, true, true, true, true));
			
		System.out.println("|       |        |                                         |             Pounds of CO2             |");
		System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
		System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
		System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
		int i = 0;
		for (CO2FromWaste c : list)
		{
			c.calcGrossWasteEmission();
			c.calcNetWasteReduction();
			c.calcWasteReduction();
			System.out.printf("|%4d   |%5d   |   %-7b|  %-8b|  %-7b|  %-7b|%9.2f   |%10.2f   |%10.2f  |%n", i, c.getNumPeople(), c.getPaper(), c.getPlastic(), c.getGlass(), c.getCans(), c.getGrossWasteEmission(), c.getWasteReduction(), c.getNetWasteReduction());
			i++;
		}
		System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
	}
}
