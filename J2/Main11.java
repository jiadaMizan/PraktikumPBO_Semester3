package J2;

public class Main11 {
    public static void main(String[] args) {
        Account11 from = new Account11("Nadia", 500000);
        Account11 to = new Account11("Budi", 200000);
        Account11 [] acc = new Account11[2];
        acc [0] = from;
        acc [1] = to;

        System.out.println("All data before transfering : ");
        for (Account11 account : acc) {
            account.printInfo();
        }
        
        from.transferTo (to, 100000);
        
        System.out.println("All data after transfering : ");
        from.printInfo();
        to.printInfo();
    }
}
