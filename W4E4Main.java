import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.Scanner;



public class W4E4Main 
{

	public static void main(String[] args)
	{
//		4.	Write a program that tests user’s addition and subtraction skills. The program generates 
//		2 random numbers in the range between 5 and 50. You can use Math.random() or the Random class. 
//		Latter has much more functionality, but you will need to create its instance before you can use 
//		it (just like Scanner). The program also randomly chooses plus or minus. The program completes 
//		the computation, hides one of the numbers and asks the user to enter this number. 
//		For example: 25 - ? = 7. The user is told whether their answer is right or wrong. If they are wrong,
//		the correct answer is displayed too.
		
		Scanner in = new Scanner(System.in);
		int unknown2;
		int unknown1;
		
//		This selects a random number
//		The output random number is in decimal
		double randomNumber1 = Math.random();
		double randomNumber2 = Math.random();
		
//		This puts the decimal number in the range of 100
//		The +1 implement the posibility to get a 100
		double randRange100_1 = (randomNumber1*100) + 1;
		double randRange100_2 = (randomNumber2*100) + 1;
		
//		This converts the decimal number (double) into an integer
		int dRounded1 = (int) Math.round(randRange100_1);
		int dRounded2 = (int) Math.round(randRange100_2);
				
//		System.out.println(dRounded1);
//		System.out.println(dRounded2);
	
		
//		This calculation picks a random number between 0 and 1 for the sign
		Double sign = Math.random();
		double signRange = (sign*1);
		int signRounded = (int) Math.round(signRange);
//		This calculation picks a number between 0 and 1 for the number to be displayed
		Double num = Math.random();
		double numRange = (num*1);
		int numRounded = (int) Math.round(numRange);
//		Calculates addition and subtraction between the random numbers
		int resultAddition = dRounded1 + dRounded2;
		int resultSubtraction = dRounded1 - dRounded2;
		
		unknown2 = resultAddition - dRounded1;
		unknown1 = resultSubtraction + dRounded2;
		
		System.out.println("Calculate the following operation");
		
//		This statement declares 1 is Addition and 0 is Subtraction
//		It also formulate the structure of the equation randomly
		if ((signRounded == 1 || numRounded == 1))
		{
			System.out.println(dRounded1 + " + " + "? = " + resultAddition);
		}
		else
		{
			System.out.println("? " + " - " + dRounded2 + " = " + resultSubtraction);
		}
		
//		Ask the user to enter answer
		System.out.println("Enter answer: ");
		int input = in.nextInt();
		
//		Checks if the user's answer is correct or NOT
		if (input == unknown2 || input == unknown1) 
		{
			System.out.println("Result: Right");
		}
		else 
		{
			System.out.println("Result: Wrong");
		}
	}

}
