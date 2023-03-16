public class swapnumber{
//using third variable
public static void swap(int num1,int num2){
System.out.println("Numbers before swapping: "+num1+" "+num2);
	int num3=num1;
	num1=num2;
	num2=num3;
System.out.println("Numbers after swapping: "+num1+" "+num2);
}
public static void main(String[]args){
	int num1=5;
	int num2=6;
	swap(num1,num2);
}
}