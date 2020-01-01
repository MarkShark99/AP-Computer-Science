/**
PROJECT TITLE: 18.03 Assignment
PURPOSE OF PROJECT: To do searching
VERSION or DATE: 5/11/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Searching and sorting was easy

           
*******************************************************************************
In the future: Use what I've learned if I need to search an array for something
*/

import java.util.ArrayList;

public class TestContact
{
	static Contact[] myContacts = {
			new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com"),
			new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com"),
			new Contact("Ellie Carter", "me", "Jun 10", "(342) 555‐8102", "ecarter@carter.com"),
			new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555‐9182", "susieE@hotmail.com"),
			new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com"),
			new Contact("Johnnie", "friend", "Jan 21", "(341) 555‐7789", "jDawg5555@yahoo.com")
	};

	public static void main(String[] args)
	{
		printContacts();
		
		findByName("Johnnie");
		findByName("Sam Parker");
		
		findByRelation("friend");
		findByRelation("aunt");
		
		findByPhone("(333) 555-8989");
		findByPhone("(342) 555-7011");
		
		findByBMonth("May");
		findByBMonth("Mar");
		
		findByEmail("rgoodman@hotmail.com");
		findByEmail("susieE@hotmail.com");
	}

	public static void printContacts()
	{
		System.out.println("Contact List\n");
		System.out.println("Name            Relation        Birthday        Phone           Email");
		System.out.println("-------------------------------------------------------------------------------");
		for (Contact c : myContacts)
		{
			System.out.println(c);
		}
		System.out.println();
	}

	public static void findByName(String nameToFind)
	{
		System.out.println("Find Name - " + nameToFind);

		Contact[] tempMyContacts = myContacts;

		//Sort
		for (int i = 0; i < tempMyContacts.length - 1; ++i)
		{
			int k = i;
			for (int j = i + 1; j < tempMyContacts.length; ++j)
			{
				if ((tempMyContacts[j].getName()).compareTo(tempMyContacts[k].getName()) < 0)
				{
					k = j;
				}
			}
			Contact tempContact = tempMyContacts[i];
			tempMyContacts[i] = tempMyContacts[k];
			tempMyContacts[k] = tempContact;
		}

		//Search
		boolean nameFound = false;
		int high = tempMyContacts.length;
		int low = -1;
		int probe;

		while (high - low > 1)
		{ 
			probe = (high + low) / 2;
			if (tempMyContacts[probe].getName().compareTo(nameToFind) > 0)
			{
				high = probe;
			}
			else
			{
				low = probe;
			}
		}
		if ((low >= 0) && (tempMyContacts[low].getName().compareTo(nameToFind) == 0))
		{
			nameFound = true;
		}
		if (nameFound)
		{
			//System.out.println("We found " +  + " in the library");
			//System.out.println(myMusic[low].toString());
			System.out.println("Found: " + tempMyContacts[low]);
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}

	public static void findByRelation(String relation)
	{		
		System.out.println("Find Relation - " + relation);
		ArrayList<Contact> results = new ArrayList<Contact>();
		for (Contact c : myContacts)
		{
			if (c.getRelation().compareTo(relation) == 0)
			{
				results.add(c);
			}
		}
		System.out.println("Find Results:");
		if (results.size() > 0)
		{
			for (Contact c : results)
			{
				System.out.println(c);
			}
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}
	
	public static void findByBMonth(String month)
	{
		System.out.println("Find Birth Month - " + month);
		ArrayList<Contact> results = new ArrayList<Contact>();
		for (Contact c : myContacts)
		{
			if (c.getBDay().split(" ")[0].compareTo(month) == 0)
			{
				results.add(c);
			}
		}
		System.out.println("Find Results:");
		if (results.size() > 0)
		{
			for (Contact c : results)
			{
				System.out.println(c);
			}
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}
	
	public static void findByPhone(String phoneNumber)
	{
		System.out.println("Find Phone Number - " + phoneNumber);
		ArrayList<Contact> results = new ArrayList<Contact>();
		for (Contact c : myContacts)
		{
			if (c.getPhone().compareTo(phoneNumber) == 0)
			{
				results.add(c);
			}
		}
		System.out.println("Find Results:");
		if (results.size() > 0)
		{
			for (Contact c : results)
			{
				System.out.println(c);
			}
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}
	
	public static void findByEmail(String email)
	{
		System.out.println("Find Email - " + email);

		Contact[] tempMyContacts = myContacts;

		//Sort
		for (int i = 0; i < tempMyContacts.length - 1; ++i)
		{
			int k = i;
			for (int j = i + 1; j < tempMyContacts.length; ++j)
			{
				if ((tempMyContacts[j].getEmail()).compareTo(tempMyContacts[k].getEmail()) < 0)
				{
					k = j;
				}
			}
			Contact tempContact = tempMyContacts[i];
			tempMyContacts[i] = tempMyContacts[k];
			tempMyContacts[k] = tempContact;
		}

		//Search
		boolean emailFound = false;
		int high = tempMyContacts.length;
		int low = -1;
		int probe;

		while (high - low > 1)
		{ 
			probe = (high + low) / 2;
			if (tempMyContacts[probe].getEmail().compareTo(email) > 0)
			{
				high = probe;
			}
			else
			{
				low = probe;
			}
		}
		if ((low >= 0) && (tempMyContacts[low].getEmail().compareTo(email) == 0))
		{
			emailFound = true;
		}
		if (emailFound)
		{
			System.out.println("Found: " + tempMyContacts[low]);
		}
		else
		{
			System.out.println("No results found");
		}
		System.out.println();
	}
}
