import java.text.DecimalFormat;// imports DecimalFormat class
import java.util.Scanner;// imports Scanner class
public class UseLetter// declares class name
{
public static void main (String[] args)// defines main method
{
DecimalFormat fmt= new DecimalFormat ("0.00");// instansiates an object in the DecimalFormat class and defines our doubles will go to two decimal places
Box myBox= new Box(80);// instansiates box object and pass 80 value through it
String sname;// declares data type of variable name 
Scanner scan= new Scanner (System.in);// instansiates scan object
System.out.println("Enter your name: ");// asks user to enter name
sname= scan.nextLine();// scans user input and dumps it in name variable
System.out.println("Enter your grade as a xx.xx number between 0 and 100.00: "); // asks user to enter grade
double sgrade; // declares sgrade variable data type
sgrade= scan.nextDouble(); // scans user input and dumps it into sgrade variable
System.out.println("Your name is: " + sname + ", and your grade is: " + fmt.format(sgrade)); //prints name and grade in decimal format
Letter myLetter= new Letter(sname, sgrade); //instansiates object from Letter class
System.out.println(myLetter); // prints myLetter object
System.out.println(myBox); // prints box object from box class
}
}