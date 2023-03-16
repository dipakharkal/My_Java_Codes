	public class PrimeNumber1to100{
	
	public static void main(String []args){
	
for (int j=1;j<=100;j++)	
{
 int num=j;
 int cnt=0;
 for (int i=2;i<num;i++)
 {
 int rem=num%i;
 if(rem==0)
 cnt++;
 }
 if(cnt==0)
 System.out.println(num+"is prime");
 else
 System.out.println(num+" is Not prime");
}
}

///correct code