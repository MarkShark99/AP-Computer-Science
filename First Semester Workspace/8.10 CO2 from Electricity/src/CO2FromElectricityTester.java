import java.util.ArrayList;

/**
PROJECT TITLE: CO2 from electricity
PURPOSE OF PROJECT: To practice using arraylists
VERSION or DATE: 1/8/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Arraylists were really easy
           
*******************************************************************************
In the future: Use arraylists more than arrays
*/

public class CO2FromElectricityTester
{
	/**
	 * Main method
	 * @param args Program arguments
	 */
	public static void main(String[] args)
	{
		CO2FromElectricity myCO2 = new CO2FromElectricity();
		ArrayList monthlyBillList = new ArrayList<Double>();
		monthlyBillList.add(143.85); //Month 1
		monthlyBillList.add(83.01); //Month 2
		monthlyBillList.add(94.39); //Month 3
		double averageMonthlyBill = myCO2.calcAverageBill(monthlyBillList);
		
		ArrayList monthlyPricePerKWH = new ArrayList<Double>();
		monthlyPricePerKWH.add(0.1102);
		monthlyPricePerKWH.add(0.1138);
		monthlyPricePerKWH.add(0.1158);
		double averageMonthlyPrice = myCO2.calcAveragePrice(monthlyPricePerKWH);
		
		double annualCO2 = myCO2.calcElectricityCO2(averageMonthlyBill, averageMonthlyPrice);
		
		System.out.printf("Average Monthly Electricity Bill: %.2f%n", averageMonthlyBill);
		System.out.printf("Average Monthly Electricity Price: %.2f%n", averageMonthlyPrice);
		System.out.printf("Annual CO2 Emissions from Electricity Usage: %.1f pounds%n", annualCO2);
	}
}
