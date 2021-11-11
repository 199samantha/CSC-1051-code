// I assert that the program I am submitting is the result of my own efforts. 
public class Box
{
int projectNum;
public Box(int pnumb)
{
projectNum=pnumb;
}
public String toString()
{
String a;
a= "*************************************************\n" + "*	 	  Samantha White	 		                 *\n" + "*	 	 CSC 1051-001                          *\n" +  "* lab#" + projectNum + "				           *\n" + "************************************************";
return a;
}
public void change (int num1)
{
projectNum=num1;
}
public int whatNumb()
{
return projectNum;
}
}