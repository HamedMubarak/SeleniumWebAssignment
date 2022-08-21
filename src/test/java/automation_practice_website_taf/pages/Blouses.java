package automation_practice_website_taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Blouses extends BasePage {

    @FindBy(xpath="//span[@class='cat-name']")
    public WebElement blousesTitleInBlousesPage;

    @FindBy(xpath="//a[@class='product_img_link']")
    WebElement blouseProductInBlousesPage;

    @FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
    WebElement addToCartButtonInBlousesPage;

    @FindBy(xpath="//a[@class='btn btn-default button button-medium']")
    WebElement processToCheckoutButtonInBlousesPage;

    public CheckOut addSelectedBlouseProductToCart()
    {
        actions.moveToElement(blouseProductInBlousesPage).perform();
        addToCartButtonInBlousesPage.click();
        wait.until(ExpectedConditions.elementToBeClickable((processToCheckoutButtonInBlousesPage)));
        processToCheckoutButtonInBlousesPage.click();
        return new CheckOut();
    }


}
