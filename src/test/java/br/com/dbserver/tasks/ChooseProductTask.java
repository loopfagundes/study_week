package br.com.dbserver.tasks;

import br.com.dbserver.appobjects.ChooseProductsAppObject;
import br.com.dbserver.utils.WaitElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ChooseProductTask {
    private final WebDriver driver;
    private final ChooseProductsAppObject chooseProductsAppObject;

    public ChooseProductTask(WebDriver _driver) {
        driver = _driver;
        chooseProductsAppObject = new ChooseProductsAppObject(_driver);
    }

    public void detailsProducts(String search) {
        productBlouse();
        productTwo(search);
    }

    private void productBlouse() {
        WaitElement.toBeClickable(driver, chooseProductsAppObject.getProductBlouseButton()).click();
        frameBlouse();
        WaitElement.toBeClickable(driver, chooseProductsAppObject.getProceedToCheckoutButton()).click();
    }

    private void frameBlouse() {
        WebDriver iframeDriver = driver.switchTo().frame(chooseProductsAppObject.iframeProductBlouse());
        iframeDriver.findElement(chooseProductsAppObject.getAddToCartButton()).click();
        iframeDriver.switchTo().defaultContent();
    }

    private void productTwo(String search) {
        WaitElement.toBeClickable(driver, chooseProductsAppObject.getSearchFadedShortSleeveTShirtsButton()).sendKeys(search);
        WaitElement.toBeClickable(driver, chooseProductsAppObject.getSearchFadedShortSleeveTShirtsButton()).sendKeys(Keys.ENTER);
    }
}