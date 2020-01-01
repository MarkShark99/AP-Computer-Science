
public class RecursivePalindrome
{
	public static boolean isPalindrome(String s)
	{
		s = s.toLowerCase(); //Convert string to lowercase
		s = removeNonLetters(s); //Use regex to replace all non-letter characters in string
		if (s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		else
		{
			if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
			else return false;
		}
	}
	private static String removeNonLetters(String s)
	{
		return s.replaceAll("[\\W]", "");
	}
}
