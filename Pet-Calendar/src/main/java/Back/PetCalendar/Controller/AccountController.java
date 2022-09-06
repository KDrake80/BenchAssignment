package Back.PetCalendar.Controller;

import Back.PetCalendar.Entity.Account;
import Back.PetCalendar.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService service;
    @RequestMapping("/")
    public String homePage(){
        return "<HTML><H1> Home Page </H1></HTML>";
    }
    @GetMapping("/Accounts")
    public List<Account> getAllAccounts(){
        return this.service.getAccounts();
    }
    @GetMapping("/Accounts/{id}")
    public Account getAccountById(@PathVariable String id){
        return this.service.getAccountById(Integer.parseInt(id));
    }
    @PutMapping("/Accounts")
    public Account updateAccount(@RequestBody Account account){
        return this.service.updateAccount(account);
    }
    @PostMapping("/Accounts")
    public Account createNewAccount(@RequestBody Account account){
        return this.service.createNewAccount(account);
    }
    @DeleteMapping("/Accounts/{id}")
    public String deleteAccount(@PathVariable String id){
        return this.service.deleteById(Integer.parseInt(id));
    }
}
