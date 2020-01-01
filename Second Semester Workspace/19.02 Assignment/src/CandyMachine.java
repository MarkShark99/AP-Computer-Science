/**
PROJECT TITLE: 19.02
PURPOSE OF PROJECT: To practice assertions and exceptions
VERSION or DATE: 5/23/17
AUTHORS: Mark Washington

**************************** P M R *********************************************

<+s>: Assertions and exceptions were easy to use
      
<-s>: The assignment was kinda vague

           
*******************************************************************************
In the future: Use assertions to make code that can handle errors
*/
public class CandyMachine
{
	public static void main(String[] args)
	{
		Dispenser d1 = new Dispenser(); //Default dispenser
		Dispenser d2 = new Dispenser(50, 4000); //Dispenser with one item
		
		CashRegister c1 = new CashRegister();
		
		//CashRegister c2 = new CashRegister(0); //Causes exception
		sellProduct(d1, c1, 50);
		sellProduct(d2, c1, 50);
		
	}
	
	public static void sellProduct(Dispenser d, CashRegister c, int amountInserted)
	{
		if (d.getCount() > 0 && amountInserted <= d.getProductCost())
		{
			System.out.println("Collect your item at the bottom and enjoy.");
		}
		else
		{
			System.out.println("You don't have enough money or the machine is out of candy.");
		}
	}
}
