/**
PROJECT TITLE: Currency Conversion / CurrencyConversionV1.java
PURPOSE OF PROJECT: To convert between various currencies
VERSION or DATE: 9/16/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Converting between the currencies was easy once I found the exchange rates
      
<-s>: The math for finding the number of souvenirs and the remaining funds was difficult. 

           
*******************************************************************************
In the future: Do some math out on paper if it's difficult.
*/


/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 */


public class CurrencyConversionV1
{
    public static void main(String [] args)
    {
        // US -> Mexico -> Japan -> France -> US
    	
    	double startingUSDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 0.052073;     // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUSDollars = startingUSDollars;        // local variable for US Dollars remaining
        //remaining variables below here
        
        double yenSpent = 99939.75;
        double yenExchangeRate = 0.009738; //1 Yen =  0.009738 USD
        double dollarsSpentInJapan = 0.0;
        
        double eurosSpent = 624.95;
        double euroExchangeRate = 1.123288; //1 Euro = 1.123288 USD
        double dollarsSpentInFrance;
        
        
        
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
               
        // convertion(?) for Mexican pesos
        dollarsSpentInMexico = pesosSpent * pesoExchangeRate;
        remainingUSDollars -= dollarsSpentInMexico;
        // convertion(?) for Japanese yen
        // code goes below here
        dollarsSpentInJapan = yenSpent * yenExchangeRate;
        remainingUSDollars -= dollarsSpentInJapan;
        
        // convertion(?) for Euros
        // code goes below here
        dollarsSpentInFrance = eurosSpent * euroExchangeRate;
        remainingUSDollars -= dollarsSpentInFrance;
        
        //print output to the screen
        // code goes below here
       
        System.out.println("Starting US Dollars:         " + startingUSDollars);
        System.out.println("US dollars spent in Mexico:  " + dollarsSpentInMexico);
        System.out.println("US dollars spent in Japan:   " + dollarsSpentInJapan);
        System.out.println("US dollars spent in France:  " + dollarsSpentInFrance);
        System.out.println("==================================================");
        System.out.println("Remaining US Dollars:        " + remainingUSDollars + "\n\n");
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 0; 		//how many items can be purchased
		double fundsRemaining1 = 0.0;  //how much of the budget is left

		totalItem1 = budget1 / costItem1;
		fundsRemaining1 = budget1 % costItem1;
		
		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;  //budget for second item
		int totalItem2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
		
		totalItem2 = budget2 / (int)Math.ceil(costItem2);
		fundsRemaining2 = budget2 % costItem2;
		

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

