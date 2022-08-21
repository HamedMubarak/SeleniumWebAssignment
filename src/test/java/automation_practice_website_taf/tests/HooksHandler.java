package automation_practice_website_taf.tests;

import automation_practice_website_taf.browser.Browser;
import automation_practice_website_taf.driver.WebDriverHandler;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class HooksHandler extends BaseTest {

    @BeforeSuite
    public void setUpAutomationPracticeWebsite () throws IOException {
        webDriverHandler = new WebDriverHandler();
        BaseTest.browser = new Browser();
        webDriverHandler.navigateTo("http://automationpractice.com/index.php");
    }

    @AfterSuite
    public void closeDriver()
    {
        webDriverHandler.close();
    }

}
