import java.util.Date;

public class BankEvent {

    private String title;
    private Date date;

    public void party(){
        System.out.println("For the following "+ title+ "Bank event on "+ date.toString()+" will be time to party!!");
    }
}
