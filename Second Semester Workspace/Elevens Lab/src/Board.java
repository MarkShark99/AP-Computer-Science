import java.util.List;
import java.util.ArrayList;

public abstract class Board 
{
	protected Card[] cards;
	private Deck deck;
	private static final boolean I_AM_DEBUGGING = false;

	public Board(int size, String[] ranks, String[] suits, int[] pointValues)
	{
		cards = new Card[size];
		deck = new Deck(ranks, suits, pointValues);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();
	}

	
	public void newGame() 
	{
		deck.shuffle();
		dealMyCards();
	}

	
	public int size() 
	{
		return cards.length;
	}

	
	public boolean isEmpty() 
	{
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				return false;
			}
		}
		return true;
	}

	public void deal(int k) 
	{
		cards[k] = deck.deal();
	}

	
	public int deckSize() 
	{

		return deck.size();
	}


	public Card cardAt(int k) 
	{
		return cards[k];
	}

	
	public void replaceSelectedCards(List<Integer> selectedCards) 
	{
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}


	public List<Integer> cardIndexes() 
	{
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				selected.add(new Integer(k));
			}
		}
		return selected;
	}

	public String toString() 
	{
		String s = "";
		for (int k = 0; k < cards.length; k++) {
			s = s + k + ": " + cards[k] + "\n";
		}
		return s;
	}

	public boolean gameIsWon() 
	{
		if (deck.isEmpty()) {
			for (Card c : cards) {
				if (c != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public abstract boolean isLegal(List<Integer> selectedCards);

	public abstract boolean anotherPlayIsPossible();

	private void dealMyCards()
	{
		for (int k = 0; k < cards.length; k++) {
			cards[k] = deck.deal();
		}
	}
}
