package automation_practice_website_taf.pages;

import automation_practice_website_taf.driver.WebDriverHandler;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public BasePage() {
        int waitTime=35;
        PageFactory.initElements(new AjaxElementLocatorFactory(WebDriverHandler.getWebDriver(), waitTime), this);
    }
    protected WebDriver webDriver;
    protected WebDriverWait wait;
    protected Select select;
    protected Actions actions;

    public static void  waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public static void  waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilVisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public boolean elementIsDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean elementIsSelected(WebElement element) {
        try {
            return element.isSelected();
        } catch (Exception e) {
            return false;
        }
    }

    public void scrollTo(WebElement element) {
        Actions actionProvider = new Actions(WebDriverHandler.getWebDriver());
        final int xOffset = 300;
        final int yOffset = 0;
        do {
            if(elementIsDisplayed(element)) {
                actionProvider.moveToElement(element, xOffset, yOffset);
                actionProvider.perform();
                break;
            }
            actionProvider.sendKeys((Keys.ARROW_DOWN)).build().perform();
        }
        while(true);
    }

    public WebElement getElementByPartialText(String text) {
        String textXpath = "//*[contains(text(), \"" + text + "\")]";
        WebDriver driver = WebDriverHandler.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(textXpath)));
        return driver.findElement(By.xpath(textXpath));
    }

    public void clickOnElementWithPartialText(String text) {
        getElementByPartialText(text).click();
    }

}
