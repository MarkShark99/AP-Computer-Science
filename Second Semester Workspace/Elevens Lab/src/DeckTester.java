/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		//Deck deck1 = new Deck(new String[] {"King", "Ace", "3"}, new String[] {"Hearts", "Spades", "Diamonds"}, new int[] {0, 1, 3});
		//Deck deck2 = new Deck(new String[] {"4", "5", "6"}, new String[] {"Clubs", "Diamonds", "Spades"}, new int[] {4, 5, 6});
		//Deck deck3 = new Deck(new String[] {"7", "8", "Ace"}, new String[] {"Diamonds", "Spades", "Clubs"}, new int[] {7, 8, 1});
		
		/*
		System.out.println("Is deck 1 empty? " + deck1.isEmpty());
		System.out.println("Size of deck 1: " + deck1.size());
		System.out.println("Size of deck 2: " + deck2.size());
		System.out.println("Size of deck 3: " + deck3.size());
		
		System.out.println("Dealing one card from deck 2");
		deck2.deal();
		System.out.println("Size of deck 2: " + deck2.size());
		
		System.out.println("Info about deck 3: " + deck3);
		*/
		
		Deck testDeck = new Deck(new String[] {"Ace", "King", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, new String[] {"Diamonds", "Clubs", "Hearts", "Spades"}, new int[] {11, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		
		System.out.println(testDeck);
		testDeck.shuffle();
		System.out.println(testDeck);
	}
}
