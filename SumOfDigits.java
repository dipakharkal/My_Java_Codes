public class SumofDigits{

public static void main(String [] args){

int num = 1978;

int sum=0;
while(num>0)
{

// if you want to print last number of a digit then % it with 10

int rem=num%10;
sum=sum+rem;

// to cut out or remove last number of a digit
num=num/10;

}

System.out.println(sum);
System.out.println(num);

}
}