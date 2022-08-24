package automation_practice_website_taf.tests;

import automation_practice_website_taf.base_test.BaseTest;
import automation_practice_website_taf.driver.WebDriverHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CommonStepdefs extends BaseTest {

    @When("click on Sign in button in user info header")
    public void clickOnSignInButtonInUserInfoHeader() {
        browser.automationPracticeWebsite.authentication = browser.automationPracticeWebsite.home.clickOnSignInButton();
    }

    @Given("home page is opened")
    public void homePageIsOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),"http://automationpractice.com/index.php");
    }

    @Then("sign in button in home page should be displayed")
    public void signInButtonInHomePageShouldBeDisplayed() {
        Assert.assertTrue(browser.automationPracticeWebsite.home.getSignInButton().isDisplayed());
    }

}
