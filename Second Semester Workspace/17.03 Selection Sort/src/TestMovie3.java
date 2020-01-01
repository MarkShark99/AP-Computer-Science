/**
PROJECT TITLE: 17.03
PURPOSE OF PROJECT: Selection sorting
VERSION or DATE: 4/16/17
AUTHORS: Mark Washington

 **************************** P M R *********************************************

<+s>: Once I had it down, sorting was easy

<-s>: Sorting was difficult to begin with


 *******************************************************************************
In the future: Maybe use this method for sorting when needed
 */

public class TestMovie3
{
	static enum sortOrder {kSortAscending, kSortDescending};
	static Movie[] myMovies = { 
			new Movie("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
			new Movie("Mulan Special Edition", 2004, "Disney"),
			new Movie("Shrek 2", 2004, "Dreamworks"),
			new Movie("The Incredibles", 2004, "Pixar"),
			new Movie("Nanny McPhee", 2006, "Universal"),
			new Movie("The Curse of the Were-Rabbit", 2006, "Aardman"),
			new Movie("Ice Age", 2002, "20th Century Fox"),
			new Movie("Lilo & Stitch", 2002, "Disney"),
			new Movie("Robots", 2005, "20th Century Fox"),
			new Movie("Monsters Inc.", 2001, "Pixar")};

	public static void main(String[] args)
	{	
		System.out.println("Before Sorting:");
		printMovies();

		System.out.println("Sorted by Title - Descending");
		sortTitles(sortOrder.kSortDescending);
		printMovies();

		System.out.println("Sorted by Year - Descending");
		sortYears(sortOrder.kSortDescending);
		printMovies();

		System.out.println("Sorted by Studio - Ascending");
		sortStudios(sortOrder.kSortAscending);
		printMovies();
	}

	public static void printMovies()
	{
		for(Movie movie : myMovies)
		{
			System.out.println(movie.toString());
		}
		System.out.println();
	}

	public static void sortTitles(sortOrder order)
	{
		if(order == sortOrder.kSortAscending)
		{
			for (int i = 0; i < myMovies.length - 1; ++i)
			{
				int k = i;
				for (int j = i + 1; j < myMovies.length; ++j)
				{
					if ((myMovies[j].getTitle()).compareTo(myMovies[k].getTitle()) < 0)
					{
						k = j;
					}
				}
				Movie tempMovie = myMovies[i];
				myMovies[i] = myMovies[k];
				myMovies[k] = tempMovie;
			}
		}
		else if (order == sortOrder.kSortDescending)
		{
			for (int i = 0; i < myMovies.length - 1; ++i)
			{
				int k = i;
				for (int j = i + 1; j < myMovies.length; ++j)
				{
					if ((myMovies[j].getTitle()).compareTo(myMovies[k].getTitle()) > 0)
					{
						k = j;
					}
				}
				Movie tempMovie = myMovies[i];
				myMovies[i] = myMovies[k];
				myMovies[k] = tempMovie;
			}
		}
	}

	public static void sortYears(sortOrder order)
	{
		Movie tempMovie;
		int j;
		if(order == sortOrder.kSortAscending)
		{
			for (int i = myMovies.length - 1 ; i > 0 ; i-- )
			{
				j = 0;
				for (int k = 1 ; k <= i ; k++ )
				{
					if ( myMovies[ k ].getYear() > myMovies[j].getYear())
					{
						j = k;
					}
				}
				tempMovie = myMovies[ i ];
				myMovies[ i ] = myMovies[j];
				myMovies[j] = tempMovie;
			}
		}
		else if (order == sortOrder.kSortDescending)
		{
			for (int i = myMovies.length - 1 ; i > 0 ; i-- )
			{
				j = 0;
				for (int k = 1 ; k <= i ; k++ )
				{
					if ( myMovies[k].getYear() < myMovies[j].getYear() )
					{
						j = k;
					}
				}
				tempMovie = myMovies[ i ];
				myMovies[i] = myMovies[j];
				myMovies[j] = tempMovie;
			}
		}
		else
		{
			System.out.println("ERROR");
		}
	}

	public static void sortStudios(sortOrder order)
	{
		if(order == sortOrder.kSortAscending)
		{
			for (int i = 0; i < myMovies.length - 1; ++i)
			{
				int k = i;
				for (int j = i + 1; j < myMovies.length; ++j)
				{
					if ((myMovies[j].getStudio()).compareTo(myMovies[k].getStudio()) < 0)
					{
						k = j;
					}
				}
				Movie tempMovie = myMovies[i];
				myMovies[i] = myMovies[k];
				myMovies[k] = tempMovie;
			}
		}
		else if (order == sortOrder.kSortDescending)
		{
			for (int i = 0; i < myMovies.length - 1; ++i)
			{
				int k = i;
				for (int j = i + 1; j < myMovies.length; ++j)
				{
					if ((myMovies[j].getStudio()).compareTo(myMovies[k].getStudio()) > 0)
					{
						k = j;
					}
				}
				Movie tempMovie = myMovies[i];
				myMovies[i] = myMovies[k];
				myMovies[k] = tempMovie;
			}
		}
	}
}