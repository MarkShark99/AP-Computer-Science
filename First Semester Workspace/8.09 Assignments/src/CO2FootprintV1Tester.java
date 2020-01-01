/**
PROJECT TITLE: CO2 Footprint
PURPOSE OF PROJECT: To practice using javadocs
VERSION or DATE: 1/6/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Javadocs were easy to use
           
*******************************************************************************
In the future: Use javadocs to document programs
*/

public class CO2FootprintV1Tester
{
	public static void main(String[] args) //Main method
	{
		//Projected annual gallons: 1299.48 
		double annualGallons = 1299.48;
		CO2FootprintV1 footprint = new CO2FootprintV1(annualGallons);
		footprint.calcTonsCO2();
		footprint.convertTonsToPoundsCO2();
		double tonsCO2 = footprint.getTonsCO2();
		double lbsCO2 = footprint.getPoundsCO2();
		
		System.out.printf("%25s%n", "CO2 Emissions");
		System.out.println("Gallons    Pounds      Tons");
		System.out.println("of Gas    from Gas   from Gas");
		System.out.println("****************************");
		System.out.printf("%6.1f   %8.2f    %6.3f", annualGallons, lbsCO2, tonsCO2);
	}
}
