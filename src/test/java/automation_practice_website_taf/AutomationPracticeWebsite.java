package automation_practice_website_taf;

import automation_practice_website_taf.base_page.BasePage;
import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.pages.*;

public class AutomationPracticeWebsite extends BasePage {

    public Home home;
    public Authentication authentication;
    public CreateAccount createAccount;
    public MyAccount myAccount;
    public Blouses blouses;
    public CheckOut checkOut;
    public OrderHistory orderHistory;


    public AutomationPracticeWebsite()
    {
        home = new Home();
        authentication = new Authentication();
        createAccount = new CreateAccount();
        blouses = new Blouses();
        checkOut = new CheckOut();
        orderHistory = new OrderHistory();
        myAccount = new MyAccount();

    }
}

