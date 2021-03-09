package br.com.dbserver.testcases;

import br.com.dbserver.steps.BuyProductStep;
import br.com.dbserver.utils.BaseTest;
import br.com.dbserver.utils.Property;
import br.com.dbserver.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BuySuccessfullyTestCase extends BaseTest {

    @Test
    public void test() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
        BuyProductStep buyProductStep = new BuyProductStep(driver);
        buyProductStep
                .indexAccessLogin()
                .createAnAccount()
                .registerNewUser()
                .chooseProductBlouse("Dress")
                .chooseProductPrintedChiffonDress("Printed Chiffon Dress")
                .orderToCart()
                .paymentMethod();
    }
}