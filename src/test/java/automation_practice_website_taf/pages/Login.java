package automation_practice_website_taf.pages;

import automation_practice_website_taf.driver.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends BasePage{


    @FindBy(id="email_create")
    WebElement emailAddressFieldInCreateAnAccountCardInLoginPage;

    @FindBy(id="SubmitCreate")
    WebElement createAccountButtonInCreateAnAccountCardInLoginPage;

    @FindBy(id ="create_account_error")
    public WebElement authenticationErrorMsgInCreateAnAccountCardInLoginPage ;

    @FindBy(id="email")
    WebElement emailAddressFieldInAlreadyRegisteredCardInLoginPage;

    @FindBy(id="passwd")
    WebElement passwordFieldInAlreadyRegisteredCardInLoginPage;

    @FindBy(id="SubmitLogin")
    WebElement signInButtonInAlreadyRegisteredCardInLoginPage;

        public WebElement getEmailAddressFieldInCreateAnAccountCardInLoginPage() {
        return emailAddressFieldInCreateAnAccountCardInLoginPage;
    }

    public WebElement getCreateAccountButtonInCreateAnAccountCardInLoginPage() {
        return createAccountButtonInCreateAnAccountCardInLoginPage;
    }

    public WebElement getEmailAddressFieldInAlreadyRegisteredCardInLoginPage() {
        return emailAddressFieldInAlreadyRegisteredCardInLoginPage;
    }

    public WebElement getPasswordFieldInAlreadyRegisteredCardInLoginPage() {
        return passwordFieldInAlreadyRegisteredCardInLoginPage;
    }

    public  WebElement getSignInButtonInAlreadyRegisteredCardInLoginPage() {
        return signInButtonInAlreadyRegisteredCardInLoginPage;
    }

    public CreateAccount openCreateAccountPage(String email) {
        emailAddressFieldInCreateAnAccountCardInLoginPage.clear();
        emailAddressFieldInCreateAnAccountCardInLoginPage.sendKeys(email);
        createAccountButtonInCreateAnAccountCardInLoginPage.click();
        return new CreateAccount();
    }

    public MyAccount openMyAccountPage(String email, String password) {
        emailAddressFieldInAlreadyRegisteredCardInLoginPage.clear();
        emailAddressFieldInAlreadyRegisteredCardInLoginPage.sendKeys(email);
        passwordFieldInAlreadyRegisteredCardInLoginPage.click();
        passwordFieldInAlreadyRegisteredCardInLoginPage.sendKeys(password);
        signInButtonInAlreadyRegisteredCardInLoginPage.click();
        return new MyAccount();
    }

    public void AuthenticateNewUser(String email)
    {
        emailAddressFieldInCreateAnAccountCardInLoginPage.clear();
        emailAddressFieldInCreateAnAccountCardInLoginPage.sendKeys(email);
        createAccountButtonInCreateAnAccountCardInLoginPage.click();
        BasePage.waitUntilVisibilityOfElement(authenticationErrorMsgInCreateAnAccountCardInLoginPage);

    }

}
