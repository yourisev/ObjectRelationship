import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<BankAccount> accounts;

    public void createAccount(){

    }

    public boolean subscribe(BankEvent event){
        return event != null;
    }
}
