package br.com.dbserver.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexAppObject {
    private final WebDriver driver;

    public IndexAppObject(WebDriver _driver) {
        driver = _driver;
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
    }

    public WebElement getCreateEmailTextField() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement getCreateAnAccountButton() {
        return driver.findElement(By.id("SubmitCreate"));
    }
}