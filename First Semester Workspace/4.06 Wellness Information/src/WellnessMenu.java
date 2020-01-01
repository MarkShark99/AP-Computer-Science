/**
PROJECT TITLE: Wellness Menu / WellnessMenu.java
PURPOSE OF PROJECT: To create a small menu with multiple choices and error handling
VERSION or DATE: 9/25/16
AUTHORS: Mark Washington 

**************************** P M R *********************************************
 
<+s>: It was straightforward to complete the menu with String.equals()s
      
<-s>: Eclipse was giving me an error until I added a space and deleted it

           
*******************************************************************************
In the future: Use a try-catch once we learn about them for advanced error handling
*/

import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner mScanner = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.print("Choose a selection: ");
        String choice = mScanner.nextLine();
        choice = choice.toUpperCase();
        System.out.println();
        
        if(choice.equals("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("You chose A for BMI");
        }
        else if(choice.equals("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
        	System.out.println("You chose B for BMR");
        }
        else if (choice.equals("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
        	System.out.println("You chose C for Healthy Eating");
        }
        else if (choice.equals("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
        	System.out.println("You chose D for Food Pyramid");
        }
        else if (choice.equals("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
        	System.out.println("You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
        	System.out.println("That entry is invalid");
        }
    }
}
