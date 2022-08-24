package automation_practice_website_taf.browser;

import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.AutomationPracticeWebsite;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {

    public AutomationPracticeWebsite automationPracticeWebsite;

    public Browser() {
        automationPracticeWebsite = new AutomationPracticeWebsite();
    }

    public boolean elementIsDisplayed (WebElement element)
    {
       try{
           return element.isDisplayed();
       }catch (Exception e) {
           return false;
       }
    }

    public static void waitUntilVisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}