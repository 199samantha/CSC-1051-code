//Samantha White
// File name: Oper.java
// I assert that the program I am submitting is the result of my own efforts.
// Part 1
//
public class Oper
{
 public static void main (String[] args) 
 {
System.out.println("*************************************************");
System.out.println(" *	 	  Samantha White	 		                 *");
System.out.println(" *	 	 CSC 1051-001                            *");
System.out.println(" *		  Lab  #2         				           *");
System.out.println(" ************************************************");
//
//
// Part 2
//
System.out.println("Hi " + "How are you?");
System.out.println("How old am I? I am " + "19");
System.out.println("What is 5 + 5? It's " + (5 + 5));
System.out.print("Find x in the eqn x+3=5. " + "To do this isolate the x variable. ");
System.out.println("State the answer here:        ");
System.out.print("Wrtie your name here:                    ");
System.out.print("Write the date here:    ");
System.out.println("Write your class section here:    ");
//
//
//Part 2 B
//
String name= "Samantha";
String petName= "Bella";
int age= 19; 
System.out.println("Hello, my name is " + name + " and I am " + age + " years\n" + "old. I'm enjoying my time at Villanova, though\n" + "I miss my pet " + petName + " very much!");
// Part 3
//
int corn= 2;
int pears= 4;
int cprice= 500;
int pprice= 100;
double cdolprice= 5;
double pdolprice= 1;
System.out.println("The amount of money tied up in pears in pennies is " + (pprice*pears)); 
System.out.println("The amount of money tied up in corn in pennies is " + (cprice*corn)); 
System.out.println("The total amount of pears plus corn in pennies is " + ((pprice*pears) + (cprice*corn)));
System.out.println("The amount of money tied up in pears in dollars is " + (pdolprice*pears)); 
System.out.println("The amount of money tied up in corn in dollars is " + (cdolprice*corn)); 
System.out.println("The total amount of pears plus corn in dollars is " + ((pdolprice*pears) + (cdolprice*corn)));
System.out.println ("\n\n");
//
//Part 4
//
int remainder= 0;
int quotient= 0;
remainder= 10%3;
System.out.println("The remainder of ten divided by three is:  " + remainder + " remainder");
remainder= 3%10;
System.out.println("The remainder of three divided by ten is:  " + remainder + " remainder");
quotient= (5/3);
System.out.println("The TRUNCATED quotient of five divided by three is: " + quotient);
double remainderDec=0;
double quotientDec=0;
double tenDec= 10.0;
double threeDec= 3.0;
double fiveDec=5.0;
remainderDec= (tenDec%threeDec);
System.out.println("The double remainder of ten divided by three is: " + remainderDec);
quotientDec= fiveDec/threeDec;
System.out.println("The double quotient of five divided by three is: " + quotientDec);
double val1= 5.0;
double val2= 6.0;
int val3= 7;
int val4= 21;
System.out.println ((val1/val2) + (val1-val2));
System.out.println ((val3 + val4) - (val3*val4));
System.out.println ((val1-val3)*(val2-val4));
//
//
//
//Part 5
//
double dnumber1= 3;
int inumber2= 2;
double danswer= 0;
danswer= dnumber1*inumber2;//promotion
System.out.println("To show Arithmetic Promotion, we multiplied " + dnumber1 + " by " + inumber2 + " and got an anwser of " + danswer);
int given= 8;
double given2= 0;
given2= given;//assignment
System.out.println("To show conversion by assignment, the integer " + given + " was assigned to a double yielding " + given2);
int given3= 2;
double given4= 1.5;
given3= (int)given4;//casting
System.out.println("To show conversion by casting, I have case " + given4+ " into an int and yielded " + given3);
   }
}
