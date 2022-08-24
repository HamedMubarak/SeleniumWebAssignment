package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {


    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signInButtonInHomePage;

    @FindBy(xpath="//a[@class='account']")
    WebElement viewMyCustomerAccountButtonInHomePage;

    public WebElement getSignInButton() {
        return signInButtonInHomePage;
    }

    public Authentication clickOnSignInButton() {
        signInButtonInHomePage.click();
        return new Authentication();
    }

    public MyAccount viewMyAccountPage() {
        viewMyCustomerAccountButtonInHomePage.click();
        return new MyAccount();
    }



}
