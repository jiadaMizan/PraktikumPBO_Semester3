package J6;

public class CheckingAccount11 extends Account11{
    private double overdraftLimit;

    public CheckingAccount11 (String accountNumber, Customer11 owner, double balance, double overdraftLimit){
        super (accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void printAccountType() {
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}
