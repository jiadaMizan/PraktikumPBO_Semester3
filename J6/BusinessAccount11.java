package J6;

public class BusinessAccount11 extends Account11 {
    private double monthlyTransactionFee;

    public BusinessAccount11 (String accountName, Customer11 owner, double balance, double monthlyTransactionFee){
        super (accountName, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    public double getMonthlyTransactionFee(){
        return monthlyTransactionFee;
    }

    public void printAccountType(){
        System.out.println("Account type: Business, monthly fee: " + monthlyTransactionFee);
    }
}
