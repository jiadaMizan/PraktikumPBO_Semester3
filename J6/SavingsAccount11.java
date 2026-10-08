package J6;

public class SavingsAccount11 extends Account11 {
    private double interestRate;

    public SavingsAccount11 (String accountNumber, Customer11 owner, double balance,  double interesrRate){
        super (accountNumber, owner, balance);
        this.interestRate = interesrRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void printAccountType(){
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}
