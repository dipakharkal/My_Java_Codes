import java.util.*;
public class MethodCalling {

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
int choice = 0;

while (choice!=4)
{
	System.out.println("Enter\n1:Prime\n2:Even\n3:Odd\n4:Exit");
	 choice = sc.nextInt();
	
	if (choice==1)
		printPrimeNumbers();
	else if (choice==2)
		//printEvenNumbers();
	System.out.println("Invalid Input1 ");
	else if (choice==3)
		//printOddNumbers();
	System.out.println("Invalid Input 2s");
	else if (choice==4)
		System.out.println("Thank you for using our Application");
	else 
		System.out.println("Invalid Input");

}
}
 
public static void printPrimeNumbers()
 {
	 for (int i=1;i<=100;i++)
	 printIfPrime(i);
 }
public static void printIfPrime(int num)
{
	if (num==1)
		return;
	
	int count=0;
	
	for (int i = 2 ; i<num;i++)
	{
		if (num%i==0)
			count++;
	}
	if (count==0)
	System.out.println(num);
}
}