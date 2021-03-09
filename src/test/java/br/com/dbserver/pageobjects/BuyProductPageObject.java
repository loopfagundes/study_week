package br.com.dbserver.pageobjects;

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

    public WebElement chooseProductButton() {
        return waitElement.toBeClickable(By.cssSelector("div[class='product-container'] div[class='product-image-container'] a[title='Blouse']"));
    }

    public WebElement validateNameProductLabel() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.cssSelector("#product > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1"));
    }

    public WebElement colorProductButton() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.id("color_8"));
    }

    public Select sizeProductComboBox() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return new Select(iframeDriver.findElement(By.id("group_1")));
    }

    public WebElement iframeAddToCartButton() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.cssSelector("button[name='Submit']"));
    }

    public WebElement modalProceedToCheckoutButton() {
        return waitElement.toBeClickable(By.cssSelector("a[title='Proceed to checkout']"));
    }

    public WebElement continueShoppingButton() {
        return waitElement.toBeClickable(By.cssSelector("a[title='Continue shopping']"));
    }

    public WebElement searchMoreProductTextField() {
        return waitElement.toBeClickable(By.id("search_query_top"));
    }

    public WebElement chooseMoreProductButton() {
        return waitElement.toBeClickable(By.cssSelector("div[class='product-container'] img[title='Printed Chiffon Dress']"));
    }

    public WebElement validateProductLabel() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.cssSelector("#product > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1"));
    }

    public Select sizeProductDressComboBox() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return new Select(iframeDriver.findElement(By.id("group_1")));
    }

    public WebElement addToCartButton() {
        WebElement iframeElement = waitElement.visibilityOf(By.className("fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.cssSelector("#add_to_cart > button > span"));
    }

    public WebElement proceedToCheckoutButton() {
        return waitElement.toBeClickable(By.cssSelector("a[title='Proceed to checkout']"));
    }

    public WebElement validateStageShoppingSummaryLabel() {
        return waitElement.visibilityOf(By.id("cart_title"));
    }

    public WebElement validatePriceTotalSummaryLabel() {
        return waitElement.visibilityOf(By.id("total_price"));
    }

    public WebElement stageSummaryProceedToCheckoutButton() {
        return waitElement.toBeClickable(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default > span"));
    }

    public WebElement validateAddressStepLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }

    public WebElement stageAddressProceedToCheckout() {
        return waitElement.toBeClickable(By.cssSelector("#center_column > form > p > button > span"));
    }

    public WebElement validateShippingStepLabel() {
        return waitElement.visibilityOf(By.cssSelector("#carrier_area > h1"));
    }

    public WebElement termsOfServiceCheckBox() {
        return driver.findElement(By.id("cgv"));
    }

    public WebElement shippingProceedToCheckoutButton() {
        return waitElement.toBeClickable(By.cssSelector("#form > p > button > span"));
    }

    public WebElement validatePaymentMethodStepLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }

    public WebElement validateTotalPaymentPriceLabel() {
        return waitElement.visibilityOf(By.id("total_price"));
    }

    public WebElement choosePaymentMethodButton() {
        return waitElement.toBeClickable(By.className("bankwire"));
    }

    public WebElement iConfirmMyOrderButton() {
        return waitElement.toBeClickable(By.cssSelector("#cart_navigation > button > span"));
    }

    public WebElement validateOrderConfirmationStepLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }

    public WebElement validateYourOrderIsCompleteLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > div > p > strong"));
    }

    public WebElement signOutButton() {
        return waitElement.toBeClickable(By.cssSelector("a[title='Log me out']"));
    }

    public WebElement validateLoginPageLabel() {
        return waitElement.visibilityOf(By.cssSelector("#center_column > h1"));
    }
}