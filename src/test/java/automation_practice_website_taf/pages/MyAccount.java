package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import automation_practice_website_taf.driver.WebDriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement womenCategoryInMyAccountPage;

    @FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a")
    public WebElement blousesSubCategoryInWomenCategoryInMyAccountPage;

    @FindBy(xpath="//a[@title='Orders']")
    public WebElement orderHistoryCardInMyAccountPage;

    public WebElement getBlousesSubCategoryInWomenCategoryInMyAccountPage() {
          return blousesSubCategoryInWomenCategoryInMyAccountPage;
      }

    public void hooverOnWomenCategory() {
        Actions action = new Actions(WebDriverHandler.getWebDriver());
          action.moveToElement(womenCategoryInMyAccountPage).perform();
    }

    public Blouses clickOnBlousesSubCategoryInWomenCategoryInMyAccountPage() {
          blousesSubCategoryInWomenCategoryInMyAccountPage.click();
          return new Blouses();
      }

    public OrderHistory clickOnOrderHistoryCardInMyAccountPage() {
        orderHistoryCardInMyAccountPage.click();
        return new OrderHistory();
    }

}
