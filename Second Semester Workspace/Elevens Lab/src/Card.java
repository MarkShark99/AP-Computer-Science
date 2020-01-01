public class Card
{	
	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue)
	{
		this.rank = cardRank;
		this.suit = cardSuit;
		this.pointValue = cardPointValue;
	}

	public String suit()
	{
		return this.suit;
	}
	public String rank()
	{
		return this.rank;
	}

	public int pointValue()
	{
		return this.pointValue;
	}

	public boolean matches(Card otherCard)
	{
		if (this.suit == otherCard.suit() && this.rank == otherCard.rank() && this.pointValue == otherCard.pointValue())
		{
			return true;
		}
		else return false;
	}

	@Override
	public String toString()
	{
		return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
	}
}