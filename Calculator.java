import java.util.*;
public class Calculator{

public static void main(String [] args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter first number");
int num1=sc.nextInt();

System.out.println("Enter second number");
int num2=sc.nextInt();

System.out.println("Press 1 for Addition,\nPress 2 for Subtraction,\nPress 3 for Multiplication,\nPress 4 for Division");
int operation=sc.nextInt();

int result=0;
if (operation==1)
result=num1+num2;
else if (operation==2)
result=num1-num2;
else if(operation==3)
result=num1*num2;
else if(operation==4)
result=num1/num2;
else
System.out.println("Invalid number");

System.out.println(" " +result);


}
}