package automation_practice_website_taf.tests.create_account;

import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.base_test.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateAccountStepdefs extends BaseTest {

    @Then("create account page should be opened")
    public void createAccountPageShouldBeOpened() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.automationPracticeWebsite
                .createAccount.getFirstNameFieldInCreateAccountPage()));
    }

    @When("enter {string} in first name field in create account page")
    public void enterInFirstNameFieldInCreateAccountPage(String firstName) {
        browser.automationPracticeWebsite.createAccount
                .enterFirstNameInCreateAccountPage(testData.getProperty(firstName));
    }

    @And("enter {string} in last name field in create account page")
    public void enterInLastNameFieldInCreateAccountPage(String lastName) {
        browser.automationPracticeWebsite.createAccount
                .enterLastNameInCreateAccountPage(testData.getProperty(lastName));
    }

    @And("enter {string} in password field in create account page")
    public void enterInPasswordFieldInCreateAccountPage(String password) {
        browser.automationPracticeWebsite.createAccount.
                enterPasswordInCreateAccountPage(testData.getProperty(password));
    }

    @And("enter {string} in address field in create account page")
    public void enterInAddressFieldInCreateAccountPage(String address) {
        browser.automationPracticeWebsite.createAccount
                .enterAddressInCreateAccountPage(testData.getProperty(address));
    }

    @And("enter {string} in city field in create account page")
    public void enterInCityFieldInCreateAccountPage(String city) {
        browser.automationPracticeWebsite.createAccount
                .enterCityInCreateAccountPage(testData.getProperty(city));
    }

    @And("select {string} from state dropdown list in create account page")
    public void selectFromStateDropdownListInCreateAccountPage(String state) {
        browser.automationPracticeWebsite.createAccount
                .selectStateInCreateAccountPage(testData.getProperty(state));
    }

    @And("enter {string} in zip field in create account page")
    public void enterInZipFieldInCreateAccountPage(String zip) {
        browser.automationPracticeWebsite.createAccount
                .enterZipCodeInCreateAccountPage(testData.getProperty(zip));
    }

    @And("enter {string} in mobile phone field in create account page")
    public void enterInMobilePhoneFieldInCreateAccountPage(String mobilePhone) {
        browser.automationPracticeWebsite.createAccount
                .enterMobilePhoneInCreateAccountPage(testData.getProperty(mobilePhone));
    }

    @And("enter {string} in address alias field in create account page")
    public void enterInAddressAliasFieldInCreateAccountPage(String alias) {
        browser.automationPracticeWebsite.createAccount.
                enterAliasAddressInCreateAccountPage(testData.getProperty(alias));
    }

    @And("click on register button in create account page")
    public void clickOnRegisterButtonInCreateAccountPage() {
    browser.automationPracticeWebsite.myAccount=
            browser.automationPracticeWebsite.createAccount.clickOnRegisterButtonInCreateAccountPage();
    }

}
