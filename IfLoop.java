import java.util.Scanner;
import java.text.DecimalFormat;
public class IfLoop
{
public static void main(String[] args)
{
int countGood = 0;
int countBad = 0;
int numStud=0;// instansiated variables and set a value of 0
Box myBox = new Box (9);// instansiated box class
Calc myCalc = new Calc ();// instansiated calc class
Scanner scan= new Scanner (System.in); // scanner constructor method
System.out.println("Enter the number of students as an int: "); // prints text
String a = scan.nextLine(); // dumps user input into a
numStud=Integer.parseInt(a); // makes variable a data type change
System.out.println(numStud); // prints text
int count = 0; // sets count = 0;
while (count < numStud) // while loop count can only go up to number user gave
{
System.out.println("Enter student's first and last name: "); //prints text
String sname= scan.nextLine(); // reads in user input
System.out.println("Enter student's grade in a xx.xx format: "); // prints text
double sgrade= scan.nextDouble(); // reads in user input
scan.nextLine();//dummy read
DecimalFormat fmt= new DecimalFormat ("0.00"); //instansiates decimal format class
System.out.println("Name: " + sname + ". Grade: " + fmt.format(sgrade)); // prints text
if (sgrade<80)
{
System.out.println("Student " + sname + " doesn't belong in the group of students being processed");
countBad ++;// if the grade is below 80 it'll print a certain message
}
else
{
countGood ++;
String prtgrade= myCalc.Calculate(sgrade);
LetterB myLetter= new LetterB (sname, sgrade, prtgrade);
System.out.println(myLetter);// otherwise, call calculate method, insansiate LetterB class, and print text
}
count= count + 1;// makes loop end
}
System.out.println("Good numbers: " + countGood + ". Bad numbers: " + countBad);// prints text
System.out.println(myBox); // prints box from box class
}
}