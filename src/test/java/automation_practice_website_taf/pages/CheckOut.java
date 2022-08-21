package automation_practice_website_taf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends BasePage {

    @FindBy(id="cart_title")
    public WebElement shoppingCartTitleInCheckOutPage;

    @FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
    WebElement summaryProceedToCheckOutButtonInCheckOutPage;

    @FindBy(xpath="//button[@name='processAddress']")
    WebElement addressProcessToCheckOutButtonInCheckOutPage;

    @FindBy(xpath="//button[@name='processCarrier']")
    WebElement shippingProcessToCheckOutButtonInCheckOutPage;

    @FindBy(id="cgv")
    WebElement termsCheckBoxInCheckOutPage;

    @FindBy(xpath="//a[@class='bankwire']")
    WebElement payByBankWireButtonInCheckOutPage;

    @FindBy(xpath="//button[@class='button btn btn-default button-medium']")
    WebElement iConfirmMyOrderButtonInCheckOutPage;

    @FindBy(xpath="//h1[@class='page-heading']")
    public WebElement orderConfirmationTitleInCheckOutPage;

    @FindBy(xpath="//a[@title='Back to orders']")
    WebElement ordersHistoryLinkInCheckOutPage;

    @FindBy(xpath="//div[@class='box']")
    WebElement orderReferenceMessageInCheckOutPage;

    public OrderHistory checkOutProcedure() {
        summaryProceedToCheckOutButtonInCheckOutPage.click();
        addressProcessToCheckOutButtonInCheckOutPage.click();
        termsCheckBoxInCheckOutPage.click();
        shippingProcessToCheckOutButtonInCheckOutPage.click();
        payByBankWireButtonInCheckOutPage.click();
        iConfirmMyOrderButtonInCheckOutPage.click();
        ordersHistoryLinkInCheckOutPage.click();
        return new OrderHistory();
    }

}
