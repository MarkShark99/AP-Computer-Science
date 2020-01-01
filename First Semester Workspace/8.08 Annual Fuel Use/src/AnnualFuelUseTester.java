/**
PROJECT TITLE: Annual Fuel Use
PURPOSE OF PROJECT: To practice using arrays of objects
VERSION or DATE: 1/4/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: Using arrays of objects was easy
      
<-s>: Formatting the output was tedious

           
*******************************************************************************
In the future: Practice using arrays of objects more
*/

public class AnnualFuelUseTester
{	
	public static void main(String[] args)
	{
		int fillUpNumber1 = 1;
		int fillUpNumber2 = 2;
		int fillUpNumber3 = 3;
		
		int days1 = 1;
		int days2 = 11;
		int days3 = 23;
		
		int startMiles = 91265;
		int endMiles1 = 91611;
		int endMiles2 = 91939;
		int endMiles3 = 92267;
		
		double gallons1 = 15.94;
		double gallons2 = 15.11;
		double gallons3 = 15.36;
		
		double pricePerGallon1 = 2.28;
		double pricePerGallon2 = 2.34;
		double pricePerGallon3 = 2.26;
		
		int totalDistance = 0;
		double totalGallonsUsed = 0;
		double totalTotalCost = 0;
		double totalMPG = 0;
		
		int annualDistance = 0;
		double annualGallonsUsed = 0.0;
		double annualMPG = 0.0;
		double annualTotalCost = 0.0;
		
		AnnualFuelUse[] fuelUse = 
			{
					new AnnualFuelUse(fillUpNumber1, days1, startMiles, endMiles1, gallons1, pricePerGallon1),
					new AnnualFuelUse(fillUpNumber2, days2, endMiles1, endMiles2, gallons2, pricePerGallon2),
					new AnnualFuelUse(fillUpNumber3, days3, endMiles2, endMiles3, gallons3, pricePerGallon3)
			};
		
		int maxDistance = Integer.MIN_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getDistance() > maxDistance)
			{
				maxDistance = a.getDistance();
			}
		}
		
		int minDistance = Integer.MAX_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getDistance() < minDistance)
			{
				minDistance = a.getDistance();
			}
		}
		
		double maxMPG = Double.MIN_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getMPG() > maxMPG)
			{
				maxMPG = a.getMPG();
			}
		}
		
		double minMPG = Double.MAX_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getMPG() < minMPG)
			{
				minMPG = a.getMPG();
			}
		}
		
		double maxPrice = Double.MIN_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getPricePerGallon() > maxPrice)
			{
				maxPrice = a.getPricePerGallon();
			}
		}
		
		double minPrice = Double.MAX_VALUE;
		
		for (AnnualFuelUse a : fuelUse)
		{
			if (a.getPricePerGallon() < minPrice)
			{
				minPrice = a.getPricePerGallon();
			}
		}
		
		//Distance, gallons used, and total cost
		for (AnnualFuelUse a : fuelUse)
		{
			totalDistance += a.getDistance();
			totalGallonsUsed += a.getGallonsUsed();
			totalTotalCost += a.getTotalCost();
			totalMPG += a.getMPG();
		}
		double averageMPG = totalMPG / 3;
		annualDistance = (int)AnnualFuelUse.getAnnualProjection(13, totalDistance);
		annualGallonsUsed = AnnualFuelUse.getAnnualProjection(13, totalGallonsUsed);		
		annualTotalCost = AnnualFuelUse.getAnnualProjection(13,  totalTotalCost);
		
		System.out.println("Fill Up   Days   Start Miles   End Miles   Distance   Gallons Used    MPG   Price    Cost");
		
		for (AnnualFuelUse a : fuelUse)
		{
			System.out.printf("%4d      %3d      %6d       %6d     %6d     %9.2f      %4.1f   $%4.2f   %5.2f%n", a.getFill(), a.getDay(), a.getStartMiles(), a.getEndMiles(), a.getDistance(), a.getGallonsUsed(), a.getMPG(), a.getPricePerGallon(), a.getTotalCost());
		}
		System.out.printf("%nMinimum:%41d    %20.1f   $%4.2f", minDistance, minMPG, minPrice);
		System.out.printf("%nMaximum:%41d    %20.1f   $%4.2f%n%n", maxDistance, maxMPG, maxPrice);
	
		System.out.printf("Totals: %41d       %7.2f                    %6.2f%n", totalDistance, totalGallonsUsed, totalTotalCost);
		System.out.printf("Annual Projection:                         %6d       %7.2f     %5.2f         %7.2f", annualDistance, annualGallonsUsed, averageMPG, annualTotalCost);
	}
}
