
public class Item
{
	private String itemID;
	private String itemName;
	private int inStore;
	private double price;
	
	public Item(String itemID, String itemName, int inStore, double price)
	{
		this.itemID = itemID;
		this.itemName = itemName;
		this.inStore = inStore;
		this.price = price;
	}
	
	public String getItemID()
	{
		return this.itemID;
	}
	
	public String getItemName()
	{
		return this.itemName;
	}
	
	public int getInStore()
	{
		return this.inStore;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
