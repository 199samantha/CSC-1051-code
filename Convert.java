//Samantha White    Exam 2 Program    3/9/21
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Convert
{
   public static void main (String[] args) 
   {
double c, f;
int num , randNum;
String mutation1, mutation2, message, m1;
System.out.println("\"Celsius and Fahrenheit are related.\"");
message= ("\"Celsius and Fahrenheit are related.\""); 
mutation1=message.toUpperCase();
System.out.println(mutation1); 
mutation2= message.replace('a','Z');
System.out.println(mutation2);
Random generator = new Random();
randNum=generator.nextInt(6)+5;
System.out.println(randNum);
System.out.println("Enter a positive integer: ");
Scanner scan = new Scanner (System.in);
num= scan.nextInt();
System.out.println("You have entered: " + num);
f= (num*randNum);
DecimalFormat fmt = new DecimalFormat ("0.00");
System.out.println("Here is your Fahrenheit Temperature: " + fmt.format(f));
c= (5.0/9.0)*(f-32.0);
System.out.println("Here is your Celsius Temperature: " + fmt.format(c));
 }
 }