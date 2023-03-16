public class PalindromeNumber{

public static void main(String [] args){

int num1=123321;

int originalNum=num1;

int num2=0;

while(num1>0)
{
	int rem=num1%10;
	num1=num1/10;
	//reverse a num
	num2=num2*10 + rem;
	
}

if(originalNum==num2)
	System.out.println("Palindrome");
else
	System.out.println("Not Palindrome");

}
}