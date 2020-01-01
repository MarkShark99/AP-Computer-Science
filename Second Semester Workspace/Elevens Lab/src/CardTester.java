
//Rank   A 2 3 4 5 6 7 8 9 10 J Q K
//Points 1 2 3 4 5 6 7 8 9 10 0 0 0
public class CardTester {

	
	public static void main(String[] args)
	{
		Card card1 = new Card("King", "Diamonds", 0);
		Card card2 = new Card("Ace", "Clubs", 1);
		Card card3 = new Card("3", "Hearts", 3);
		
		System.out.println("Card 1's rank is " + card1.rank());
		System.out.println("Card 2's suit is " + card2.suit());
		System.out.println("Card 3's point value is " + card3.pointValue());
		System.out.println("Does Card 1 equal Card 2? " + card1.matches(card2));
		System.out.println("Information about Card 3: " + card3);
	}
}
