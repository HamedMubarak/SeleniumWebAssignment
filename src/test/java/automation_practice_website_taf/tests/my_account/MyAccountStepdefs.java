package automation_practice_website_taf.tests.my_account;

import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.base_test.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountStepdefs extends BaseTest {

    @When("hoover on women category")
    public void hooverOnWomenCategory() {
        browser.automationPracticeWebsite.myAccount.hooverOnWomenCategory();
    }

    @Then("blouses subcategory in women category should be displayed")
    public void blousesSubcategoryInWomenCategoryShouldBeDisplayed() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.automationPracticeWebsite.myAccount
                .getBlousesSubCategoryInWomenCategoryInMyAccountPage()));
    }

    @When("click on blouses subcategory in women category")
    public void clickOnBlousesSubcategoryInWomenCategory() {
        browser.automationPracticeWebsite.blouses =
                browser.automationPracticeWebsite.myAccount.clickOnBlousesSubCategoryInWomenCategoryInMyAccountPage();
    }

    @Then("blouses subcategory page should be opened")
    public void blousesSubcategoryPageShouldBeOpened() {
    Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
            "http://automationpractice.com/index.php?id_category=7&controller=category");
    }

    @And("hoover on resulted product image in blouses subcategory page")
    public void hooverOnResultedProductImageInBlousesSubcategoryPage() {
    browser.automationPracticeWebsite.blouses.hooverOnBlousesProductInBlousesPage();
    }

    @Then("add to cart button in blouses subcategory page should be displayed")
    public void addToCartButtonInBlousesSubcategoryPageShouldBeDisplayed() {
    Assert.assertTrue(browser.elementIsDisplayed(browser.automationPracticeWebsite
            .blouses.getAddToCartButtonInBlousesPage()));
    }

    @When("click on add to cart button in blouses subcategory page")
    public void clickOnAddToCartButtonInBlousesSubcategoryPage() {
    browser.automationPracticeWebsite.blouses.clickOnAddToCartButtonInBlousesPage();
    }

    @Then("proceed to check out button in blouses subcategory page should be displayed")
    public void proceedToCheckOutButtonInBlousesSubcategoryPageShouldBeDisplayed() {
    Assert.assertTrue(browser.elementIsDisplayed(browser.automationPracticeWebsite
            .blouses.getProcessToCheckoutButtonInBlousesPage()));
    }
    @When("click on proceed to checkout button in blouses subcategory page")
    public void clickOnProceedToCheckoutButtonInBlousesSubcategoryPage() {
        browser.automationPracticeWebsite.checkOut =
                browser.automationPracticeWebsite.blouses.clickOnProcessToCheckoutButtonInBlousesPage();
    }

    @And("click on order history and details card in my account page")
    public void clickOnOrderHistoryAndDetailsCardInMyAccountPage() {
        browser.automationPracticeWebsite.orderHistory =
                browser.automationPracticeWebsite.myAccount.clickOnOrderHistoryCardInMyAccountPage();
    }

}
