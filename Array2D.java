public class Array2D
{
public static void main(String[] args)
{
Box myBox= new Box (15);
int [][] myArray = new int [5][10];
for (int row=0; row < myArray.length; row++)
   for (int col=0; col < myArray[1].length; col++)
      myArray[row][col] = row * 10 + col;
for (int row=0; row < myArray.length; row++)
{
for (int col=0; col < myArray[row].length; col++)
System.out.print (myArray[row][col] + "\t");
System.out.println();
}
for (int col=0; col < myArray[0].length; col++)
{
System.out.print(myArray[2][col] + "\t");
}
System.out.println();
for (int row=0; row < myArray.length; row++)
{
System.out.println(myArray[row][3] + "\t");
}
myArray[3][4]= 99;
for (int row=0; row < myArray.length; row++)
{
for (int col=0; col < myArray[row].length; col++)
System.out.print (myArray[row][col] + "\t");
System.out.println();
}
for (int row=0; row <myArray.length; row ++)
{
System.out.print(myArray[row][row] + "\t");
}
// two nested for loops

System.out.println();
System.out.println(myBox);

}
}