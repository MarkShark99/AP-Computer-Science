/**
PROJECT TITLE: 17.04
PURPOSE OF PROJECT: Merge sorting
VERSION or DATE: 5/4/17
AUTHORS: Mark Washington

 **************************** P M R *********************************************

<-----s>: Everything


 *******************************************************************************
In the future: Don't sort like this
 */

public class TestMovie4
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

		System.out.println("Sorted by Title - Ascending");
		sortTitles(0, myMovies.length - 1);
		printMovies();

		System.out.println("Sorted by Year - Descending");
		sortYears(0, myMovies.length - 1);
		printMovies();

		
		System.out.println("Sorted by Studio - Ascending");
		sortStudios(0, myMovies.length - 1);
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

	public static void sortYears(int low, int high)
	{
		if (low == high)
		{
			return;
		}
		int mid = (low + high) / 2;
		sortYears(low, mid);
		sortYears(mid + 1, high);
		mergeYears(low, mid, high);
	}

	public static void mergeYears(int low, int mid, int high)
	{
		Movie[] temp = new Movie[high - low + 1];
		int i = low, j = mid + 1, n = 0;
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = myMovies[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = myMovies[i];
				i++;
			}
			else if (myMovies[i].getYear() > myMovies[j].getYear())
			{
				temp[n] = myMovies[i];
				i++;
			}
			else
			{
				temp[n] = myMovies[j];
				j++;
			}
			n++;
		}
		for (int k = low ; k <= high ; k++)
		{
			myMovies[k] = temp[k - low];
		}
	} 

	public static void sortTitles(int low, int high)
	{
		if (low == high)
			return;
		int mid = (low + high) / 2;
		sortTitles(low, mid);
		sortTitles(mid + 1, high);
		mergeTitles(low, mid, high);
	}
	
	public static void mergeTitles(int low, int mid, int high)
	{
		Movie[] temp = new Movie[high - low + 1];
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = myMovies[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = myMovies[i];
				i++;
			}
			else if (myMovies[i].getTitle().compareTo(myMovies[j].getTitle()) < 0)
				// use < if want to sort ascending
			{
				temp[n] = myMovies[i];
				i++;
			}
			else
			{
				temp[n] = myMovies[j];
				j++;
			}
			n++;
		}
		for (int k = low ; k <= high ; k++)
			myMovies[k] = temp[k - low];
	}
	
	public static void sortStudios(int low, int high)
	{
		if (low == high)
			return;
		int mid = (low + high) / 2;
		sortStudios(low, mid);
		sortStudios(mid + 1, high);
		mergeStudios(low, mid, high);
	}
	
	public static void mergeStudios(int low, int mid, int high)
	{
		Movie[] temp = new Movie[high - low + 1];
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = myMovies[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = myMovies[i];
				i++;
			}
			else if (myMovies[i].getStudio().compareTo(myMovies[j].getStudio()) < 0)
				// use < if want to sort ascending
			{
				temp[n] = myMovies[i];
				i++;
			}
			else
			{
				temp[n] = myMovies[j];
				j++;
			}
			n++;
		}
		for (int k = low ; k <= high ; k++)
			myMovies[k] = temp[k - low];
	}
}