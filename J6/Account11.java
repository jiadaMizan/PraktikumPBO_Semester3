package J6;

public class Account11 {
    private String accountNumber;
    private Customer11 owner;
    private double balance;

    public Account11 (String accountNumber, Customer11 owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
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

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance ) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - balance:" + balance);
    }
}
