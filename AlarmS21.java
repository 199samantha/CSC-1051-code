public class AlarmS21
{
private int setH;
private int setM;
public AlarmS21(int ahour, int aminute)
{
setH= ahour;
setM= aminute;
}
private int helperSum;
private int value;
public int countMin (int p1)
{
int count =1;
int HelperSum= 0;
while (count <= p1)
{
System.out.println(count);
count = count + 1;
HelperSum += count;
}
return HelperSum;
}
public String toString()
{
return ("The hour = " + setH + "\nThe minute =" + setM);
}
}
