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

    public WebElement getEmailTextField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement getSignInAuthButton() {
        return driver.findElement(By.id("SubmitLogin"));
    }
}