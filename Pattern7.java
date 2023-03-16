public class Pattern7{
//refer for logic

public static void main(String [] args){

for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
//for calculating 
// we can use || to do this task in 2 lines (put || in conditions of is and else if)
if(j+i>=4 && j-i<=4 && j+i<=12 && j-i>=-4)
	System.out.print("*");	
else
	System.out.print(" ");
}
System.out.println();
}



}
}