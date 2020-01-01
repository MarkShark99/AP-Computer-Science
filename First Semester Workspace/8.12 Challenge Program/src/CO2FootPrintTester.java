/**
PROJECT TITLE: 8.12 Challenge Program
VERSION or DATE: 1/12/17
AUTHORS: Mark Washington 

**************************** P M R *********************************************
 
<+s>: It was easy since all I had to do was copy and combine previous code

           
*******************************************************************************
In the future: Practice OOP more
*/

import java.util.ArrayList;

public class CO2FootPrintTester
{
	public static void main(String[] args)
	{
		ArrayList<CO2FootPrint> CO2List = new ArrayList<CO2FootPrint>();
		CO2List.add(new CO2FootPrint(1299.48, 107.08, 0.11, 3, true, true, true, true, 2));
		CO2List.add(new CO2FootPrint(1492, 192.09, 0.11, 4, false, true, false, true, 5));
		CO2List.add(new CO2FootPrint(1024.8, 152.66, 0.11, 5, true, false, true, false, 3));
		CO2List.add(new CO2FootPrint(1337, 143.91, 0.12, 9, false, true, true, false, 11));
		CO2List.add(new CO2FootPrint(1776.13, 112.23, 0.12, 3, false, false, false, false, 0));

		//Print results
		System.out.println("|                Pounds of CO2             |       Pounds of CO2         |                  |");
		System.out.println("|                Emitted from              |       Reduced from          |                  |");
		System.out.println("|    Gas     |   Electricity   |   Waste   |   Recycling  |   New Bulbs  |   CO2 Footprint  |");
		System.out.println("|============|=================|===========|==============|==============|==================|");
		for (CO2FootPrint a : CO2List)
		{
            System.out.printf("|  %8.2f  |      %8.2f   |  %7.2f  |     %7.2f  |     %6.1f   |       %8.2f   |%n", a.getPoundsCO2(), a.calcElectricityCO2(a.getAverageBill(), a.getAveragePrice()), a.getGrossWasteEmission(), a.getWasteReduction(), a.getBulbReduction(), a.getNetWasteReduction());
		}
	}
}
