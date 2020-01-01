import java.util.Scanner;

public class AnnualClimate1
{
	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String[] monthArray = new String[]{"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};

		String city = "Orlando, Florida";
		double[] temperatureArray = new double[]{60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
		double[] precipitationArray = new double[]{2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
		
//		String city = "Miami, Florida";
//		double[] temperatureArray = new double[]{68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};
//		double[] precipitationArray = new double[]{1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};
		
		int averageDivisor = 12;
		int mode = 0;
		double temperatureTotal = 0.0;
		double precipitationTotal = 0.0;
		double averageTemperature = 0.0;
		double averagePrecipitation = 0.0;
		while(mode < 1 || mode > 2)
		{
			System.out.println("1) Fahrenheit and Inches");
			System.out.println("2) Celsius and Centimeters");
			System.out.print("Select a mode: ");
			mode = mScanner.nextInt();
			System.out.println("\n\n");
		}
		System.out.println("                   Climate Data");
		System.out.println("           Location: " + city + "\n");
		System.out.println("Month      Temperature (F)    Precipitation (in.)");
		System.out.println("*************************************************");
		
		for (int i = 0; i < 12; i++)
		{
			//System.out.println(i);
			temperatureTotal += temperatureArray[i];
			precipitationTotal += precipitationArray[i];
			System.out.print(" " + monthArray[i]);
			System.out.printf("          %-11.1f           %3.1f%n", temperatureArray[i], precipitationArray[i]);
		}
		averageTemperature = temperatureTotal / temperatureArray.length;
		averagePrecipitation = precipitationTotal / precipitationArray.length;
		System.out.println("*************************************************\n");
		System.out.printf("      Average: %-14.1fAnnual: %.1f", averageTemperature, averagePrecipitation);
	}
	public static double roundToPlace(double a, int d)
	{
		return (double)(Math.round(a * Math.pow(10, d)) / Math.pow(10, d));
	}
}
