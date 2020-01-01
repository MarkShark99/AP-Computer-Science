public class PrimeNumberFinder
{
	public int upperLimit;
	public int totalPrimeNumbers = 0;

	public PrimeNumberFinder(int upperLimit)
	{
		this.upperLimit = upperLimit;
	}
	
	public void findPrimeNumbers()
	{
		for (int i = 2; i <= this.upperLimit; i++)
		{
			if (isNumberPrime(i))
			{
				System.out.println(i);
				this.totalPrimeNumbers++;
			}
		}
	}

	public boolean isNumberPrime(int num)
	{
		for (int j = 2; j < num; j++)
		{
			if (num % j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public int getTotalPrimeNumbers()
	{
		return this.totalPrimeNumbers;
	}
}
