
import java.util.Scanner; // makes scanner code avaliable to use on program
public class StringDemo // establishes class name
{
   public static void main (String[] args) // method
   {
System.out.println("*************************************************");
System.out.println(" *	 	  Samantha White	 		                 *");
System.out.println(" *	 	 CSC 1051-001                            *");
System.out.println(" *		  Lab  #2         				           *");
System.out.println(" ************************************************");
Scanner scan = new Scanner (System.in); //tells input method
String a;// establishes variable a
String b;//establishes variable b
System.out.println("Enter your first name: ");// prints test given
a= scan.nextLine();// take input from viewer and dumps it into variable a
System.out.println("Enter your last name but if your name is less than 5 letters, repeat the last name with no spaces several times until there is at least 5 letters: ");//// prints test given
b= scan.nextLine();// take input from viewer and dumps it into b
String c= b.substring(0,5); // creates a string that uses the prior string b but only from the first to the fifth character
System.out.println(a.charAt(0) + "." + c);// uses charAt command to get the first letter of the first name, uses a quote for a period, and concatenates that with string c
String d= a.toUpperCase();// takes string a, turns it all uppercase, and dumps it into variable d
System.out.println(d);// prints text from above line (variable d)
int e=b.length();// uses length command to get an int of how many letters are in a name
System.out.println("Length of your last name, \"" + b + "\", is: " + e); // prints text given, uses escape characters for double quotes, and concatenates previous variables
String f;// establishes variable
f=b.replace('e','Y');// replaces letter 'e' in string b to Y and stores it in string f
System.out.println(f);// prints text from variable f
String m1, m2, m3, m4, m5;// establishes variables
m1= "Quest for the Holy Grail"; // assigns string to variable
System.out.println("\"Quest for the Holy Grail\""); // prints text using escape characters
m2=m1.toLowerCase();// shifts text from m1 to lowercase and dumps it into m2
System.out.println(m2); //prints text from variable m2
m3= m1+ " " +m2; // concatenates a space, m1, and m2, and stores it in m3
System.out.println(m3); // prints text from above line
m4=m3.replace('g','z'); // replaces g in m3 with z and dumps it into m4
System.out.println(m4); // prints above line
int length= m4.length();// finds length of string m4 and puts it into variable length
m5= m4.substring (m4.indexOf('f'),length);// makes a substring of m4 and dumps it into string 5
System.out.println(m5);// prints above line
}
}