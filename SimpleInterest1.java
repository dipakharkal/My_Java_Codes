public class SimpleInterest1{

public static void main(String [] args){

	int amountTaken=10000;
	int noOfYears=2;
	int rateOfInterest=10;
	SimpleInterest(amountTaken,noOfYears,rateOfInterest);
}
public static void SimpleInterest(int amountTaken,int noOfYears,int rateOfInterest){	

	int simpleInterest=amountTaken*noOfYears*rateOfInterest/100;
	
	System.out.println(simpleInterest);

}
}