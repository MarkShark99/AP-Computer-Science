/**
PROJECT TITLE: 17.05
PURPOSE OF PROJECT: To practice each type of sorting
VERSION or DATE: 5/5/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: It was easy now that I know all the types of sorting.
           
*******************************************************************************
In the future: Use what I've learned about sorting when I need to sort things.
*/

public class TestItem
{
	static Item[] hardware = {
			new Item("1011", "Air Filters", 200, 10.5),
			new Item("1034", "Door Knobs", 60, 21.5),
			new Item("1101", "Hammers", 90, 9.99),
			new Item("1600", "Levels", 80, 19.99),
			new Item("1500", "Ceiling Fans", 100, 59),
			new Item("1201", "Wrench Sets", 55, 80)
	};

	public static void main(String[] args)
	{
		
		System.out.println("Original Array:\n");
		listItems(); //Initial listing
		
		System.out.println("\nSorted by ID:\n");
		sortID();
		listItems();
		
		System.out.println("\nSorted by name:\n");
		sortName();
		listItems();
		
		System.out.println("\nSorted by inStore\n");
		sortInStore();
		listItems();
		
		System.out.println("\nSorted by price\n");
		sortPrice(0, hardware.length - 1);
		listItems();
		
	}
	
	public static void listItems()
	{
		System.out.println("itemID   itemName    inStore     price");
		System.out.println("--------------------------------------");
		for (Item i : hardware)
		{
			System.out.printf("%-6s  %-15s %-3d     $%-6.2f%n", i.getItemID(), i.getItemName(), i.getInStore(), i.getPrice());
		}
	}

	public static void sortID() //Any sort
	{
		Item[] newHardware = new Item[hardware.length];


		for(int i = 0; i < hardware.length; i++)
		{

			String next = hardware[i].getItemID();
			int insertIndex = 0;
			int k = i;
			while(k > 0 && insertIndex == 0)
			{
				if(next.compareTo(newHardware[k-1].getItemID()) > 0)
				{
					insertIndex = k;
				}
				else
				{
					newHardware[k] = newHardware[k-1];
				}
				k--;
			}
			newHardware[insertIndex] = hardware[i];
		}
		hardware = newHardware;
	}

	public static void sortName() //Insertion sort
	{
		Item[] newHardware = new Item[hardware.length];


		for(int i = 0; i < hardware.length; i++)
		{

			String next = hardware[i].getItemName();
			int insertIndex = 0;
			int k = i;
			while(k > 0 && insertIndex == 0)
			{
				if(next.compareTo(newHardware[k-1].getItemName()) > 0)
				{
					insertIndex = k;
				}
				else
				{
					newHardware[k] = newHardware[k-1];
				}
				k--;
			}
			newHardware[insertIndex] = hardware[i];
		}
		hardware = newHardware;
	}

	public static void sortInStore() //Selection sort
	{
		Item[] newHardware = new Item[hardware.length];
		Item tempItem;
		int j;

		for (int i = hardware.length - 1 ; i > 0 ; i-- )
		{
			j = 0;
			for (int k = 1 ; k <= i ; k++ )
			{
				if ( hardware[k].getInStore() > hardware[j].getInStore())
				{
					j = k;
				}
			}
			tempItem = hardware[i];
			hardware[i] = hardware[j];
			hardware[j] = tempItem;
		}
	}
	
	public static void sortPrice(int low, int high) //Merge sort
	{
		if (low == high)
		{
			return;
		}
		int mid = (low + high) / 2;
		sortPrice(low, mid);
		sortPrice(mid + 1, high);
		mergePrice(low, mid, high);
	}
	
	public static void mergePrice(int low, int mid, int high)
	{
		Item[] temp = new Item[high - low + 1];
		int i = low, j = mid + 1, n = 0;
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = hardware[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = hardware[i];
				i++;
			}
			else if (hardware[i].getPrice() < hardware[j].getPrice())
			{
				temp[n] = hardware[i];
				i++;
			}
			else
			{
				temp[n] = hardware[j];
				j++;
			}
			n++;
		}
		for (int k = low ; k <= high ; k++)
		{
			hardware[k] = temp[k - low];
		}
	}
}
