package J11;

public class Transaction11 {
    private TransactionType11 type;
    private double amount;

    public Transaction11(TransactionType11 type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public TransactionType11 getType() {
        return type;
    }

    public double getAmount(){
        return amount;
    }

    @Override 
    public String toString(){
        return type + " " + amount;
    }
}
