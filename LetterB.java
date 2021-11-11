import java.text.DecimalFormat;
public class LetterB
{
DecimalFormat fmt= new DecimalFormat ("0.00");
private double grade;
private String name;
private String lettergrade;
public LetterB (String p1, double p3, String p2)
{
name= p1;
grade= p3;
lettergrade= p2;
}

public String toString()
{
return "Dear " + name + ", Congratulations\n" + "Your grade average is: " + fmt.format(grade) + "\n This means you will get the grade of " + lettergrade;
}
}