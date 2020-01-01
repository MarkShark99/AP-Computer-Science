import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board
{
	private static final int BOARD_SIZE = 9;
	private static final String[] RANKS = {
			"ace", 
			"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"jack",
			"queen",
	"king"};
	private static final String[] SUITS = {
			"spades", 
			"hearts", 
			"diamonds", 
	"clubs"};

	private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
	private static final boolean I_AM_DEBUGGING = false;

	public ElevensBoard()
	{
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	public boolean isLegal(List<Integer> selectedCards)
	{
		//System.out.println("isLegal: "+ (containsPairSum11(selectedCards) || containsJQK(selectedCards)));

		return (containsPairSum11(selectedCards) || containsJQK(selectedCards));
	}

	public boolean anotherPlayIsPossible()
	{
		//System.out.println("Another play?: " + (containsPairSum11(cardIndexes()) || containsJQK(cardIndexes())));
		return (containsPairSum11(cardIndexes()) || containsJQK(cardIndexes()));
	}

    private boolean containsPairSum11(List<Integer> selectedCards)
    {
        int i = 0;
        int j = 1;
        while (i < selectedCards.size())
        {
            while (j < selectedCards.size())
            {
                int sum = cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue();
                if (sum == 11)
                {
                    int a = selectedCards.get(i);
                    int b = selectedCards.get(j);
                    selectedCards.clear();
                    selectedCards.add(a);
                    selectedCards.add(b);
                    return true;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        return false;
    }
	
	private boolean containsJQK(List<Integer> selectedCards)
	{
		boolean kingFound= false, queenFound = false, jackFound = false;
		for (int i : selectedCards)
		{
			if (!kingFound && cardAt(i).rank().equals("king"))
			{
				kingFound = true;
			}
			else if (!queenFound && cardAt(i).rank().equals("queen"))
			{
				queenFound = true;
			}
			else if (!jackFound && cardAt(i).rank().equals("jack"))
			{
				jackFound = true;
			}
		}
		if (kingFound && queenFound && jackFound) 
		{
			//System.out.println("JQK found\n");
			return true;
		}
		else 
		{
			//System.out.println("No JQK found\n");
			return false;
		}
	} 
}
