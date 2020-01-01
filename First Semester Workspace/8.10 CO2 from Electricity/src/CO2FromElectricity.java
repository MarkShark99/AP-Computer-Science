import java.util.ArrayList;

public class CO2FromElectricity
{
	private double annualCO2;
	private double averageBill;
	private double averagePrice;
	
	/**
	 * Default constructor
	 */
	CO2FromElectricity()
	{
		
	}
	
	/**
	 * 
	 * @param monthlyBill An ArrayList of monthly bills
	 * @return Average monthly electricity bill
	 */
	double calcAverageBill(ArrayList<Double> monthlyBill)
	{
		double total = 0;
		
		for (double bill : monthlyBill)
		{
			total += bill;
		}
		this.averageBill = total / monthlyBill.size();
		return this.averageBill;
	}
	
	/**
	 * 
	 * @param monthlyPrice An ArrayList of monthly prices per KWH of electricity
 	 * @return
	 */
	double calcAveragePrice(ArrayList<Double> monthlyPrice)
	{
		double total = 0;
		
		for (double price : monthlyPrice)
		{
			total += price;
		}
		this.averagePrice = total / monthlyPrice.size();
		return this.averagePrice;
	}
	/**
	 * 
	 * @param avgBill Average monthly bill
	 * @param avgPrice Average monthly price per KWH
	 * @return Average annual price of electricity
	 */
	double calcElectricityCO2(double avgBill, double avgPrice)
	{
		this.annualCO2 = (avgBill / avgPrice) * 1.37 * 12;
		return this.annualCO2;
	}
	
}
