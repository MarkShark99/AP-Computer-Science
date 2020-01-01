/**
PROJECT TITLE: Caesar Shift
PURPOSE OF PROJECT: To practice using static methods
VERSION or DATE: 2/28/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This was a really fun project
      
<-s>: I had some trouble with the decryption

*******************************************************************************
In the future: Use static methods more
*/

import java.util.Scanner;

public class CaesarShiftTester
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String doContinue = "y";
		int shift;
		String message;
		String encryptedMessage;
		String decryptedMessage;
		
		while (doContinue.toLowerCase().equals("y"))
		{
			encryptedMessage = "";
			decryptedMessage = "";
			
			System.out.print("Enter key: ");
			shift = Integer.parseInt(mScanner.nextLine());
			
			System.out.print("Enter message to encrypt: ");
			message = mScanner.nextLine();
			
			encryptedMessage = CaesarShiftEncryption.getEncryptedMessage(message, shift);
			decryptedMessage = CaesarShiftDecryption.getDecryptedMessage(encryptedMessage, shift);
			
			System.out.println("Encrypted Message: " + encryptedMessage);
			System.out.println("Decrypted Message: " + decryptedMessage);

			System.out.print("Continue? (y/n): ");
			doContinue = mScanner.nextLine();
		}
		mScanner.close();
		System.out.println("Done.");
	}
}
