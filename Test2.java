import java.util.Scanner; 
public class Test2 
{
   public static void main (String[] args) 
   {
Scanner scan = new Scanner (System.in);
double a;
double b;
double c;
double average;
int intAverage;
String name;
System.out.println("Enter your name: ");
name= scan.nextLine(); 
System.out.println("Enter a decimal: ");
a= scan.nextDouble();
System.out.println("First value: " + a);
System.out.println("Enter a second decimal: ");
b= scan.nextDouble();
System.out.println("Second value: " + b);
System.out.println("Enter a third decimal: ");
c= scan.nextDouble();
System.out.println("Third value: " + c);
average= ((a+b+c)/3);
System.out.println("Dear " + name + " your values have a decimal average of "+ average);
intAverage= (int) average;
System.out.println("Dear " + name + " your values have an integer average of " + intAverage);
}
}