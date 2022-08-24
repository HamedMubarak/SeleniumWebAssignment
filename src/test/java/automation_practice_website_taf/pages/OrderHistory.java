package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory extends BasePage {

    @FindBy(xpath="//*[@id=\"order-list\"]/thead/tr/th[1]")
    public WebElement orderReferenceColumnHeaderInOrderHistoryPage;

    public WebElement getOrderReferenceColumnHeaderInOrderHistoryPage() {
        return orderReferenceColumnHeaderInOrderHistoryPage;
    }

}
