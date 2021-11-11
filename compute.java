public class compute
{
double sum, classAverage;
public double aver(double[ ] aarray)
{
sum = 0;
classAverage=0;
int ct;
for (ct=0; ct < 100; ct++)
{
sum = sum +  aarray[ct];
}
double classAverage = sum/aarray.length;
return sum;
}
public String toString ()
{
return ("The class Average is: " + classAverage);
}
}