public class leapYear{

public static void main(String [] args){

int year = 2000;

if(year%100==0)
{
	if(year%400==0)
	System.out.println("Leap Year");
	else
	System.out.println("Not Leap Year");
}
else
{	if(year%4==0)
	System.out.println("Leap Year");
	else
	System.out.println("Not Leap Year");
}

}
}