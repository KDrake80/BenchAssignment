package Back.PetCalendar.Service;

import Back.PetCalendar.Dao.AccountDao;
import Back.PetCalendar.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountDao dao;

    public List<Account> getAccounts() {
        return this.dao.findAll();
    }
    public Account getAccountById(Integer id) {
        Optional<Account> account = this.dao.findById(id);
        Account a = null;
        if (account.isPresent()) {
            a = account.get();
        } else {
            throw new RuntimeException("No Account with that ID");
        }
        return a;
    }
    public Account updateAccount(Account account) {
        return this.dao.save(account);
    }
    public Account createNewAccount(Account account) {
        return this.dao.save(account);
    }
    public String deleteById(Integer id) {
        Account a = getAccountById(id);
        this.dao.deleteById(id);

        return "Account " + a.getName() + " was Deleted Successfully";
    }
}
