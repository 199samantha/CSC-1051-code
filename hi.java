public class hi
{
int calc(int num)
{
    if (num == 0)
        return 0;
    else
        return num + calc(num + 1);
  }    
  } 
  public static void main(String[] args)
  {
  int x = -1
  System.out.println(x.calc);
  }