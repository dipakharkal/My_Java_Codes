public class CompairAsciiChar{

public static void main(String [] args){

char ch = ' ';

if (ch>='A' && ch<='Z')
System.out.println("Capital");
else if (ch>='a' && ch<='z')
System.out.println("Small");
else if (ch>='0' && ch<='9')
System.out.println("Digit");
else 
System.out.println("Something else");

}
}