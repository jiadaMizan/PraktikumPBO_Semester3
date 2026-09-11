package J3;

public class Main11 {
    public static void main(String[] args) {
        Account11 limited = new Account11("A005", "Fajar", 1000000, 200000);
        System.out.println("Withdraw 300000 allowed? " + limited.withdraw(300000));
        System.out.println("Withdraw 150000 allowed? " + limited.withdraw(150000));

        System.out.println("Berikut adalah data setelah melakukan withdrawal :");
        limited.printInfo();
    }
}
