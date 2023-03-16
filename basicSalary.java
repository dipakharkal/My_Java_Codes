import java.util.Scanner;
public class basicSalary{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter your basic salary.");
int basicSalary=sc.nextInt();
double grossSalary=0;
//(Percentage*basic/100)

if (basicSalary<=10000)
grossSalary=(20*basicSalary/100)+(80*basicSalary/100);
else if(basicSalary<=20000)
grossSalary=(25*basicSalary/100)+(90*basicSalary/100);
else if(basicSalary<=30000)
grossSalary=(30*basicSalary/100)+(95*basicSalary/100);
else
System.out.println("your salary is : "+grossSalary);

System.out.println("your salary is : "+grossSalary);

}
}