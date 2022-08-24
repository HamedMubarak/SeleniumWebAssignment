package automation_practice_website_taf.tests;

import automation_practice_website_taf.base_test.BaseTest;
import automation_practice_website_taf.browser.Browser;
import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.utilities.ConfigProperties;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before()
    public void setUpAutomationPracticeWebsite() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        testData = new ConfigProperties("resources/Data.properties");
        configBrowser = new ConfigProperties("resources/configBrowser.properties");
        webDriverHandler.navigateToUrl(configBrowser.getProperty("url"));
    }
    @AfterStep()
    public void waitTillVisibiltyOfPage() throws InterruptedException {
        Thread.sleep(150);
    }
    @After()
    public void closeAutomationPracticeWebsite() {
        webDriverHandler.resetCache();
        webDriverHandler.close();
    }

}
