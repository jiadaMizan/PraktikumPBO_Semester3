package J11;

public class Bank11 {
    private AccountRepository11 repository;

    public Bank11 (AccountRepository11 repository){
        this.repository = repository;
    }

    public boolean addAccount(Account11 account){
        if (repository.findByNumber(account.getAccountNumber()) != null){
            return false;
        }
        repository.save(account);
        return true;
    }

    public Account11 findAccount(String accountNumber) {
        return repository.findByNumber(accountNumber);
    }

    public void printAllAccounts() {
        for (Account11 acc : repository.findAll()) {
            acc.printInfo();
        }
    } 

    public void printMonthlyFees() {
        for (Account11 acc : repository.findAll()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        for(Account11 acc : repository.findAll()) {
            if (acc instanceof InterestBearing11 bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balanced: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printAuditLog() {
        for (Account11 acc : repository.findAll()) {
            if (acc instanceof Auditable11 audit) {
                System.out.println(audit.auditLog()); 
            }
        }
    }

    public void printHistory(String accountNumber){
        Account11 acc = findAccount(accountNumber);
        if (acc == null){
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for (Transaction11 t : acc.getHistory()) {
            System.out.println(accountNumber + "" + t);
        }
    }
}