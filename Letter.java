import java.text.DecimalFormat;
public class Letter
{
DecimalFormat fmt= new DecimalFormat ("0.00");
private double grade;
private String name;
public Letter (String p1, double p3)
{
name= p1;
grade= p3;
}

public String toString()
{
return "Dear " + name + ", Congratulations\n" + "Your grade is: " + fmt.format(grade);
}
}