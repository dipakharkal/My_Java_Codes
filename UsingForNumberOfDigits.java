public class UsingForNumberOfDigits{

public static void main(String [] args){
	
int num=54665446;
int count=0;

for(;num>0;)
{
num=num/10;
count++;
}
System.out.println(count);

}
}