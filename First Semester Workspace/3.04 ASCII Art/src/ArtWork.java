/**
PROJECT TITLE: ASCII Art / ArtWork.java
PURPOSE OF PROJECT: To draw some ASCII art
VERSION or DATE: 9/19/2016
AUTHORS:  Mark Washington

**************************** P M R *********************************************
 
<+s>: Escape sequences allowed me to make multiple newlines in one line of code
      
<-s>: I didn't assign the strings to objects at first so it took some time to change them to objects 

           
*******************************************************************************
In the future: Assign strings to objects before printing them.
*/

public class ArtWork {
	public static void main(String[] args)
	{
		//turn art into strings
  	    String asciiRow1 = "    #     ###### ##### ##### #####\n";
  	    String asciiRow2 = "   # #    #      #       #     #\n";
  	    String asciiRow3 = "  #   #   ###### #       #     #\n";
  	 	String asciiRow4 = " #######       # #       #     #\n";
  	    String asciiRow5 = "#       # ###### ##### ##### #####\n\n";

	    String artRow1 = "          #     ###### ######\n";
	    String artRow2 = "         # #    #    #   #\n";
	    String artRow3 = "        #   #   ######   #\n";
	    String artRow4 = "       #######  #   #    #\n";
	    String artRow5 = "      #       # #    #   #\n\n";
	    
	    String myName = "Mark W.";
	    
	    //print the above strings
	    System.out.print(asciiRow1);
	    System.out.print(asciiRow2);
	    System.out.print(asciiRow3);
	    System.out.print(asciiRow4);
	    System.out.print(asciiRow5);
	    
	    System.out.print(artRow1);
	    System.out.print(artRow2);
	    System.out.print(artRow3);
	    System.out.print(artRow4);
	    System.out.print(artRow5);
	    
	    System.out.print("Made by " + myName); //concatenation between a literal and an object
	}

}
