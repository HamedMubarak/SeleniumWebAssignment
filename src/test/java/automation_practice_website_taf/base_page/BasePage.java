package automation_practice_website_taf.base_page;

import automation_practice_website_taf.driver.WebDriverHandler;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(WebDriverHandler.getWebDriver(), this);
    }


}
