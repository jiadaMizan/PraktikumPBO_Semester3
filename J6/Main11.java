package J6;

public class Main11 {
    public static void main(String[] args) {
        Customer11 customer1 = new Customer11("Nadia", "0812-0000-0001");
        SavingsAccount11 acc1 = new SavingsAccount11("A001", customer1, 500000, 0.01);
        acc1.printInfo();
        acc1.printAccountType();
        acc1.withdraw(150000);
        System.out.println();
        
        Customer11 customer2 = new Customer11("Sari", "0812-0000-0002");
        CheckingAccount11 acc2 = new CheckingAccount11("A002", customer2, 200000, 50000);
        acc2.printInfo();
        acc2.printAccountType();
        acc2.withdraw(230000);
        System.out.println();
        
        Customer11 customer3 = new Customer11("Jiada", "0812-0000-0003");
        BusinessAccount11 acc3 = new BusinessAccount11("A003", customer3, 700000, 10000);
        acc3.printInfo();
        acc3.printAccountType();
        acc3.withdraw(50000);
        System.out.println();
        
        Bank11 bank = new Bank11(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.printAllAccounts();
        System.out.println();
    }
}
