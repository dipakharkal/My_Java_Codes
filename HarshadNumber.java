public class HarshadNumber{

public static void main(String [] args){

int  num=171;
int num2=num;
int sum=0;

while(num2>0)
{
int rem=num2%10;
sum=sum+rem;
num2=num2/10;

}
if (num%sum==0)
System.out.println("Harshad Number");
else 
System.out.println("Not a Harshad Number");
}
}