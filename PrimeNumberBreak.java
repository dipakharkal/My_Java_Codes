public class PrimeNumberBreak{

public static void main(String [] args){
int num=15;
int count=0;

for (int i=2;i<num;i++)
{
	if(num%i==0)
{
count++;
break;
}
}
if(count==0)
System.out.println("Prime");
else
System.out.println("Not Prime");

}

}
