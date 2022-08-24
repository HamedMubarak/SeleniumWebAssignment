package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import automation_practice_website_taf.browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication extends BasePage {

    @FindBy(id="email_create")
    WebElement emailAddressFieldInCreateAnAccountCardInAuthenticationPage;

    @FindBy(id="SubmitCreate")
    WebElement createAccountButtonInAuthenticationPage;

    @FindBy(xpath ="//*[@id=\"create_account_error\"]/ol/li")
    public WebElement authenticationErrorMsgInCreateAnAccountCardInAuthenticationPage ;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol")
    public WebElement invalidPasswordErrorMsgInAlreadyRegisteredCardInAuthenticationPage;

    @FindBy(id="email")
    WebElement emailAddressFieldInAlreadyRegisteredCardInAuthenticationPage;

    @FindBy(id="passwd")
    WebElement passwordFieldInAlreadyRegisteredCardInAuthenticationPage;

    @FindBy(id="SubmitLogin")
    WebElement signInButtonInAlreadyRegisteredCardInAuthenticationPage;


    public WebElement getAuthenticationErrorMsgInCreateAnAccountCardInAuthenticationPage() {
        Browser.waitUntilVisibilityOfElement(authenticationErrorMsgInCreateAnAccountCardInAuthenticationPage);
        return authenticationErrorMsgInCreateAnAccountCardInAuthenticationPage;
    }

    public WebElement getInvalidPasswordErrorMsgInAlreadyRegisteredCardInAuthenticationPage() {
        Browser.waitUntilVisibilityOfElement(invalidPasswordErrorMsgInAlreadyRegisteredCardInAuthenticationPage);
        return invalidPasswordErrorMsgInAlreadyRegisteredCardInAuthenticationPage;
    }

    public void enterEmailAddressInCreateAnAccountCardInAuthenticationPage(String email) {
        emailAddressFieldInCreateAnAccountCardInAuthenticationPage.clear();
        emailAddressFieldInCreateAnAccountCardInAuthenticationPage.sendKeys(email);
    }

    public void enterEmailAddressInAlreadyRegisteredCardInAuthenticationPage(String email) {
        emailAddressFieldInAlreadyRegisteredCardInAuthenticationPage.clear();
        emailAddressFieldInAlreadyRegisteredCardInAuthenticationPage.sendKeys(email);
    }

    public void enterPasswordInAlreadyRegisteredCardInAuthenticationPage(String password) {
        passwordFieldInAlreadyRegisteredCardInAuthenticationPage.clear();
        passwordFieldInAlreadyRegisteredCardInAuthenticationPage.sendKeys(password);
    }

    public CreateAccount clickOnCreateAccountButtonInAuthenticationPage() {
        createAccountButtonInAuthenticationPage.click();
        return new CreateAccount();
    }

    public MyAccount clickOnSignInButtonInAlreadyRegisteredCardInAuthenticationPage() {
        signInButtonInAlreadyRegisteredCardInAuthenticationPage.click();
        return new MyAccount();
    }

}
