package br.com.dbserver.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseProductsAppObject {
    private final WebDriver driver;

    public ChooseProductsAppObject(WebDriver _driver) {
        driver = _driver;
    }
    public WebElement getSearchProductTextField() {
        return driver.findElement(By.id("search_query_top"));
    }

    public WebElement getProductBlouseButton() {
        return driver.findElement(By.cssSelector("div[class='product-container'] div[class='product-image-container'] a[title='Blouse']"));
    }

    public WebElement iframeProductBlouse() { //Elemento tela de iframe
        WebElement iframeElement = driver.findElement(By.className("fancybox-iframe"));
        return iframeElement;
    }

    public By getAddToCartButton() { //junto iframe
        return By.cssSelector("#add_to_cart > button > span");
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector("div[class='button-container'] a[title='Proceed to checkout']"));
    }

    public WebElement getSearchFadedShortSleeveTShirtsButton() {
        return driver.findElement(By.id("search_query_top"));
    }

    public WebElement getChooseProductFadedButton() {
        return driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
    }
}