
public class CaesarShiftDecryption
{
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static String getDecryptedMessage(String message, int shift)
	{
		message = message.toLowerCase();
		char[] alphabetArray = alphabet.toCharArray();
		char[] messageArray = message.toCharArray();
		String decryptedMessage = "";
		
		for (char c : messageArray)
		{
			if (c == ' ')
			{
				decryptedMessage += c;
			}
			else if (alphabet.indexOf(c) - shift <= -1)
			{
				decryptedMessage += alphabetArray[(alphabet.indexOf(c) - shift) + 26];
			}
			else
			{
				decryptedMessage += alphabetArray[(alphabet.indexOf(c) - shift)];
			}
		}
		return decryptedMessage;	
	}
}
