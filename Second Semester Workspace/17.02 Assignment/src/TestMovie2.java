/**
PROJECT TITLE: 17.02
PURPOSE OF PROJECT: Insertion sorting
VERSION or DATE: 4/16/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Once I had it down, sorting was easy
      
<-s>: Sorting was difficult to begin with

           
*******************************************************************************
In the future: Maybe use this method for sorting when needed
*/

public class TestMovie2
{
	static enum sortOrder {kSortAscending, kSortDescending};
	static Movie2[] myMovies = { 
			new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
			new Movie2("Mulan Special Edition", 2004, "Disney"),
			new Movie2("Shrek 2", 2004, "Dreamworks"),
			new Movie2("The Incredibles", 2004, "Pixar"),
			new Movie2("Nanny McPhee", 2006, "Universal"),
			new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman"),
			new Movie2("Ice Age", 2002, "20th Century Fox"),
			new Movie2("Lilo & Stitch", 2002, "Disney"),
			new Movie2("Robots", 2005, "20th Century Fox"),
			new Movie2("Monsters Inc.", 2001, "Pixar")};

	public static void main(String[] args)
	{	
		System.out.println("Before Sorting:");
		printMovies();
		
		System.out.println("Sorted by Title - Ascending");
		sortTitles(sortOrder.kSortAscending);
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
		for(Movie2 movie : myMovies)
		{
			System.out.println(movie.toString());
		}
		System.out.println();
	}
	
	public static void sortTitles(sortOrder order)
    {
        Movie2[] newMyMovies = new Movie2[myMovies.length];
        
        if(order == sortOrder.kSortAscending)
        {
            for(int i = 0; i < myMovies.length; i++)
            {

            	String next = myMovies[i].getTitle();
                int insertIndex = 0;
                int k = i;
                while(k > 0 && insertIndex == 0)
                {
                    if(next.compareTo(newMyMovies[k-1].getTitle()) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insertIndex] = myMovies[i];
            }
            myMovies = newMyMovies;
        }
        else if (order == sortOrder.kSortDescending)
        {
            for(int i=0; i < myMovies.length;i++)
            {
                String next = myMovies[i].getTitle();
                int insertIndex = 0;
                int k =i;
                while(k > 0 && insertIndex == 0)
                {
                    if(next.compareTo(newMyMovies[k-1].getTitle()) < 0)
                    {
                    	insertIndex = k;
                    }
                    else
                    {
                    	newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insertIndex] = myMovies[i];
            }
            myMovies = newMyMovies;
        }
    }
	
    public static void sortYears(sortOrder order)
    {
        Movie2[] newMyMovies = new Movie2[myMovies.length];
        if(order == sortOrder.kSortAscending)
        {
            for(int i=0; i < myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertIndex = 0;
                int k = i;
                while(k > 0 && insertIndex == 0)
                {
                    if(next.getYear() < newMyMovies[k-1].getYear())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                    	newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insertIndex] = next;
            }
            myMovies = newMyMovies;
        }
        else if (order == sortOrder.kSortDescending)
        {
            for(int i=0;i < myMovies.length;i++)
            {
                Movie2 next = myMovies[i];
                int insert = 0;
                int k =i;
                while(k>0 && insert == 0)
                {
                    if(next.getYear() < newMyMovies[k-1].getYear())
                    {
                        insert = k;
                    }
                    else
                    {
                    	newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insert] = myMovies[i];
            }
            myMovies = newMyMovies;
        }
    }
    
    public static void sortStudios(sortOrder order)
    {
        Movie2[] newMyMovies = new Movie2[myMovies.length];
        if (order == sortOrder.kSortAscending)
        {
            for(int i = 0; i < myMovies.length; i++)
            {
                String next = myMovies[i].getStudio();
                int insertIndex = 0;
                int k =i;
                while(k>0 && insertIndex == 0)
                {
                    if(next.compareTo( newMyMovies[k-1].getStudio() ) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                    	newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insertIndex] = myMovies[i];
            }
            myMovies = newMyMovies;
        }
        else if (order == sortOrder.kSortDescending)
        {
            for(int i = 0; i < myMovies.length; i++)
            {
                String next = myMovies[i].getStudio();
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(next.compareTo( newMyMovies[k-1].getStudio() ) < 0)
                    {
                        insert = k;
                    }
                    else
                    {
                    	newMyMovies[k] = newMyMovies[k-1];
                    }
                    k--;
                }
                newMyMovies[insert] = myMovies[i];
            }
            myMovies = newMyMovies;
        }
    }
}