package automation_practice_website_taf.pages;

import automation_practice_website_taf.base_page.BasePage;
import automation_practice_website_taf.browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage {

    @FindBy(id="customer_firstname")
    WebElement firstNameFieldInCreateAccountPage;

    @FindBy(id="customer_lastname")
    WebElement lastNameFieldInCreateAccountPage;

    @FindBy(id="passwd")
    WebElement passwordFieldInCreateAccountPage;

    @FindBy(id="address1")
    WebElement addressFieldInCreateAccountPage;

    @FindBy(id="city")
    WebElement cityFieldInCreateAccountPage;

    @FindBy(id="id_state")
    WebElement stateDropDownListInCreateAccountPage;

    @FindBy(id="postcode")
    WebElement zipCodeFieldInCreateAccountPage;

    @FindBy(id="phone_mobile")
    WebElement mobilePhoneFieldInCreateAccountPage;

    @FindBy(id="alias")
    WebElement aliasFieldInCreateAccountPage;

    @FindBy(id="submitAccount")
    WebElement registerButtonInCreateAccountPage;

    public WebElement getFirstNameFieldInCreateAccountPage() {
        Browser.waitUntilVisibilityOfElement(firstNameFieldInCreateAccountPage);
        return firstNameFieldInCreateAccountPage;
    }

    public void enterFirstNameInCreateAccountPage(String firstName) {
        firstNameFieldInCreateAccountPage.clear();
        firstNameFieldInCreateAccountPage.sendKeys(firstName);
    }

    public void enterLastNameInCreateAccountPage(String lastName) {
        lastNameFieldInCreateAccountPage.clear();
        lastNameFieldInCreateAccountPage.sendKeys(lastName);
    }

    public void enterPasswordInCreateAccountPage(String password) {
        passwordFieldInCreateAccountPage.clear();
        passwordFieldInCreateAccountPage.sendKeys(password);
    }

    public void enterAddressInCreateAccountPage(String address) {
        addressFieldInCreateAccountPage.clear();
        addressFieldInCreateAccountPage.sendKeys(address);
    }

    public void enterCityInCreateAccountPage(String city) {
        cityFieldInCreateAccountPage.clear();
        cityFieldInCreateAccountPage.sendKeys(city);
    }

    public void selectStateInCreateAccountPage(String state) {
        Select select = new Select(stateDropDownListInCreateAccountPage);
        select.selectByVisibleText(state);
    }

    public void enterZipCodeInCreateAccountPage(String zip) {
        zipCodeFieldInCreateAccountPage.clear();
        zipCodeFieldInCreateAccountPage.sendKeys(zip);
    }

    public void enterMobilePhoneInCreateAccountPage(String mobilePhone) {
        mobilePhoneFieldInCreateAccountPage.clear();
        mobilePhoneFieldInCreateAccountPage.sendKeys(mobilePhone);
    }

    public void enterAliasAddressInCreateAccountPage(String alias) {
        aliasFieldInCreateAccountPage.clear();
        aliasFieldInCreateAccountPage.sendKeys(alias);
    }

    public MyAccount clickOnRegisterButtonInCreateAccountPage() {
        registerButtonInCreateAccountPage.click();
        return new MyAccount();
    }

}
