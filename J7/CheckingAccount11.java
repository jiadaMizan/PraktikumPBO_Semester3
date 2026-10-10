package J7;

public class CheckingAccount11 extends Account11{
    private double overdraftLimit;

    public CheckingAccount11 (String accountNumber, Customer11 owner, double balance, double overdraftLimit){
        super (accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    @Override 
    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}
