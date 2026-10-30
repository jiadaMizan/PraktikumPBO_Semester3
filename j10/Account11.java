package J10;

public abstract class Account11 {
    private String accountNumber;
    private Customer11 owner;
    private double balance;

    public Account11 (String accountNumber, Customer11 owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean deposit (double amount, String note){
        if (!deposit(amount)){
            return false;
        }
        System.out.println(accountNumber + " deposit note: " + note);
        return true;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public Customer11 getOwnerN() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit (double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public void withdraw(double amount) throws InsufficientBalanceException11 {
        if (!canWithdraw(amount)) {
            throw new InsufficientBalanceException11 (
                accountNumber + ": Insufficient balance for a withdrawal of " + amount);
        }
        balance -= amount;
    }

    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= balance;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }

    public abstract double monthlyFee();
}
