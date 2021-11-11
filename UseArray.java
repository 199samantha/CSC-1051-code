import java.util.Scanner;
public class UseArray
{
public static void main (String[] args) 
{
//I assert that the program I am submitting is of my own efforts.
Box mybox= new Box (13);
compute mycompute= new compute ();
Scanner scan = new Scanner (System.in);
int size;
System.out.println("Enter the number of students between 1 and 10");
String a = scan.nextLine();
size=Integer.parseInt(a);
while (size < 1 || size > 10)
{
System.out.println("Incorrect Range, enter a new number: ");
a = scan.nextLine();
size=Integer.parseInt(a);
}
double[] grades= new double[size+1];
String[] names= new String[size+1];
int index;
for (index= 0; index < size; index ++);
{
System.out.println("Enter student name: ");
names[index]=scan.nextLine();
System.out.println("Enter student grade: ");
grades[index]=scan.nextDouble();
}
mycompute.aver(grades);
System.out.println(mycompute);
System.out.println(mybox);

}
}
