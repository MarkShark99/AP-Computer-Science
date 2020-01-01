/**
PROJECT TITLE: Grade Points Total and Average / GradesV2.java
PURPOSE OF PROJECT: Add points from various tests and display the total and average.
VERSION or DATE: 9/14/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: The increment operator saved some space when I had to increment the test number
      Using '+=' made it easy to add the current test to the total
           
<-s>: I had some issues with decimals not displaying correctly until I cast numtests to a double

           
*******************************************************************************
In the future: Separate my prints so they aren't so long.
*/

public class GradesV2
{
	public static void main(String[] args)
	{
		//Use 97, 79, 83, and 88
		
		int numtests = 0;
		int testGrade = 0;
		int totalPoints = 0;
		double average = 0.0;
		
		//Grade 1
		numtests++; //Add 1 to Number of tests
		testGrade = 97;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Grade 2
		numtests++; //Add 1 to Number of tests
		testGrade = 79;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Grade 3
		numtests++; //Add 1 to Number of tests
		testGrade = 83;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Grade 4
		numtests++; //Add 1 to Number of tests
		testGrade = 88;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Test 5
		numtests++; //Add 1 to Number of tests
		testGrade = 67;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Test 6
		numtests++; //Add 1 to Number of tests
		testGrade = 100;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Test 7
		numtests++; //Add 1 to Number of tests
		testGrade = 89;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
		
		//Test 8
		numtests++; //Add 1 to Number of tests
		testGrade = 91;
		totalPoints += testGrade; // Add current grade to total
		average = (totalPoints / (double)numtests); //Calculate average
		
		System.out.println("n = " + numtests + "    New Test Grade: " + testGrade + "    Total Points: " + totalPoints + "    Average Score: " + average);
		System.out.println();
	}
}
