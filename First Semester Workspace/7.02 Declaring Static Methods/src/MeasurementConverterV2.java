/**
PROJECT TITLE: Declaring static methods / MeasurementConverterV2.java
PURPOSE OF PROJECT: To practice declaring and calling static methods
VERSION or DATE: 11/11/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Declaring the methods was easy
      
<-s>: The "lbs." wasn't lining up in the first column then I saw that it had to be "lb."

           
*******************************************************************************
In the future: Add comments after I declare a function so people can know what it does
*/

public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        //return statement calculate kilometers goes here     
    	return (mi * 1.60934);
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        //return statement to calculate miles goes here
    	return (km * 0.621371);
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double convertPoundsToKilograms(double lbs)
    {
        return (lbs * 0.453592);
    	//return statement to calculate kilograms goes here    
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    public static double convertKilogramsToPounds(double kg)
    {
    	return (kg * 2.20462); //return statement to calculate pounds goes here     
    }
    
    public static double convertGallonsToLiters(double gl) //Function to convert gallons to liters
    {
    	return (gl * 3.78541); //return statement
    }
    
    public static double convertLitersToGallons(double li) //Function to convert liters to gallons
    {
    	return (li * 0.264172); //return statement
    }
    
    public static double convertInchesToCentimeters(double in) //Function to convert inches to centimeters
    {
    	return (in * 2.54); //return statement
    }
    
    public static double convertCentimetersToInches(double cm) //Function to convert centimeters to inches
    {
    	return (cm * 0.393701); //return statement
    }
    
    public static void main(String[ ] args)
    {
        //local variables
        double miles, feet, inches, pounds, gallons;
        double kilometers, kilograms, liters, centimeters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        
        feet = 6230;
        miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles); //print results goes here
        
        pounds = 204;
        kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);//print results goes here

       
        kilograms = 98.0;
        pounds = convertKilogramsToPounds(kilograms); //call method to convert kilograms to pounds goes here
        System.out.printf("%8.1f kg. = %7.1f lbs. %n", kilograms, pounds); //print results goes here
        
        gallons = 55.0; //declare and initialize the gallons variable goes here
        liters = convertGallonsToLiters(gallons); //call method to convert gallons to liters goes here
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters); //print results goes here
                
        liters = 2.0; //declare and initialize the liters variable goes here
        gallons = convertLitersToGallons(liters); //call method to convert liters to gallons goes here
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons); //print results goes here

        inches = 5.0;
        centimeters = convertInchesToCentimeters(inches);
        System.out.printf("%8.1f in. = %7.1f cm. %n", inches, centimeters); //print results goes here

        centimeters = 34.0;
        inches = convertCentimetersToInches(centimeters);
        System.out.printf("%8.1f cm. = %7.1f in. %n", centimeters, inches); //print results goes here

        
    }//end of main method
	
}//end of class


