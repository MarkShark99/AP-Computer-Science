/**
PROJECT TITLE: Measurement Converter / MeasurementConverterV1.java
PURPOSE OF PROJECT: To convert between two types of measurements
VERSION or DATE: 9/12/16
AUTHORS: Mark Washington 

**************************** P M R *********************************************
 
<+s>: Doubles were good for precise measurements
	  
      
<-s>: I didn't add as many comments as I should have the first time through

           
*******************************************************************************
In the future: Add more comments while I write the code instead of after

*/


/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Mark Washington
 * Date: 9/12/16
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        //Miles and feet
    	double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        
        //Kilometers and # of miles per one kilometer
        double kilometers; // distance in kilometers// number of miles per one kilometer.
        double milesPerKilometer = 0.621371;// number of miles per one kilometer.
        
        //Kilograms and pounds
        double kilograms;
        double pounds;
        double poundsPerKilogram = 2.20462;
        
        //Gallons and liters
        double gallons;
        double liters;
        double litersPerGallon = 3.78541;
        
        //Meters and inches
        double meters;
        double inches;
        double inchesPerMeter = 39.3701;
        
        //...finish declaring local variables here, including end of line
        //...comments documenting purpose of each variable
        
        
        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 2.1;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft.");

        //convert miles to kilometers
        miles  = 8.0;
        kilometers = miles / milesPerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        
        //Convert kilometers to miles
        kilometers = 5;
        miles = kilometers * milesPerKilometer;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        
        //Convert pounds to kilograms
        pounds = 9.3;
        kilograms = pounds / poundsPerKilogram;
        System.out.println(pounds + " lbs. = " + kilograms + " kg.");
        
        //Convert kilograms to pounds
        kilograms = 7.6;
        pounds = kilograms * poundsPerKilogram;
        System.out.println(kilograms + " kg. = " + pounds + " lbs.");
        
        //Convert gallons to liters
        gallons = 3.2;
        liters = gallons * litersPerGallon;
        System.out.println(gallons +  " gallons = " + liters + " liters");
        
        //Convert liters to gallons
        liters = 2.3;
        gallons = liters / litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gallons");
        
        //Convert inches to meters
        inches = 8.4;
        meters = inches / inchesPerMeter;
        System.out.println(inches + " in. = " + meters + " m.");
        
        //Convert meters to inches
        meters = 12;
        inches = meters * inchesPerMeter;
        System.out.println(meters + " m. = " + inches + "in.");
        
    }//end of main method
}//end of class

