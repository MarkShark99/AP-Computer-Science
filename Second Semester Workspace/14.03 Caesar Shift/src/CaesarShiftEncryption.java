
public class CaesarShiftEncryption
{
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static String getEncryptedMessage(String message, int shift)
	{
		message = message.toLowerCase();
		char[] alphabetArray = alphabet.toCharArray();
		char[] messageArray = message.toCharArray();
		String encryptedMessage = "";
		
		for (char c : messageArray)
		{
			if (c == ' ')
			{
				encryptedMessage += c;
			}
			else if (alphabet.indexOf(c) + shift > 25)
			{
				encryptedMessage += alphabetArray[(alphabet.indexOf(c) + shift) - 26];
			}
			else
			{
				encryptedMessage += alphabetArray[(alphabet.indexOf(c) + shift)];
			}
		}
		return encryptedMessage;
	}
}
