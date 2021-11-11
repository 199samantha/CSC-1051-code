//Samantha White
// BMI program
// I assert that the program I am submitting is the result of my own efforts. 
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI
{
public static void main(String[] args)
{
System.out.println("*************************************************");
System.out.println(" *	 	  Samantha White	 		                 *");
System.out.println(" *	 	 CSC 1051-001                            *");
System.out.println(" *		  Lab  #2         				           *");
System.out.println(" ************************************************");
String a;// declares variable
Scanner scan = new Scanner(System.in); //instansiates scan object
System.out.println("Please enter your body weight in the following statement by substituting XXX with your weight");//prints text
System.out.println("My weight is XXX pounds");//prints text
a=scan.nextLine();// scans user input and dumps it in variable a
String b;//declares variable
b= a.substring(13,16);// takes the 12th to the 15th character of user input only
System.out.println(b);// prints above
int weight= Integer.parseInt(b);// converts string number to an int
System.out.println("Input your height using 2 digits replacing YY: My height is YY inches");// prints text
String c;//declares variable
c=scan.nextLine();// scans user input
String d;// declares variable
d= c.substring (13,15);// takes the 12th to the 14th character of user input
System.out.println(d);// prints above
int height= Integer.parseInt(d);// turns string number to an integer
c=scan.nextLine();// scans user input
double BMI;// declares variable
double insq= Math.pow(height, 2);// squares height
BMI= (weight/insq)*703;// BMI funtion
DecimalFormat fmt= new DecimalFormat ("0.00");// instansiates fmt object- establishes parameter type
System.out.println("Your height is: " + fmt.format(height));// prints text and height variable in decimal format fmt
System.out.println("Your height squared is: " + fmt.format(insq)); // prints text and variable height squared
System.out.println("Your weight is: " + fmt.format(weight));// prints text and weight variable in fmt
System.out.println("Your BMI is: " + fmt.format(BMI));// prints BMI in fmt
DecimalFormat fmt2= new DecimalFormat ("0.###");// instansiates new format fmt2
System.out.println("BMI= " + fmt2.format(BMI));// prints BMI in fmt2
// Part C
System.out.println("enter a positive integer");
int iA= scan.nextInt();
System.out.println("You entered: "+ iA);
System.out.println("enter a negative integer");
int iB= scan.nextInt();
System.out.println("You entered: "+ iB);
System.out.println("Enter a positive decimal");
double dC=scan.nextDouble();
System.out.println("You entered: " + fmt.format(dC));
int iBabs= Math.abs(iB);
System.out.println("Here's the absolute value of your negative integer: " + iBabs);
double iApow= Math.pow(iA,5);
System.out.println("Here is your positive integer to the fifth power: " + iApow);
double dCflo= Math.floor(dC);
System.out.println("Here is the floor of your positive decimal: " + dCflo);


}
}
