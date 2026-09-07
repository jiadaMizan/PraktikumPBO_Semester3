package J2;

public class Account11 {
    public String ownerName;
    public double balance;

    public Account11 (String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }

    public void withdraw (double amount){
        balance = balance - amount;
        if (isOverdrawn()){
            balance = balance + amount;
            System.out.println("Withdrawal rejected: insufficient balance.");
        }
    }

    public void printInfo(){
        System.out.println(ownerName + " - balance: " + balance);
    }

    public String formatBalance (){
        return String.format("%,.2f", balance);
    }

    public boolean isOverdrawn(){
        return balance < 0;
    }

    public void transferTo (Account11 to, double amount){
        if (amount < balance) {
            balance = balance - amount;
            to.balance = to.balance + amount;
        } else {
            System.out.println("Transfer rejected: insufficient balance");
        }
    }
}
