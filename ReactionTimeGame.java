//Samantha White
//ReactionTimeGame
//I assert that the program I am submitting is the result of my own efforts.
//1. Input name
//2. print personalized welcome message and instructions
//3. first = random int
//4. second = random int
//5. startTime = current time
//6. print question asking for sum, using first and second
//7. input answer
//8. endTime = current time
//9. reactionTime = endTime – startTime
//10. print outcome as “Correct” or “Incorrect”
//11. print goodbye
import java.util.Random;
import java.util.Scanner;
public class ReactionTimeGame
{
public static void main(String[] args)
{
// Measures response time for addition problem 
Scanner scan = new Scanner(System.in);
Random generator = new Random();
int first;
int second;
int answer;
int number;
long startTime; 
long endTime;
long reactionTime;
String name;
String response;
System.out.println("Please enter your name : ");// input name
name = scan.nextLine();
System.out.println("\"Hello \"" + name);//print personalized welcome message 
System.out.println("Answer the questions as fast as you can");//instructions
System.out.println("Hit <ENTER> when ready for the question");
scan.nextLine();
first= generator.nextInt();// first=random int
second= generator.nextInt();// second= random int
startTime = System.currentTimeMillis();// startTime = current time
System.out.print(first + "+" + second + "=");//print question asking for sum, using first and second
response = scan.nextLine();//input answer
endTime=System.currentTimeMillis();//endTime=current time
reactionTime= (endTime-startTime);// reactionTime = endTime – startTime
number = Integer.parseInt(response);
if (number == first + second)
{System.out.println("Correct");}
else
{System.out.println("Incorrect. Correct answer is:" + (first+second));}//print outcome as “Correct” or “Incorrect”
System.out.println("Your reaction time in milliseconds was: " + reactionTime);
long SecRT= reactionTime/1000;
System.out.println("Your reaction time in seconds was: " + SecRT);
System.out.println("Thank You, " + name + "! Goodbye.");//print goodbye

}
}