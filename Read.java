// Read.java
// Samantha White 
//I  assert that the program I am submitting is the result of my own efforts. 
//
import java.util.Scanner; // makes scanner code avaliable to use on program
public class Read // establishes class name
{
   public static void main (String[] args) // method
   {
Scanner scan = new Scanner (System.in); //tells input method
String messageOne;// Equates an obgject name to a place in memory that stores an address
String messageTwo;// Equates an obgject name to a place in memory that stores an address
int val1;// Equates an obgject name to a place in memory that stores an integer
double val2;// Equates an obgject name to a place in memory that stores a decimal
double val3;// Equates an obgject name to a place in memory that stores a decimal
System.out.println("Enter a Question: ");// prints the text to the viewer
messageOne= scan.nextLine(); //takes whats written by user and dumps it into messageOne variable
System.out.println("Here is your text: \""+ messageOne +"\""); //prints their answer and my text
System.out.println("Enter a word: ");// prints question
messageTwo=scan.nextLine();// takes user input and dumps it into messageTwo variable
System.out.println("Here is your word:\"" + messageTwo +"\"");// prints my text and their input
System.out.println("Enter an integer here: "); // prints question
val1=scan.nextInt(); // dumps user integer input into variable val1
System.out.println("Here is the integer you typed in: \"" + val1 + "\"");//prints my text and user input
System.out.println("Enter a decimal number: ");// prints question
val2=scan.nextDouble();// dumps user input into variable val2
System.out.println("Here is the decimal you typed in: \"" + val2 + "\"");//prints my text and user input
val3= (val1*val2);// multiplies val1 and val2 and dumps it into val3
System.out.println("You multiplied " + val1+ " times " + val2+ " and got results " + val3);// prints my text, user input, and the calculation from the line above 
double floated= val1;// casting val1 (an integer) as a double in the variable floated
System.out.println("Here is your integer floated= " + floated); //prints my text and the variables casted
int truncated= (int) val2;// casting val2 (a double) as an integer under the variable truncated
System.out.println("Here is your double truncated= " + truncated);//prints my text and the variables casted
System.out.println("*************************************************");
System.out.println(" *	 	  Samantha White	 		                 *");
System.out.println(" *	 	 CSC 1051-001                            *");
System.out.println(" *		  Lab  #3         				           *");
System.out.println(" ************************************************");
    }
 } 