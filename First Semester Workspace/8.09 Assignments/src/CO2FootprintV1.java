/**
 * Class to model a person and their car's CO2 footprint
 * @author Mark Washington
 * @version 01/05/17
 */

public class CO2FootprintV1
{
	private double myGallonsUsed = 0;
	private double myTonsCO2 = 0;
	private double myPoundsCO2 = 0;
	
	/**
	 * Constructor for CO2FootprintV1 objects
	 * @param gals gallons of gas used
	 */
	CO2FootprintV1(double gals)
	{
		this.myGallonsUsed = gals;
	}
	
	/**
	 * Mutator method to calculate tons of CO2 from gallons used
	 */
	void calcTonsCO2()
	{
		this.myTonsCO2 = 8.78e-3 * this.myGallonsUsed;
	}
	
	/**
	 * Mutator method to convert tons of CO2 to pounds
	 */
	void convertTonsToPoundsCO2()
	{
		this.myPoundsCO2 =  this.myTonsCO2 * 2000;
	}
	
	/**
	 * Getter method to return tons of CO2
	 * @return Tons of CO2
	 */
	double getTonsCO2()
	{
		return this.myTonsCO2;
	}
	
	/**
	 * Getter method to get pounds of CO2
	 * @return Pounds of CO2
	 */
	double getPoundsCO2()
	{
		return this.myPoundsCO2;
	}
}
