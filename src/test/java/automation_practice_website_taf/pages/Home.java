package automation_practice_website_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{

    @FindBy(xpath="//div[@class='header_user_info']/a")
    WebElement signInButtonInHomePage;

    @FindBy(xpath="//a[@class='account']")
    WebElement viewMyCustomerAccountButtonInHomePage;

    @FindBy(xpath="//div[@class='sf-with-ul']")
    private WebElement womenHoverInHomePage;

    @FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a")
    private WebElement blousesSubCategoryInHomePage;

    public WebElement getSignInButton() {
        return signInButtonInHomePage;
    }

    public Login clickOnSignInButton() {
        signInButtonInHomePage.click();
        return new Login();
    }

    public MyAccount viewMyAccountPage() {
        viewMyCustomerAccountButtonInHomePage.click();
        return new MyAccount();
    }

    public Blouses clickOnBlousesSubCategory()
    {
        actions.moveToElement(womenHoverInHomePage).perform();
        blousesSubCategoryInHomePage.click();
        return new Blouses();
    }


}
