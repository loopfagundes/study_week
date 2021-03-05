package br.com.dbserver.appobjects;

import br.com.dbserver.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuyProductPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public BuyProductPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement indexMenuSignInButton() {
        return waitElement.toBeClickable(By.cssSelector("a[title='Log in to your customer account']"));
    }

    public WebElement validatePageAuthLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }

    public WebElement emailAddreesTextField() {
        return waitElement.toBeClickable(By.id("email_create"));
    }

    public WebElement createAnAccountButton() {
        return waitElement.toBeClickable(By.id("SubmitCreate"));
    }

    public WebElement genderUserCheckBox() {
        return waitElement.toBeClickable(By.id("id_gender1"));
    }

    public WebElement firstNameTextField() {
        return waitElement.toBeClickable(By.id("customer_firstname"));
    }

    public WebElement lastNameTextField() {
        return waitElement.toBeClickable(By.id("customer_lastname"));
    }

    public WebElement passwordTextField() {
        return waitElement.toBeClickable(By.id("passwd"));
    }

    public Select dayBirthComboBox() {
        return new Select(driver.findElement(By.id("days")));
    }

    public Select monthsBirthComboBox() {
        return new Select(driver.findElement(By.id("months")));
    }

    public Select yearsBirthComboBox() {
        return new Select(driver.findElement(By.id("years")));
    }

    public WebElement signUpForOurNewSletterCheckBox() {
        return driver.findElement(By.id("newsletter"));
    }

    public WebElement specialOffersCheckBox() {
        return driver.findElement(By.id("optin"));
    }

    public WebElement addressTextField() {
        return waitElement.toBeClickable(By.id("address1"));
    }

    public WebElement cityTextField() {
        return waitElement.toBeClickable(By.id("city"));
    }

    public Select stateComboBox() {
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement zipPostalCodeTextField() {
        return waitElement.toBeClickable(By.id("postcode"));
    }

    public Select countryComboBox() {
        return new Select(driver.findElement(By.id("id_country")));
    }

    public WebElement numberHomePhoneTextField() {
        return waitElement.toBeClickable(By.id("phone"));
    }

    public WebElement registerButton() {
        return waitElement.toBeClickable(By.id("submitAccount"));
    }

    public WebElement validatePageMyAccountLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }

    public WebElement searchProductTextField() {
        return waitElement.toBeClickable(By.id("search_query_top"));
    }
}