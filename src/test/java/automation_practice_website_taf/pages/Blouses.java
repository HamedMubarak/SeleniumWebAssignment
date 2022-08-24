package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import automation_practice_website_taf.browser.Browser;
import automation_practice_website_taf.driver.WebDriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Blouses extends BasePage {

    @FindBy(xpath="//img[@title='Blouse']")
    WebElement blouseProductInBlousesPage;

    @FindBy(xpath="//a[@title='Add to cart']")
    WebElement addToCartButtonInBlousesPage;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement processToCheckoutButtonInBlousesPage;

    public WebElement getAddToCartButtonInBlousesPage(){
        return addToCartButtonInBlousesPage;
    }

    public WebElement getProcessToCheckoutButtonInBlousesPage() {
        Browser.waitUntilVisibilityOfElement(processToCheckoutButtonInBlousesPage);
        return processToCheckoutButtonInBlousesPage;
    }

    public void clickOnAddToCartButtonInBlousesPage() {
        addToCartButtonInBlousesPage.click();
    }

    public void hooverOnBlousesProductInBlousesPage() {
        Actions action = new Actions(WebDriverHandler.getWebDriver());
        action.moveToElement(blouseProductInBlousesPage).perform();
    }

    public CheckOut clickOnProcessToCheckoutButtonInBlousesPage() {
        processToCheckoutButtonInBlousesPage.click();
        return new CheckOut();
    }

}
