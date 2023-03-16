public class HeartPattern{
//refer for logic

public static void main(String [] args){

for(int i=0;i<13;i++)
{
for(int j=0;j<17;j++)
{
//for calculating 
// we can use || to do this task in 2 lines (put || in conditions of is and else if)
if(( j+i>=3 && j-i<=5 && j<=8 && j-i>=-4)||(j>8 && j+i>=11 && j-i<=13 && j+i<=20))
	System.out.print("*");
else
	System.out.print(" ");
}
System.out.println();
}

}
}