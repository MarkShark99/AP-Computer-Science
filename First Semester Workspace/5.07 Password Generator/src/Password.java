import java.util.Scanner;
import java.util.Random;

public class Password
{
	public static void main(String[] args)
	{
		int setSelection = 0;
		int passwordLength = 0;
		int genMode;
		
		char nextChar = ' ';
		
		boolean isRunning = true;
		boolean doneSelectingSet = false;
		boolean doneSelectingMode = false;
		boolean doExit = false;
		
		String doContinue = "";
		String password = "";
		
		Scanner mScanner = new Scanner(System.in);
		Random mRandom = new Random();
		
		while (isRunning == true)
		{
			doneSelectingSet = false;
			doneSelectingMode = false;
			password = "";
			
			while (doneSelectingSet == false)
			{
				System.out.println("1. Uppercase letters only");
				System.out.println("2. Lowercase letters only");
				System.out.println("3. Letters and numbers");
				System.out.println("4. Letters, numbers, and symbols");
				System.out.println("5. Exit");
				System.out.print("Select a set (1-5): ");
				setSelection = mScanner.nextInt();
				if (setSelection >= 1 && setSelection <= 5)
				{
					doneSelectingSet = true;
					if (setSelection == 5)
					{
						doExit = true;
					}
				}
			}
			if (doExit == true) break;
			while (doneSelectingMode == false && doExit == false)
			{
				System.out.print("How many characters long shall your password be? (Must be 6 characters or more): ");
				passwordLength = mScanner.nextInt();
				if (passwordLength >= 6)
				{
					doneSelectingMode = true;
				}
			}
			//generate password
			while (password.length() < passwordLength)
			{
				if (setSelection == 1)
				{
					nextChar = (char)(mRandom.nextInt(26) + 65);
				}
				else if (setSelection == 2)
				{
					nextChar = (char)(mRandom.nextInt(26) + 97);
				}
				else if (setSelection == 3)
				{
					genMode = mRandom.nextInt(3);
					if (genMode == 0) //Uppercase
					{
						nextChar = (char)(mRandom.nextInt(26) + 65);
					}
					else if (genMode == 1) //Lowercase
					{
						nextChar = (char)(mRandom.nextInt(26) + 97);
					}
					else if (genMode == 2) //Number
					{
						nextChar = (char)(mRandom.nextInt(10) + 48);
					}
				}
				else if (setSelection == 4)
				{
					genMode = mRandom.nextInt(4);
					if (genMode == 0) //Uppercase
					{
						nextChar = (char)(mRandom.nextInt(26) + 65);
					}
					else if (genMode == 1) //Lowercase
					{
						nextChar = (char)(mRandom.nextInt(26) + 97);
					}
					else if (genMode == 2) //Number
					{
						nextChar = (char)(mRandom.nextInt(10) + 48);
					}
					else if (genMode == 3)
					{
						genMode = mRandom.nextInt(3);
						if (genMode == 0)
						{
							nextChar = (char)(mRandom.nextInt(7) + 58);
						}
						else if (genMode == 1)
						{
							nextChar = (char)(mRandom.nextInt(6) + 91);
						}
						else if (genMode == 2)
						{
							nextChar = (char)(mRandom.nextInt(4) + 123);
						}
					}
				}
				//System.out.println(nextChar); //debug
				password += nextChar;
			}
			
			System.out.println("\n\nPassword: " + password);
			System.out.print("Generate another password? (Y/N): ");
			doContinue = mScanner.next();
			doContinue = doContinue.toLowerCase();
			if (doContinue.equals("y") == false)
			{
				isRunning = false;
			}
		}
		mScanner.close();
	}
}
