public class MilesAccount extends BankAccount{
    private String rewards;
    private int points;

    public String claim(String claim){
        return "The account holder "+ super.name+" of the account no."+super.accountId+"is making the following claim : "+claim;
    }

    public void addPoints(int pointsAdded){
        points += pointsAdded;
    }
}
