public class UsefulMethods
{
static int arrayMax(int[] arr)
{
int maximum= arr[0];
for (int i=1; i<arr.length; i++)
{
if(arr[i]>maximum)
{
maximum=arr[i];
}
}
return maximum;
}
static int arrayHalf(int[] arr)
{
int half= arr[0];
for (int i=1; i<=arr.length/2; i++)
{
if(arr[i]>half)
{
half=arr[i];
}
}
return half;
}
static String pigify(String word)
{
char first = word.charAt(0);
if(first == 'A' || first == 'O' ||first == 'E' ||first == 'U' || first == 'I')
{
word.concat("yay");
}
else 
{
int otherplace;
char other;
for (int i = 0; i < word.length(); i++) {
other = word.charAt(i);
if (other  == 'A' || other == 'O' ||other == 'E' ||other == 'U' || other == 'I') {
otherplace = i;
}
}
}
return word;
}
}
