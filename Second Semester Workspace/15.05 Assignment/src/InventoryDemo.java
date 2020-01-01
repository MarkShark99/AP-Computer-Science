/**
PROJECT TITLE: 15.05 Assignment
PURPOSE OF PROJECT: To practice using abstract classes and interfaces
VERSION or DATE: 3/13/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This was a simple program to write
           
*******************************************************************************
In the future: Use interfaces to abstract my classes
*/

import java.util.ArrayList;

public class InventoryDemo
{
	public static ArrayList<Product> products = new ArrayList<Product>(); 

	public static void main(String[] args)
	{
		products.add(new Car("Jaguar", 1000000));
		products.add(new Car("Neon", 17000));
		products.add(new Tool("JigSaw", 149.18));
		products.add(new Car("Jaguar", 110000));
		products.add(new Car("Neon", 17500));
		products.add(new Car("Neon", 17875.32));
		products.add(new Truck("RAM", 35700.00));
		products.add(new Tool("CircularSaw", 200));
		products.add(new Tool("CircularSaw", 150));
		takeInventory("JigSaw");
		takeInventory("Neon");
		takeInventory("Jaguar");
		takeInventory("RAM");
		takeInventory("CircularSaw");
		Tool saw1 = new Tool("CircularSaw", 100);
		Tool saw2 = new Tool("CircularSaw", 200);
		if (saw1.compareTo(saw2) == 0)
		{
			System.out.println("The second saw is more expensive");
		}
		else if (saw1.compareTo(saw2) == 1)
		{
			System.out.println("The two saws have the same price");
		}
		else if (saw1.compareTo(saw2) == 2)
		{
			System.out.println("The first saw is more expensive");
		}
	}
	
	public static void takeInventory(String name)
	{
		int quantity = 0;
		double totalCost = 0.0;
		
		for (Product p : products)
		{
			if (p.getName().equals(name))
			{
				quantity++;
				totalCost += p.getCost();
			}
		}
		System.out.println(name + ": Quantity = " + quantity + ", Total cost = " + totalCost);
	}
}
