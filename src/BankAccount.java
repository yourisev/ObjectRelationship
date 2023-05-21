import java.util.List;

public class BankAccount {

    protected int accountId;
    protected double balance;
    protected String name;
    private List<SubAccount> subAccounts;

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
