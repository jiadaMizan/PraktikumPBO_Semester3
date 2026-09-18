package J4;

public class Main11 {
    public static void main(String[] args) {
        Customer11 customer1 = new Customer11("Nadia", "0812-0000-0001");
        Account11 acc1 = new Account11("A001", customer1, 500000);
        Account11 acc2 = new Account11("A002", customer1, 2000000);

        Customer11 customer2 = new Customer11("Sari", "0812-0000-0002");
        Account11 acc3 = new Account11("A003", customer2, 200000);

        Bank11 bank = new Bank11(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        System.out.println("===== Show All Accounts =====");
        bank.printAllAccounts();
        System.out.println();
        
        Account11[] found = bank.findAccountsByOwnerName("Nada");
        if (found != null && found.length > 0) {
            System.out.println("===== Show Account Named : " + found[0].getOwnerN().getName() + " =====");
            System.out.println("Amount Accounts Found    : " + found.length);
            for (Account11 acc : found) {
                acc.printInfo();
            }
        } else {
            System.out.println("Account With That Name Not Found");
        }
    }
}
