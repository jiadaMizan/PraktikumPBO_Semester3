package J11;

public class BusinessAccount11 extends Account11 {
    private static final double MINIMUM_BALANCE = 1000000;

    public BusinessAccount11 (String accountName, Customer11 owner, double balance){
        super (accountName, owner, balance);
    }

    @Override 
    protected boolean canWithdraw (double amount) {
        return amount > 0 && (getBalance() - amount >= MINIMUM_BALANCE);
    }

    @Override
    public double monthlyFee() {
        return 0;
    }

    @Override 
    public void printInfo(){
        super.printInfo();
        System.out.println("Account type: Business" );
    }
}

//Di class ini aku inisiatif menambahkan override untuk method monthlyfee agar tidak error.
