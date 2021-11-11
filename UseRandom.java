//Samantha White
//I assert that the program I am submitting is the result of my own efforts.
//------------------------------------------
//1) Imports all the methods from the Random class.
//2) nextInt
//3) It can be either +/-.
//4) Random generator = new Random();
//5) num1 = generator.nextInt();
//6) Negative to positive infinty.
//7) num2=generator.nextInt(10) + 1;
//------------------------------------------
//ALGORITHM FOLLOWS:
//Variables: totalSec, hour, min, seconds, remainingSeconds  
//Input:    Total Seconds provided by the program
//Processing: 
//Compute Whole Hours:  totalSec/3600= hour
//Whole minutes: (totalSec%3600)/60
//Remaining Seconds: totalSec%60
//Output: Hours, Minutes, and Seconds that make up the TotalSeconds

import java.util.Random;
public class UseRandom
{
public static void main(String[] args)
{
System.out.println("*************************************************");
System.out.println(" *	 	  Samantha White	 		                 *");
System.out.println(" *	 	 CSC 1051-001                            *");
System.out.println(" *		  Lab  #2         				           *");
System.out.println(" ************************************************");
Random generator = new Random();
int num1;
num1 = generator.nextInt();
System.out.println("Here is the number from the random number generator: " + num1);
int num2;
num2=generator.nextInt(11);
System.out.println("Here is a positive number in the range of 1-10: " + num2);
int totalSec;
totalSec= num2*20000;
System.out.println("Here is the Total Number of Seconds: " + totalSec);
int hour, minutes, remainingSec;
hour= totalSec/3600;
minutes= (totalSec%3600)/60;
remainingSec= totalSec%60;
System.out.println("Hours= " + hour + "\nMinutes: " + minutes + "\nRemaining Seconds: " + remainingSec);
}
}