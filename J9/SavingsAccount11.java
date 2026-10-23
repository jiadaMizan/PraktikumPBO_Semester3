package J9;

public class SavingsAccount11 extends Account11 implements InterestBearing11 {
    private static final double MAXIMUN_BALANCE = 50000;
    private double interestRate;

    public SavingsAccount11 (String accountNumber, Customer11 owner, double balance,  double interesrRate){
        super (accountNumber, owner, balance);
        this.interestRate = interesrRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    @Override 
    protected boolean canWithdraw(double amount){
        return amount > 0 && (getBalance() - amount) >= MAXIMUN_BALANCE;
    }

    @Override 
    public void printInfo(){
        super.printInfo();
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }

    public double monthlyFee() {
        return 0;
    }

    @Override 
    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

}
