/**
PROJECT TITLE: TextMessageV1 / TextMessageV1.java
PURPOSE OF PROJECT: To demonstrate how to modify strings using the String class
VERSION or DATE: 9/19/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using the string modification methods was easy
      
<-s>: I accidentally put chars into a substring method instead of strings

           
*******************************************************************************
In the future: Look up what datatypes these methods accept
*/

public class TextMessageV1 {
	public static void main(String[] args)
	{
		String inputMessage = "yeah, i'll be right back, and to be honest, i'm laughing out loud. i'm shaking my head right now";
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
		System.out.println(" subString (two parameters): " + outputMessage.substring(1, 10)); //prints from index 1-10 
		System.out.println(" subString (one paremeter):  " + outputMessage.substring(20)); //Prints the output message starting from index 20
		System.out.println(" replaceAll a's:             " + outputMessage.replaceAll("a", "")); //Removes "a" from the output message	
	}
}
