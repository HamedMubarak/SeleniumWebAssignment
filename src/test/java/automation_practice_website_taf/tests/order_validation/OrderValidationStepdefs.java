package automation_practice_website_taf.tests.order_validation;

import automation_practice_website_taf.driver.WebDriverHandler;
import automation_practice_website_taf.base_test.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OrderValidationStepdefs extends BaseTest {

    @Then("order history page should be opened")
    public void orderHistoryPageShouldBeOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
                "http://automationpractice.com/index.php?controller=history");
    }

    @Then("order is placed in order history page with order reference {string}")
    public void orderIsPlacedInOrderHistoryPageWithOrderReference(String orderReference) {

    }

    @And("order reference column header in order history page is displayed")
    public void orderReferenceColumnHeaderInOrderHistoryPageIsDisplayed() {
        Assert.assertFalse(!(browser.elementIsDisplayed(browser.automationPracticeWebsite
                .orderHistory.getOrderReferenceColumnHeaderInOrderHistoryPage())));
    }
}
