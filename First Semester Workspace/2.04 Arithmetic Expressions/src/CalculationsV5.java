/*
PROJECT TITLE: CalculationsV5 / CalculationsV5.java
PURPOSE OF PROJECT: To practice using arithmetic, the primitive data types int and double, and concatenation with strings and ints in print statements
VERSION or DATE: 9/10/16
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: By using variables instead of hard-coding the number in, it was easy to change the output of the print statements
      
<-s>: I had some of the strings and math outputs in the same print statements which ended up making them really long.

           
*******************************************************************************
In the future: It would save time and make the code look neater if I separated long prints into multiple different ones the first time instead of going back to change them.
*/

public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Addition
    	int iNum1 = 25;
    	int iNum2 = 9;
        int iNum3 = 16;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
    	
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " equals ");
        System.out.println( iNum1 + iNum2 );
        System.out.print(dNum1 + " plus " + dNum2 + " plus " + dNum3 + " equals ");
        System.out.println( dNum1 + dNum2 + dNum3 );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum2+ " minus " + iNum1 + " equals ");
        System.out.println( iNum3 - iNum2 - iNum1 );
        System.out.print(dNum2 + " minus " + dNum3 + " equals ");
        System.out.println( dNum2 - dNum3 );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum1 + " times " + iNum2 + " equals ");
        System.out.println( iNum1 * iNum2 );
        System.out.print(dNum2 + " times " + dNum3 + " times " + dNum3 + " equals ");
        System.out.println(dNum2 * dNum3 * dNum3 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum2 + " divided by " + iNum1 + " equals ");
        System.out.println( iNum2 / iNum1 );
        System.out.print(dNum1 + " divided by " + dNum3 + " equals ");
        System.out.println( dNum1 / dNum3 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum3 + " modulus " + iNum2 + " equals ");
        System.out.println(iNum3 % iNum2);
        System.out.print( dNum3 + " modulus " + dNum2 + " equals ");
        System.out.println( dNum3 % dNum2 );
        System.out.println();
        
        //2.02 Lab Equations
        System.out.println("--2.02 Lab Equations--\n");
        System.out.print("15 divided by 2.5 times -2 plus 10 / 5 equals "); //These might need to be variables
        System.out.println((15 / 2.5 * -2 + 10 / 5));
        System.out.println();
        
        System.out.print("234 minus (234 divided by 6 modulus 12) + 3 equals ");
        System.out.println((234 - (234 / 6 % 12) + 3));
        System.out.println();
        
        System.out.print("46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals ");
        System.out.println(((46.2 / 11) - 3 + 24 % (17 - 2 * 3)));
        System.out.println();
        
        System.out.print("480 divided by 10 divided by 12 plus 200 * .5 minus 20 modulus 8 equals ");
        System.out.println((480 / 10 / 12 + 200 * .5 - 20 % 8));
        System.out.println();
        
        // 2.03 Additional int Equations
        int myInt1 = 20; //My ints
        int myInt2 = 45;
        int myInt3 = 22;
        int myInt4 = 8;
        int myInt5 = 13;
        System.out.println("--Additional int Equations--\n");
        System.out.print(myInt1 + " plus " + myInt2 + " times " + myInt3 + " modulus " + myInt4 + " equals ");
        System.out.println(myInt1 + myInt2 * myInt3 % myInt4);
        System.out.println();
        
        System.out.print("(" + myInt4 + " minus " + myInt5 + " ) divided by ( " + myInt3 + " times " + myInt2 + " ) equals ");
        System.out.println((myInt4 - myInt5) / (myInt3 * myInt2));
        System.out.println();

        
        //2.04 Additional double Equations
        double myDouble1 = 2.55; //My doubles
        double myDouble2 = 3.147;
        double myDouble3 = 5.3;
        double myDouble4 = 6.54;
        
        System.out.println("--Additional Double Equations--\n");
        
        System.out.print(myDouble1 + " plus " + myDouble2 + " minus " + myDouble3 + " modulus " + myDouble4 + " equals ");
        System.out.println(myDouble1 + myDouble2 - myDouble3 % myDouble4);
        System.out.println();
        
        System.out.print(myDouble1 + " divided by " + myDouble2 + " times " + myDouble3 + " plus " + myDouble4 + " equals ");
        System.out.println(myDouble1 / myDouble2 * myDouble3 + myDouble4);
        
    }
}