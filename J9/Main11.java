package J9;

public class Main11 {
    public static void main(String[] args) {
        Customer11 customer1 =new Customer11("Nadia", "0812-0000-0001");
        SavingsAccount11 acc1 = new SavingsAccount11("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);

        Customer11 customer2 = new Customer11("Sari", "0812-0000-0002");
        CheckingAccount11 acc2 = new CheckingAccount11("A002", customer2, 200000, 50000);
        
        Customer11 customer3 = new Customer11("Rian", "0812-0000-0003");
        SavingsAccount11 savings = new SavingsAccount11("A003", customer3, 100000, 0.02);
        savings.withdraw(70000);

        Customer11 customer4 = new Customer11("Dewi", "0812-0000-0004");
        CheckingAccount11 checking = new CheckingAccount11("A004", customer4, 100000, 200000);
        checking.withdraw(250000);

        Bank11 bank = new Bank11(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.printAllAccounts();
        bank.printMonthlyFees();

        System.out.println("Before interest " + savings.getBalance());
        savings.applyInterest();
        System.out.println("After interest: " + savings.getBalance());

        System.out.println("AUDIT LOG");
        System.out.println(checking.auditLog());
        System.out.println(acc2.auditLog());
    }
}
