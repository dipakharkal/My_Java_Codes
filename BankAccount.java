public class BankAccount {
    protected double balance;
    protected double interestRate;
    
    public BankAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double calculateInterest() {
        return balance * interestRate;
    }
}

public class PlatinumBankAccount extends BankAccount {
    public PlatinumBankAccount(double initialBalance) {
        super(initialBalance, 0.1); // sets interest rate to 10%
    }
    
    // override the calculateInterest method to calculate interest with a bonus
    @Override
    public double calculateInterest() {
        double baseInterest = super.calculateInterest();
        double bonusInterest = balance * 0.05; // 5% bonus interest
        return baseInterest + bonusInterest;
    }
	public static void main(String[]args){
		
		BankAccount = new BankAccount(double.class); 
		
		
	}
}
