/**
PROJECT TITLE: TextMessageV2 / TextMessageV2.java
PURPOSE OF PROJECT: To use the scanner class to get input from the user
VERSION or DATE: 9/19/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using the scanner class was easier than when I tried it on my own
      
<-s>: The substring with one parameter was giving me errors and I wasn't sure
      if I could use an if statement yet so I just put in the length of the output

           
*******************************************************************************
In the future: Add error handling
*/

import java.util.Scanner;

public class TextMessageV2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//String inputMessage = "yeah, i'll be right back, and to be honest, i'm laughing out loud. i'm shaking my head right now";
		System.out.print("Type message to translate: ");
		String inputMessage = scan.nextLine();
		System.out.println();
		String outputMessage;
		int inputLength = inputMessage.length();
		
		outputMessage = inputMessage;
		outputMessage = outputMessage.replaceAll("be right back", "brb");
		outputMessage = outputMessage.replaceAll("to be honest", "tbh");
		outputMessage = outputMessage.replaceAll("laughing out loud", "lol");
		outputMessage = outputMessage.replaceAll("shaking my head", "smh");
		outputMessage = outputMessage.replaceAll("right now", "rn");
		System.out.println("Original Message:\n\t" + inputMessage);
		System.out.println("Message length: " + inputLength + '\n');
		
		int outputLength = outputMessage.length();
		
		System.out.println("New Message:\n\t" + outputMessage);
		System.out.println("Message length: " + outputLength + '\n');
		System.out.println("String method samples:");
		System.out.println(" indexOf \"l\": " + outputMessage.indexOf('l')); //Prints the index of the first occurence of "l"
		System.out.println(" subString (two parameters): " + outputMessage.substring(1, outputLength)); //prints from index 1-10 
		System.out.println(" subString (one paremeter):  " + outputMessage.substring(outputLength)); //Prints the output message starting from index 20
		System.out.println(" replaceAll a's:             " + outputMessage.replaceAll("a", "")); //Removes "a" from the output message	
	}
}
