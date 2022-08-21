package automation_practice_website_taf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory extends BasePage {

    @FindBy(id="center_column")
    public WebElement orderHistoryTableInOrderHistoryPage;

    @FindBy(xpath="//a[@class='color-myaccount']")
    public WebElement orderReferenceInOrderHistoryPage;

    public WebElement getOrderReferenceInOrderHistoryPage() {
        return orderReferenceInOrderHistoryPage;
    }

    public void orderIsPlacedSucceffully(String orderReference) {

    }
}
