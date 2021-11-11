import java.util.Scanner;
public class UseAlarmS21
{
public static void main (String[] args) 
 {
Scanner scan= new Scanner (System.in);
System.out.println("Enter an hour between 0 and 12: ");
int hour= scan.nextInt();
if (hour >= 0 && hour <=12)
{
System.out.println("good hour.");
}
else
{
System.out.println("Bad hour. Please pick an hour between 0 and 12.");
System.out.println("Enter an hour: ");
hour= scan.nextInt();
}
System.out.println("Enter a minute between 0 and 59: ");
int minute= scan.nextInt();
if (minute >= 0 && minute <=59)
{
System.out.println("good minute.");
}
else
{
System.out.println("Bad minute. Please pick an minute between 0 and 59.");
System.out.println("Enter an minute: ");
minute= scan.nextInt();
}
AlarmS21 myAlarm = new AlarmS21 (minute, hour);
int sum= myAlarm.countMin(minute);
System.out.println("Here's the returned sum: " + sum);
System.out.println(myAlarm);
}
}