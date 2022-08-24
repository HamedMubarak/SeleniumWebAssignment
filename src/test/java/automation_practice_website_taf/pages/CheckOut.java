package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends BasePage {


    @FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
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

    @FindBy(xpath="//div[@class='box']")
    WebElement orderReferenceMessageInCheckOutPage;

    @FindBy(xpath="//span[@class='navigation_page']")
    WebElement pagesNavigator;

    public WebElement getPagesNavigator() {
        return pagesNavigator;
    }

    public WebElement getOrderReferenceMessageInCheckOutPage() {
        return orderReferenceMessageInCheckOutPage;
    }

    public  void clickOnSummaryProceedToCheckOutButtonInCheckOutPage() {
        summaryProceedToCheckOutButtonInCheckOutPage.click();
    }

    public  void clickOnAddressProceedToCheckOutButtonInCheckOutPage() {
        addressProcessToCheckOutButtonInCheckOutPage.click();
    }

    public void clickOnTermsCheckBoxInCheckOutPage() {
        termsCheckBoxInCheckOutPage.click();
    }

    public void clickOnShippingProcessToCheckOutButtonInCheckOutPage() {
        shippingProcessToCheckOutButtonInCheckOutPage.click();
    }
    public  void clickOnPayByBankWireButtonInCheckOutPage() {
        payByBankWireButtonInCheckOutPage.click();
    }

    public void clickOniConfirmMyOrderButtonInCheckOutPage() {
        iConfirmMyOrderButtonInCheckOutPage.click();
    }

}
