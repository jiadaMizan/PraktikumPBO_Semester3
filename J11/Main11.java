package J11;

public class Main11 {
    public static void main(String[] args) {
        Customer11 customer1 =new Customer11("Nadia", "0812-0000-0001");
        SavingsAccount11 acc1 = new SavingsAccount11("A001", customer1, 500000, 0.01);

        Customer11 customer2 = new Customer11("Sari", "0812-0000-0002");
        CheckingAccount11 acc2 = new CheckingAccount11("A002", customer2, 200000, 50000);
        
        Customer11 customer3 = new Customer11("Rian", "0812-0000-0003");
        SavingsAccount11 savings = new SavingsAccount11("A003", customer3, 100000, 0.02);

        Customer11 customer4 = new Customer11("Budi", "0812-0000-0004");
        BusinessAccount11 bussiness = new BusinessAccount11("A004", customer4, 2000000);

        try {
            savings.withdraw(70000);
        } catch (InsufficientBalanceException11 e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            savings.withdraw(30000);
            System.out.println("Withdrawal succeedeed, new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException11 e) {
            System.out.println("Withdrawal failde: " + e.getMessage());
        }
        
        Bank11 bank = new Bank11(new InMemoryAccountRepository11());
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.addAccount(bussiness);
        bank.processMonthEnd();
        bank.printAllAccounts();
    }
}
