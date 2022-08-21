package automation_practice_website_taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage{

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
    WebElement zipCodeFiledInCreateAccountPage;

    @FindBy(id="phone_mobile")
    WebElement mobilePhoneInCreateAccountPage;

    @FindBy(id="alias")
    WebElement aliasFieldInCreateAccountPage;

    @FindBy(id="submitAccount")
    WebElement registerButtonInCreateAccountPage;

    public MyAccount CreateAccount(String firstName,String lastName, String password, String address, String city,
                              String state, String zip,String mobile, String aliasAddress)
    {
        firstNameFieldInCreateAccountPage.sendKeys(firstName);
        lastNameFieldInCreateAccountPage.sendKeys(lastName);
        passwordFieldInCreateAccountPage.sendKeys(password);
        addressFieldInCreateAccountPage.sendKeys(address);
        cityFieldInCreateAccountPage.sendKeys(city);
        Select select = new Select(stateDropDownListInCreateAccountPage);
        select.selectByVisibleText(state);
        zipCodeFiledInCreateAccountPage.sendKeys(zip);
        mobilePhoneInCreateAccountPage.sendKeys(mobile);
        aliasFieldInCreateAccountPage.sendKeys(aliasAddress);
        registerButtonInCreateAccountPage.click();
        return new MyAccount();
    }

}
