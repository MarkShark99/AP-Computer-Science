/**
PROJECT TITLE: Project Mona / Mona.java
PURPOSE OF PROJECT: To notify a person of their over library book
VERSION or DATE: 9/21/16 VERSION 2
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Scanner was easy to use once I solved the space problem
      
<-s>: At first I had some problems with spaces messing with the scanner but I fixed it
      I wasn't sure if I'm supposed to be using arrays yet, but I couldn't think of another way to flip two words

           
*******************************************************************************
In the future: Add comments while I write the code
*/

import java.util.Scanner; //imports scanner

public class Mona
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in); //make new scanner
		
		//Prompt user for these inputs
		System.out.print("Name (Last, First): ");
		String name = mScanner.nextLine();
		System.out.print("Phone Number ((xxx) xxx-xxxx): ");
		String phoneNumber = mScanner.nextLine();
		System.out.print("Book name: ");
		String bookName = mScanner.nextLine();
		System.out.print("Date of checkout (mm/dd/yy): ");
		String date = mScanner.nextLine();
		System.out.print("Number of days overdue: ");
		String daysOverdue = mScanner.nextLine();
		System.out.print("Daily fine: ");
		String dailyFine = mScanner.nextLine();
		
		//Set fine and days overdue to double and int
		double doubleDailyFine = Double.parseDouble(dailyFine);
		int intDaysOverdue = Integer.parseInt(daysOverdue);
		double totalFine = doubleDailyFine * intDaysOverdue;
		totalFine = (double)(Math.round(totalFine * Math.pow(10, 2)) / Math.pow(10, 2)); //Round fine to 2 decimal places
		
		/** Old code using arrays
		 * reorder the name and date
		 
		String[] nameArray = name.split(" "); //split into an array at every space
		String firstName = nameArray[1];
		String lastName = nameArray[0].replaceAll(",", "");
		//System.out.println(firstName + " " + lastName); //For testing
		
		String[] dateArray = date.split("/");
		String month = dateArray[0];
		String day = dateArray[1];
		String year = dateArray[2];
		*/
		
		String lastName = name.substring(0, name.indexOf(','));
		String firstName = name.substring(name.indexOf(','));
		firstName = firstName.replaceAll(",", "").replaceAll(" ", ""); //Remove space and comma from first name
		System.out.println(firstName + " " + lastName);
		
		//Produce email
		System.out.println("\n\n------ Email ------\n");
		System.out.println("To: " + firstName + " " + lastName + " (" +(firstName.substring(0,1) + lastName.substring(0, 2)).toLowerCase() + phoneNumber.substring(phoneNumber.length() - 3, phoneNumber.length()) + "@csamediacenter.com)\n");
		System.out.println("From: Mona (mona@csamediacenter.com)\n");
		System.out.println("Subject: Overdue Book Notice\n=======================");
		System.out.println("The book you checked out on " + date.replaceAll("/", "-") +  " is overdue.");
		System.out.println("Book: " + bookName);
		System.out.println("The book is " + daysOverdue + " day(s) overdue");
		System.out.println("Your fine is $" + totalFine);
		
	}

}
