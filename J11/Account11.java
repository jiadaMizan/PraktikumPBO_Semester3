package J11;

import java.util.ArrayList;
import java.util.List;

public abstract class Account11 {
    private String accountNumber;
    private Customer11 owner;
    private double balance;

    public Account11 (String accountNumber, Customer11 owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    private List <Transaction11> history = new ArrayList<>();

    public boolean deposit (double amount){
        if (amount <= 0){
            return false;
        }
        balance += amount;
        history.add(new Transaction11(TransactionType11.DEPOSIT, amount));
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

    public void withdraw(double amount) throws InsufficientBalanceException11 {
        if (!canWithdraw(amount)) {
            throw new InsufficientBalanceException11 (
                accountNumber + ": Insufficient balance for a withdrawal of " + amount);
        }
        balance -= amount;
        history.add(new Transaction11(TransactionType11.WITHDRAW, amount));
    }

    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= balance;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }

    public abstract double monthlyFee();

    public List<Transaction11> getHistory(){
        return history;
    }
}
