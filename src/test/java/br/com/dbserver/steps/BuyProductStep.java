package br.com.dbserver.steps;

import br.com.dbserver.pageobjects.BuyProductPageObject;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static br.com.dbserver.utils.Screenshot.*;

public class BuyProductStep {
    private final WebDriver driver;
    private final Faker faker;
    private final BuyProductPageObject buyProductPageObject;

    public BuyProductStep(WebDriver _driver) {
        driver = _driver;
        faker = new Faker();
        buyProductPageObject = new BuyProductPageObject(driver);
    }

    public BuyProductStep indexAccessLogin() {
        buyProductPageObject.indexMenuSignInButton().click();
        return this;
    }

    public BuyProductStep createAnAccount() {
        Assert.assertEquals(buyProductPageObject.validatePageAuthLabel().getText(), "AUTHENTICATION");
        buyProductPageObject.emailAddreesTextField().sendKeys(faker.internet().emailAddress());
        buyProductPageObject.createAnAccountButton().click();
        return this;
    }

    public BuyProductStep registerNewUser() {
        buyProductPageObject.genderUserCheckBox().click();
        buyProductPageObject.firstNameTextField().sendKeys(faker.name().firstName());
        buyProductPageObject.lastNameTextField().sendKeys(faker.name().lastName());
        buyProductPageObject.passwordTextField().sendKeys(faker.internet().password());
        buyProductPageObject.dayBirthComboBox().selectByValue("20");
        buyProductPageObject.monthsBirthComboBox().selectByValue("10");
        buyProductPageObject.yearsBirthComboBox().selectByValue("1990");
        buyProductPageObject.signUpForOurNewSletterCheckBox().click();
        buyProductPageObject.specialOffersCheckBox().click();
        buyProductPageObject.addressTextField().sendKeys(faker.address().fullAddress());
        buyProductPageObject.cityTextField().sendKeys(faker.address().city());
        buyProductPageObject.stateComboBox().selectByValue("30");
        buyProductPageObject.zipPostalCodeTextField().sendKeys(faker.number().digits(5));
        buyProductPageObject.countryComboBox().selectByValue("21");
        buyProductPageObject.numberHomePhoneTextField().sendKeys(faker.phoneNumber().cellPhone());
        if (buyProductPageObject.registerButton().isDisplayed()) {
            buyProductPageObject.registerButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "Registrado com sucesso.");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "Nao foi possivel registrar.", capture());
        }
        Assert.assertEquals(buyProductPageObject.validatePageMyAccountLabel().getText(), "MY ACCOUNT");
        return this;
    }
    public BuyProductStep chooseProductBlouse(String searchProduct) {
        buyProductPageObject.searchProductTextField().sendKeys(searchProduct);
        buyProductPageObject.searchProductTextField().sendKeys(Keys.ENTER);
        buyProductPageObject.chooseProductButton().click();
        Assert.assertEquals(buyProductPageObject.validateNameProductLabel().getText(), "Blouse");
        driver.switchTo().defaultContent();
        buyProductPageObject.colorProductButton().click();
        driver.switchTo().defaultContent();
        buyProductPageObject.sizeProductComboBox().selectByValue("2");
        driver.switchTo().defaultContent();
        return this;
    }
}