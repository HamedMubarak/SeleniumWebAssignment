package automation_practice_website_taf.browser;

import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.AutomationPracticeWebsite;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {

    private final WebDriver webDriver = WebDriverHandler.getWebDriver();

    public AutomationPracticeWebsite automationPracticeWebsite;

    public Browser() { automationPracticeWebsite = new AutomationPracticeWebsite(); }

    public void swipeTo(WebElement targetElement) {
        Actions actions = new Actions(webDriver);
        actions.dragAndDropBy(targetElement, 200, 0).build().perform();
    }

    public int getXCoordinate(WebElement element) {
        Point elementPoint = element.getLocation();
        return elementPoint.getX();
    }

    public boolean  waitTillTextToBePresentInElement(WebElement elementToBeDisplayed, String textToBeCompared) {
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.textToBePresentInElement(elementToBeDisplayed, textToBeCompared));
        }catch (Exception e){
            return false;
        }
        return true;
    }

}

