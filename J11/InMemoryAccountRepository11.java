package J11;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryAccountRepository11 implements AccountRepository11{
    private Map <String, Account11> accounts = new LinkedHashMap<>();

    @Override
    public void save (Account11 account){
        accounts.put(account.getAccountNumber(), account);
    }

    @Override 
    public Account11 findByNumber(String accountNumber){
        return accounts.get(accountNumber);
    }

    @Override
    public Collection <Account11> findAll(){
        return accounts.values();
    }
}
