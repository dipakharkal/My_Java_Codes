public class CompoundInterest{

public static void main(String [] args){

int p=1000;

int r=10;

int t=2;

int n=1;

double n1 = 1+(r/(n*100.0));
int n2 = n*t;
double amount = p *Math.pow(n1,n2);

System.out.println(amount);

}
}