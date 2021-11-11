public class Helper
{
public int a;
public void meth1 (int i1)
{
a = i1;
int count = 1;
while (count <=i1)
{
System.out.println(count);
count = count + 1;
}
}
public int b;
public void meth2 (int i2)
{
b=i2;
int count = 0;
while (count <=i2)
{
System.out.println(count);
count= count+2;
}
}
public int c;
public void meth3 (int i3)
{
c=i3;
int count = c;
while (count <= c && count >=1)
{
System.out.println(count);
count= count-1;
}
}
public int value;
public int d;
public int meth4 (int i4)
{
d=i4;
int sum=0;
int count = 0;
while (count <= i4)
{
count = count + 2;
value= count + sum;
}
return value;
}
public String toString()
{
return ("the parameter used by meth 1 = " + a + "\nThe parameter used by meth 2 = " + b + "\nThe parameter used by meth 3= " + c + "\n the parameter used by meth 4 = " + d + "\nthe sum of all numbers in meth 4 = " + value);  
}
}