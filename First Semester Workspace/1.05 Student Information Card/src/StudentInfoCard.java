/**
 *
 *PROJECT TITLE: 1.05 Student info card> / StudentInfoCard.java
 *PURPOSE OF PROJECT: Display information about me using print and println
 *VERSION or DATE: 9/7/2016
 *AUTHORS: Mark Washington
 *
 ***************************** P M R *********************************************
 *
 *<+s>: Using Eclipse was easy for writing and testing my code, I prefer its layout to BlueJ's
 *		print and println were very simple to use
 *    
 *<-s>: I originally had everything in each section on one line so I had to go back and change them to multiple print statements
 *		Aligning everything took some time
 *          
 *******************************************************************************
 *In the future: Make sure to read the instructions fully to avoid making mistakes like I did
 *
 */

/**
 * Name: Mark Washington
 * Date: 9/7/16
 * Age: 16
 * 
 * This program displays information about me in the style of a student information card
 *
 */



public class StudentInfoCard
{
	public static void main(String[] args)
	{
		//Title
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*         Student Information          *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		
		//Name, birthday, and age
		System.out.print("Name: Mark Washington		");
		System.out.print("Birthday: 9/30/99		");
		System.out.println("Age: 16\n");
		
		//School, Grade, and City
		System.out.print("School: Lakeshore High School		");
		System.out.print("Grade: 11		");
		System.out.println("City: Stevensville\n");
		
		//Home phone, cell phone, and available times
		System.out.print("Home phone:");
		System.out.println("Available: 1:35 - 9:00 pm M-F");
		System.out.println("Cell Phone:\n");
		
		//Current math and programming experience
		System.out.println("Current Math: Pre-calculus");
		System.out.println("Previous programming experience:\n2 years of C++ with FIRST Robotics, 1.5 years of Python, a bit of Java\n");
		System.out.print("I am taking this course because I'm interested in computer\nscience, I want to further my experience in Java, and I want an AP credit.");
	}
}
