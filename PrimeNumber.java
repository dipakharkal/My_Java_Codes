public class PrimeNumber{

public static void main(String [] args){
	 
 int num=15;
 int cnt=0;
 for (int i=2;i<num;i++)
 {
   if(num%i==0)
	   cnt++;
 }

 if(cnt==0)
 System.out.println("prime");
 else
 System.out.println("Not prime");
}

}