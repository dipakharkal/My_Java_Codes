public class KaprekarNumber{

public static void main(String [] args){
//Original Input number for checking wheather it is Kaprekar number or not
int OriginalNumber=4756;
//square,two parts, 
// doing square of original number as its questions requrement
int SquareOfON=OriginalNumber*OriginalNumber;

//storing square of original
int num2=SquareOfON;

int count=0;

while(num2>0)
{
num2=num2/10;
count++;
}
if (count%2!=0)
count++;
count=count/2;

int den=(int)Math.pow(10,count);

int lp=SquareOfON/den;
int rp=SquareOfON%den;

if (lp+rp == OriginalNumber)
System.out.println("Kaprekar Number");
else 
System.out.println("Not a Kaprekar Number");


}
}