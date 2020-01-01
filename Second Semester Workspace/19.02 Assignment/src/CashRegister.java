
public class CashRegister
{
	private int cashOnHand;
	
	public CashRegister()
	{
		this.cashOnHand = 500;
	}
	
	public CashRegister(int cashOnHand)
	{
		if (cashOnHand > 0)
		{
			this.cashOnHand = cashOnHand;
		}
		else
		{
			throw new IllegalArgumentException("CashRegister must be constructed with value > 0");
		}
	}
	
	public void acceptAmount(int amount)
	{
		if (amount > 0)
		{
			this.cashOnHand += amount;
		}
		else
		{
			throw new IllegalArgumentException("A CashRegister can only accept a value greater than 0");
		}
	}
	
	public int getCashOnHand()
	{
		return this.cashOnHand;
	}
}
