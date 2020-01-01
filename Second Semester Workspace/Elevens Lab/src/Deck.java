import java.util.List;
import java.util.ArrayList;

public class Deck {

	private List<Card> cards; //List of cards in deck
	private int size; //Size of the deck

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		cards = new ArrayList<Card>();
		for (String s : suits)
		{
			for (int i = 0; i < ranks.length; i++)
			{
				this.cards.add(new Card(ranks[i], s, values[i]));
			}
		}
		this.size = cards.size();
		shuffle();
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty()
	{
		if (this.size == 0)
		{
			return true;
		}
		else return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size()
	{
		return this.size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle()
	{
		//int[] shuffled = new int[VALUE_COUNT];
		int r;
		Card tempCard;
		int s = this.cards.size();
		for (int k = s - 1; k > 0; k--)
		{
			r = (int)(Math.random() * s);
			tempCard = this.cards.get(k);
			this.cards.set(k, this.cards.get(r));
			this.cards.set(r, tempCard);
		}
		this.size = this.cards.size();
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal()
	{
		if (size > 0)
		{
			size--;
			return this.cards.get(size);
		}
		else return null;
	}
	
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + "\n";
			}
			//Made output readable
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}