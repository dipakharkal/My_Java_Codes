public class profitLoss{

public static void main(String [] args){

int pp=600;
int sp=800;

if(pp<sp)
System.out.println("the profit is :"+(sp-pp));
else if(sp<pp)
System.out.println("the loss is : "+(pp-sp));
else
System.out.println("NO profit NO loss");

}
}