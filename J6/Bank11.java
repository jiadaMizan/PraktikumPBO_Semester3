package J6;

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

    public Account11 findAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
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
}
