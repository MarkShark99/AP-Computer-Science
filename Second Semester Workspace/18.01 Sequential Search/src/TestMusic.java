/**
PROJECT TITLE: Sequential Search
PURPOSE OF PROJECT: To practice sequential searching
VERSION or DATE: 4/19/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Sequential searching was very easy

           
*******************************************************************************
In the future: Use this method for searching if the need arises
*/

import java.util.ArrayList;

public class TestMusic
{
	static String lastSearch;
	static Music[] myMusic = {
		new Music("Pieces of You", 1994, "Jewel"),
		new Music("Jagged Little Pill", 1995, "Alanis Morissette"),
		new Music("What If It's You", 1995, "Reba McEntire"),
		new Music("Misunderstood", 2001, "Pink"),
		new Music("Laundry Service", 2001, "Shakira"),
		new Music("Taking the Long way", 2006, "Dixie Chicks"),
		new Music("Under My Skin", 2004, "Avril Lavigne"),
		new Music("Let Go", 2002, "Avril Lavigne"),
		new Music("Let It Go", 2007, "Tim McGraw"),
		new Music("White Flag", 2004, "Dido")
	};
	
	public static void main(String[] args)
	{
		//Music[] searchResults;
		
		printMusic();
		
		searchTitle("Let Go");
		searchTitle("Some Day");
		
		searchYear(2001);
		searchYear(2003);
		
		searchSinger("Avril Lavigne");
		searchSinger("Tony Curtis");
		
	}
	
	public static void printMusic()
	{
		System.out.println("Music Library:");
		System.out.println("--------------");
		for (Music m : myMusic)
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
		for (Music m : myMusic)
		{
			if (m.getTitle().compareTo(title) == 0)
			{
				titleFound = true;
				System.out.println("We found " + title + " in the library");
				System.out.println(m.toString());
				break;
			}
		}
		if (!titleFound)
		{
			System.out.println("No results found");
		}
		System.out.println();
	}
	
	public static void searchYear(int year)
	{
		lastSearch = Integer.toString(year);
		System.out.println("Search - Year - " + year);
		ArrayList<Music> musicList = new ArrayList<Music>();
		Music[] ret = {};
		for(Music m : myMusic)
		{
			if (m.getYear() == year)
			{
				musicList.add(m);
			}
		}
		System.out.println("Search Results:");
		if (musicList.size() > 0)
		{
			for (Music m : musicList)
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
		ArrayList<Music> musicList = new ArrayList<Music>();
		for (Music m : myMusic)
		{
			if (m.getSinger().compareTo(singer) == 0)
			{
				musicList.add(m);
			}
		}
		System.out.println("Search Results:");
		if (musicList.size() > 0)
		{
			for (Music m : musicList)
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
	
	public static String getLastSearch()
	{
		return lastSearch;
	}
}
