import java.util.Scanner;
public class Driver
{
 public static void main (String[] args)
 {
 Box myBox = new Box (107);
 Scanner scan= new Scanner (System.in);
 int w,x,y,z;
 System.out.println("Enter in an integer: ");
 w= scan.nextInt();
 System.out.println("This is your integer: " + w);
 Helper myHelp = new Helper ();
 myHelp.meth1(w);
 System.out.println("Enter in a second integer: ");
 x= scan.nextInt();
 System.out.println("Your second integer is: " + x);
 myHelp.meth2(x);
 System.out.println("Enter a third integer: ");
 y= scan.nextInt();
 System.out.println("Third integer: " + y);
 myHelp.meth3(y);
 System.out.println("Enter a fourth integer: ");
 z= scan.nextInt();
 System.out.println("fourth integer: " + z);
 myHelp.meth4(z);
 int answer = myHelp.meth4(z);
 System.out.println("Meth 4 calculated the sum to be = " + answer);
 System.out.println(myHelp);
 System.out.println(myBox);
 }
 }