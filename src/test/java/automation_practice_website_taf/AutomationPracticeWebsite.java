package automation_practice_website_taf;

import automation_practice_website_taf.pages.*;

import java.util.zip.CheckedOutputStream;

public class AutomationPracticeWebsite extends BasePage{

    public Home home;
    public Login login;
    public CreateAccount createAccount;
    public MyAccount myAccount;
    public Blouses blouses;
    public CheckOut checkOut;
    public OrderHistory orderHistory;

    public AutomationPracticeWebsite()
    {
        login = new Login();
        createAccount = new CreateAccount();
        myAccount = new MyAccount();
        blouses = new Blouses();
        checkOut = new CheckOut();
        orderHistory = new OrderHistory();
    }
}

