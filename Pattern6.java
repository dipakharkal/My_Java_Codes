public class Pattern6{
//refer for logic
//cross or loop
public static void main(String [] args){

for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
//for calculating 
// we can use || to do this task in 2 lines (put || in conditions of is and else if)
	if(j-i>=0 && j<=4 && i<=4)
System.out.print("*");
else if(j>=4 && i>4 && j-i<=0)
	System.out.print("*");	
else
	System.out.print(" ");
}
System.out.println();
}




}
}