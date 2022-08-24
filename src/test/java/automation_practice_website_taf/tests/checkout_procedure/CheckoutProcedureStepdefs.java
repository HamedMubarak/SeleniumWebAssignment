package automation_practice_website_taf.tests.checkout_procedure;

import automation_practice_website_taf.base_test.BaseTest;
import automation_practice_website_taf.driver.WebDriverHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutProcedureStepdefs extends BaseTest {


    @Then("shopping cart page should be opened")
    public void shoppingCartPageShouldBeOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
                "http://automationpractice.com/index.php?controller=order");
    }

    @Then("{string} summary tab in checkout procedure should be opened")
    public void summaryTabInCheckoutProcedureShouldBeOpened(String yourShoppingCart) {
        Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText(),
                testData.getProperty(yourShoppingCart));
    }

    @And("click proceed to checkout button in summary tab in checkout procedure should be displayed")
    public void clickProceedToCheckoutButtonInSummaryTabInCheckoutProcedureShouldBeDisplayed() {
    browser.automationPracticeWebsite.checkOut.clickOnSummaryProceedToCheckOutButtonInCheckOutPage();
    }

    @Then("{string} address tab in checkout procedure should be opened")
    public void addressTabInCheckoutProcedureShouldBeOpened(String addressTab) {
        Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText()
                , testData.getProperty(addressTab));
    }

    @And("click on proceed to checkout button in address tab in checkout procedure")
    public void clickOnProceedToCheckoutButtonInAddressTabInCheckoutProcedure() {
    browser.automationPracticeWebsite.checkOut.clickOnAddressProceedToCheckOutButtonInCheckOutPage();
    }

    @Then("{string} shipping tab in check out procedure should be opened")
    public void shippingTabInCheckOutProcedureShouldBeOpened(String shippingTab) {
        Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText(),
                testData.getProperty(shippingTab));
    }

    @And("select terms of service checkbox in shipping tab in checkout procedure")
    public void selectTermsOfServiceCheckboxInShippingTabInCheckoutProcedure() {
        browser.automationPracticeWebsite.checkOut.clickOnTermsCheckBoxInCheckOutPage();
    }

    @And("click on proceed to checkout button in shipping tab in checkout procedure")
    public void clickOnProceedToCheckoutButtonInShippingTabInCheckoutProcedure() {
    browser.automationPracticeWebsite.checkOut.clickOnShippingProcessToCheckOutButtonInCheckOutPage();
    }

    @Then("{string} payment tab in checkout procedure should be opened")
    public void paymentTabInCheckoutProcedureShouldBeOpened(String paymentTab) {
        Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText()
                , testData.getProperty(paymentTab));
    }

    @And("click on pay by bank wire card in shipping tab in checkout procedure")
    public void clickOnPayByBankWireCardInShippingTabInCheckoutProcedure() {
    browser.automationPracticeWebsite.checkOut.clickOnPayByBankWireButtonInCheckOutPage();
    }

    @Then("{string} bank wire payment confirmation tab in checkout procedure should be opened")
    public void bankWirePaymentConfirmationTabInCheckoutProcedureShouldBeOpened(String bankWirePayment) {
    Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText(),
            testData.getProperty(bankWirePayment));
    }


    @And("click on i confirm my order button in payment tab in checkout procedure")
    public void clickOnIConfirmMyOrderButtonInPaymentTabInCheckoutProcedure() {
    browser.automationPracticeWebsite.checkOut.clickOniConfirmMyOrderButtonInCheckOutPage();
    }

    @Then("{string} order confirmation tab in checkout procedure should be opened")
    public void orderConfirmationTabInCheckoutProcedureShouldBeOpened(String orderConfirmation) {
    Assert.assertEquals(browser.automationPracticeWebsite.checkOut.getPagesNavigator().getText()
            ,testData.getProperty(orderConfirmation) );
    }

    @Then("{string} order reference in order information should be displayed")
    public void orderReferenceInOrderInformationShouldBeDisplayed(String orderReference) {
        Assert.assertTrue(browser.automationPracticeWebsite.checkOut
                .getOrderReferenceMessageInCheckOutPage().getText().contains(testData.getProperty(orderReference)));
    }

}
