package J7;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("===WIITHDRAWAL TESTING===");
        System.out.println();

        Customer11 customer2 = new Customer11("Jiada", "0812-0000-0004");
        BusinessAccount11 acc1 = new BusinessAccount11("A004", customer2, 2000000, 10000);
        System.out.println("-" + customer2.getName() + "'s account before withdrawal: ");
        acc1.printInfo();
        System.out.println();

        double amount = 1500000;
        boolean result = acc1.withdraw(amount);
        System.out.println("- Withdraw " + amount + " allowed? " + result);
        System.out.println();
        System.out.println("-" + customer2.getName() + "'s account after withdrawal: ");
        acc1.printInfo();
        
    }
}
