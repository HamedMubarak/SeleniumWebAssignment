package automation_practice_website_taf.tests.authentication;
import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.base_test.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AuthenticatoinStepdefs extends BaseTest {

    @Then("authentication page should be opened")
    public void authenticationPageShouldBeOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
                "http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @And("enter {string} address in create an account card in authentication page")
    public void enterAddressInCreateAnAccountCardInAuthenticationPage(String email) {
        browser.automationPracticeWebsite.authentication
                .enterEmailAddressInCreateAnAccountCardInAuthenticationPage(testData.getProperty(email));
    }

    @And("click on create an account button in create an account card in authentication page")
    public void clickOnCreateAnAccountButtonInCreateAnAccountCardInAuthenticationPage() {
        browser.automationPracticeWebsite.createAccount = browser.automationPracticeWebsite
                .authentication.clickOnCreateAccountButtonInAuthenticationPage();
    }

    @And("enter {string} address in email address field in already registered card in authentication page")
    public void enterAddressInEmailAddressFieldInAlreadyRegisteredCardInAuthenticationPage(String email) {
        browser.automationPracticeWebsite.authentication
                .enterEmailAddressInAlreadyRegisteredCardInAuthenticationPage(testData.getProperty(email));
    }

    @And("enter {string} in password field in already registered card in authentication page")
    public void enterInPasswordFieldInAlreadyRegisteredCardInAuthenticationPage(String password) {
        browser.automationPracticeWebsite.authentication
                .enterPasswordInAlreadyRegisteredCardInAuthenticationPage(testData.getProperty(password));
    }

    @And("click on sign in button in authentication page")
    public void clickOnSignInButtonInAuthenticationPage() {
        browser.automationPracticeWebsite.myAccount = browser.automationPracticeWebsite.authentication
                .clickOnSignInButtonInAlreadyRegisteredCardInAuthenticationPage();
    }

    @Then("my account page should be opened")
    public void myAccountPageShouldBeOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
                "http://automationpractice.com/index.php?controller=my-account");
    }

    @Then("{string} already registered error message should be appeared")
    public void alreadyRegisteredErrorMessageShouldBeAppeared(String message) {
        Assert.assertTrue(browser.automationPracticeWebsite.authentication
                .getAuthenticationErrorMsgInCreateAnAccountCardInAuthenticationPage()
                .getText().contains(testData.getProperty(message)));
    }

    @Then("{string} invalid password error message should be appeared")
    public void invalidPasswordErrorMessageShouldBeAppeared(String message) {
        Assert.assertTrue(browser.automationPracticeWebsite.authentication
                .getInvalidPasswordErrorMsgInAlreadyRegisteredCardInAuthenticationPage()
                .getText().contains(testData.getProperty(message)));
    }
}
