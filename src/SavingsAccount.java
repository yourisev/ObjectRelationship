public class SavingsAccount extends BankAccount{
    private double interest;

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    public double checkBal(){
        return super.balance;
    }
}
