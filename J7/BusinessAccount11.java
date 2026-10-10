package J7;

public class BusinessAccount11 extends Account11 {
    private static final double MINIMUM_BALANCE = 1000000;
    private double monthlyTransactionFee;

    public BusinessAccount11 (String accountName, Customer11 owner, double balance, double monthlyTransactionFee){
        super (accountName, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    public double getMonthlyTransactionFee(){
        return monthlyTransactionFee;
    }

    @Override 
    protected boolean canWithdraw (double amount) {
        return amount > 0 && (getBalance() - amount >= MINIMUM_BALANCE);
    }

    @Override 
    public void printInfo(){
        super.printInfo();
        System.out.println("Account type: Business, monthly fee: " + monthlyTransactionFee);
    }
}
