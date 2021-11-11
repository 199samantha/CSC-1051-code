// I assert that the program I am submitting is the result of my own efforts
public class Calc
{
private double gpa;
public Calc ()
{
System.out.println("The constructor of Calc.java has been called");
}
public String Calculate(double p4)
{
gpa= p4;
String result= "";
if (gpa >= 95)
{
result= "A";
}
{
if ((gpa < 95) && (gpa >= 90))
result= "A-";
}
{
if ((gpa < 90) && (gpa >= 87))
result= "B+";
}
{
if ((gpa < 87) && (gpa >= 83))
result= "B";
}
{
 if ((gpa < 82) && (gpa >= 80))
result= "B-";
}
{
if (gpa < 80)
result= "Not in this group";
}
return result;
}
}
