package automation_practice_website_taf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

    @FindBy(xpath="//p[@class='info-account']")
    public WebElement welcomeMsgInMyAccountPage;

    @FindBy(xpath="//a[@title='Orders']")
    public WebElement orderHistoryCardInMyAccountPage;

    public WebElement getWelcomeMsgInMyAccountPage() {
        return welcomeMsgInMyAccountPage;
    }

    public OrderHistory clickOnOrderHistoryCard() {
        orderHistoryCardInMyAccountPage.click();
        return new OrderHistory();
    }
}
