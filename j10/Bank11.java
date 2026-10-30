package J10;

public class Bank11 {
    private Account11[] accounts;
    private int count;

    public  Bank11 (int capasity) {
        accounts = new Account11[capasity];
        count = 0;
    }

    public boolean addAccount(Account11 account){
        if (count >= accounts.length) {
            return false;
        } 
        accounts[count] = account;
        count++;
        return true;
    }

    public Account11 findAccount(String accountNumber) throws AccountNotFoundException11{
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return accounts[i];
            }
        }
        throw new AccountNotFoundException11("Account with number " + accountNumber + " not found. Please input again.");
    }

    public Account11[] findAccountsByOwnerName(String name) {
        int matchCount = 0;
        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwnerN().getName().equals(name)){
                matchCount++;
            }
        }
        Account11[] matches = new Account11[matchCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwnerN().getName().equals(name)) {
                matches[index] = accounts[i];
                index++;
            }
        }
        return matches;
    }
    public void printAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    } 
    public void printMonthlyFees() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i].getAccountNumber() + " fee: " + accounts[i].monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (int i = 0; i < count; i++) {
            Account11 acc = accounts [i];
            if (acc instanceof InterestBearing11 bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balanced: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printAuditLog() {
        for (int i = 0; i < count; i++) {
            Account11 acc = accounts[i];
            if (acc instanceof Auditable11 audit) {
                System.out.println(audit.auditLog()); 
            }
        }
    }
}