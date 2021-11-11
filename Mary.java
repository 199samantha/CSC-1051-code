import java.util.Scanner;
import java.util.Random;
public class Mary
{
 public static void main (String[] args)
 {
Scanner scan= new Scanner (System.in);
String name;
System.out.println("Name : ");
name= scan.nextLine();
System.out.println("Hi " + name + " I'm going to guess your favorite color out of these four: red, blue, green, yellow");
String red, blue, green, yellow;
String red = myRan.nextString();
String blue = myRan.nextString();
String green = myRan.nextString();
String yellow = myRan.nextString();
Random color = new Random (red, blue, green, yellow);
System.out.println(color);


}
}