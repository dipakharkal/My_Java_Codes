public class FabonasiSeries{

public static void main(String [] args){

System.out.print("0,1, ");
//correct it 
int a =0 ;
int b=1;
int i=0;

//Using While loop
while(i<10)
	{
		 int sum=a+b;
		 System.out.print(sum+ ", "); 
		 a=b;
		 b=sum;
		
		 i++;
	}
//Using For loop	
{	
for(i=0;i<10;i++){
	 int sumFor=a+b;
		 System.out.print(sumFor+ ", "); 
		 a=b;
		 b=sum;
}
}
}
}