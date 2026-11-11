package J11;

import java.util.Collection;

public interface AccountRepository11 {

    void save(Account11 account);

    Account11 findByNumber(String accountNumber);

    Collection<Account11> findAll();
}
