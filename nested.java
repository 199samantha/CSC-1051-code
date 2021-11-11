import java.util.Scanner;
public class nested
{
public static void main(String[] args)
{
Box mybox= new Box (10);
System.out.println(mybox);
System.out.println("Enter the number of rows the triangle must be (between 6-10): ");
Scanner scan= new Scanner (System.in);
int num= scan.nextInt();
while (num < 6 || num > 10)
{
System.out.println("error."); 
System.out.println(" Please enter  a new number in range: ");
num= scan.nextInt();
} 
int start=1;
while (start <= num)
{
int a=0;
while ( a < start)
{
System.out.print("#");
a ++;
}
System.out.println();
start ++;
}
System.out.println("Enter a number of rows for the second triangle: ");
int num2= scan.nextInt();
while (num2 < 6 || num2 > 10)
{
System.out.println("error."); 
System.out.println(" Please enter  a new number in range: ");
num2= scan.nextInt();
} 
start = 1;
int b =0;
do 
{
b =0;
do
{
System.out.print("%");
b++;
}
while (b < start);
System.out.println();
start ++;
}
while (start <= num2);
System.out.println("Enter the number of rows the triangle must be (between 6-10): ");
int num3= scan.nextInt();
while (num3 < 6 || num3 > 10)
{
System.out.println("error."); 
System.out.println(" Please enter  a new number in range: ");
num3= scan.nextInt();
} 
int MAX= 10;
for (num3=1; num3 <= MAX; num3 ++)
{
for (int star=1; star <= num3; star ++);
System.out.print("*");
System.out.println();
System.out.println(mybox);
}
}
}