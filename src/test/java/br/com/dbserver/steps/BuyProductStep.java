package br.com.dbserver.steps;

import br.com.dbserver.pageobjects.BuyProductPageObject;
import br.com.dbserver.utils.Screenshot;
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
        buyProductPageObject.iframeAddToCartButton().click();
        driver.switchTo().defaultContent();
        if (buyProductPageObject.modalProceedToCheckoutButton().isDisplayed()) {
            buyProductPageObject.modalProceedToCheckoutButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "Adicionado uma bulsa no carrinho.");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "Nao foi possivel adicionar uma bulsa no carrinho.", Screenshot.capture());
        }
        buyProductPageObject.continueShoppingButton().click();
        return this;
    }

    public BuyProductStep chooseProductPrintedChiffonDress(String searchProduct) {
        buyProductPageObject.searchMoreProductTextField().clear();
        buyProductPageObject.searchMoreProductTextField().sendKeys(searchProduct);
        buyProductPageObject.searchMoreProductTextField().sendKeys(Keys.ENTER);
        buyProductPageObject.chooseMoreProductButton().click();
        Assert.assertEquals(buyProductPageObject.validateProductLabel().getText(), "Printed Chiffon Dress");
        driver.switchTo().defaultContent();
        buyProductPageObject.sizeProductDressComboBox().selectByValue("2");
        driver.switchTo().defaultContent();
        buyProductPageObject.addToCartButton().click();
        driver.switchTo().defaultContent();

        if (buyProductPageObject.proceedToCheckoutButton().isDisplayed()) {
            buyProductPageObject.proceedToCheckoutButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "Adicionado um vestido no carrinho.");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "Nao foi possivel adicionar um vestido no carrinho.", Screenshot.capture());
        }
        return this;
    }

    public BuyProductStep orderToCart() {
        Assert.assertEquals(buyProductPageObject.validateStageShoppingSummaryLabel().getText(), "SHOPPING-CART SUMMARY\n" +
                "Your shopping cart contains: 2 Products");
        Assert.assertEquals(buyProductPageObject.validatePriceTotalSummaryLabel().getText(), "$45.40");
        buyProductPageObject.stageSummaryProceedToCheckoutButton().click();
        Assert.assertEquals(buyProductPageObject.validateAddressStepLabel().getText(), "ADDRESSES");
        buyProductPageObject.stageAddressProceedToCheckout().click();
        Assert.assertEquals(buyProductPageObject.validateShippingStepLabel().getText(), "SHIPPING");
        buyProductPageObject.termsOfServiceCheckBox().click();
        buyProductPageObject.shippingProceedToCheckoutButton().click();
        return this;
    }

    public BuyProductStep paymentMethod() {
        Assert.assertEquals(buyProductPageObject.validatePaymentMethodStepLabel().getText(), "PLEASE CHOOSE YOUR PAYMENT METHOD");
        Assert.assertEquals(buyProductPageObject.validateTotalPaymentPriceLabel().getText(), "$45.40");
        buyProductPageObject.choosePaymentMethodButton().click();
        if(buyProductPageObject.iConfirmMyOrderButton().isDisplayed()) {
            buyProductPageObject.iConfirmMyOrderButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "O pedido foi concluido!");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "O pedido nao foi concluido.", Screenshot.capture());
        }
        Assert.assertEquals(buyProductPageObject.validateOrderConfirmationStepLabel().getText(), "ORDER CONFIRMATION");
        Assert.assertEquals(buyProductPageObject.validateYourOrderIsCompleteLabel().getText(), "Your order on My Store is complete.");
        buyProductPageObject.signOutButton().click();
        Assert.assertEquals(buyProductPageObject.validateLoginPageLabel().getText(), "AUTHENTICATION");
        return this;
    }
}