public class leapYear2{

public static void main(String [] args){

int year=2010;

if((year%100==0&&year%400==0)||(year%100!=0&&year%4==0))
System.out.println(year + "Leap year" );
else
System.out.println(year + " is not a leap year");

}
}