/**
PROJECT TITLE: Binary Search
PURPOSE OF PROJECT: To practice binary searching
VERSION or DATE: 5/10/17
AUTHORS: Mark Washington

 **************************** P M R *********************************************

<+s>: Binary searching was very easy


 *******************************************************************************
In the future: Use this method for searching if the need arises
 */

import java.util.ArrayList;

public class TestMusic2
{
	static String lastSearch;
	static Music2[] myMusic = {
			new Music2("Pieces of You", 1994, "Jewel"),
			new Music2("Jagged Little Pill", 1995, "Alanis Morissette"),
			new Music2("What If It's You", 1995, "Reba McEntire"),
			new Music2("Misunderstood", 2001, "Pink"),
			new Music2("Laundry Service", 2001, "Shakira"),
			new Music2("Taking the Long way", 2006, "Dixie Chicks"),
			new Music2("Under My Skin", 2004, "Avril Lavigne"),
			new Music2("Let Go", 2002, "Avril Lavigne"),
			new Music2("Let It Go", 2007, "Tim McGraw"),
			new Music2("White Flag", 2004, "Dido")
	};

	public static void main(String[] args)
	{
		//Music[] searchResults;

		printMusic();

		sortTitle(0, myMusic.length - 1);
		searchTitle("Misunderstood");
		searchTitle("Under Paid");

		searchYear(2005);
		searchYear(2006);

		searchSinger("Darth Maul");
		searchSinger("Dido");
	}

	public static void printMusic()
	{
		System.out.println("Music Library:");
		System.out.println("--------------");
		for (Music2 m : myMusic)
		{
			System.out.println(m.toString());
		}
		System.out.println("\n");

	}

	public static void searchTitle(String title)
	{
		System.out.println("Search - Title - " + title);
		lastSearch = title;
		boolean titleFound = false;
		
		int high = myMusic.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{ 
			probe = (high + low) / 2;
			if (myMusic[probe].getTitle().compareTo(title) > 0)
			{
				high = probe;
			}
			else
			{
				low = probe;
			}
		}
		if ((low >= 0) && (myMusic[low].getTitle().compareTo(title) == 0))
		{
			titleFound = true;
		}
		if (titleFound)
		{
			System.out.println("We found " + title + " in the library");
			System.out.println(myMusic[low].toString());
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}

	public static void searchYear(int year)
	{
		lastSearch = Integer.toString(year);
		System.out.println("Search - Year - " + year);
		ArrayList<Music2> musicList = new ArrayList<Music2>();
		Music2[] ret = {};
		for(Music2 m : myMusic)
		{
			if (m.getYear() == year)
			{
				musicList.add(m);
			}
		}
		System.out.println("Search Results:");
		if (musicList.size() > 0)
		{
			for (Music2 m : musicList)
			{
				System.out.println(m.toString());
			}
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}

	public static void searchSinger(String singer)
	{
		lastSearch = singer;
		System.out.println("Search - Singer - " + singer);
		ArrayList<Music2> musicList = new ArrayList<Music2>();
		for (Music2 m : myMusic)
		{
			if (m.getSinger().compareTo(singer) == 0)
			{
				musicList.add(m);
			}
		}
		System.out.println("Search Results:");
		if (musicList.size() > 0)
		{
			for (Music2 m : musicList)
			{
				System.out.println(m.toString());
			}
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}

	public static void sortTitle(int low, int high)
	{
		if (low == high)
			return;
		int mid = (low + high) / 2;
		sortTitle(low, mid);
		sortTitle(mid + 1, high);
		mergeTitle(low, mid, high);
	}

	public static void mergeTitle(int low, int mid, int high)
	{
		Music2[] temp = new Music2[high - low + 1];
		int i = low, j = mid + 1, n = 0;

		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = myMusic[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = myMusic[i];
				i++;
			}
			else if (myMusic[i].getTitle().compareTo(myMusic[j].getTitle()) < 0)
				// use < if want to sort ascending
			{
				temp[n] = myMusic[i];
				i++;
			}
			else
			{
				temp[n] = myMusic[j];
				j++;
			}
			n++;
		}
		for (int k = low ; k <= high ; k++)
			myMusic[k] = temp[k - low];
	}

	public static String getLastSearch()
	{
		return lastSearch;
	}
}
