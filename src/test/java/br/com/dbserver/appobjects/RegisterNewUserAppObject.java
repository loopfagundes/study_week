package br.com.dbserver.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterNewUserAppObject {
    private final WebDriver driver;

    public RegisterNewUserAppObject(WebDriver _driver) {
        driver = _driver;
    }

    public WebElement getFirstNameTextField() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getGenderCheckBox() {
        return driver.findElement(By.id("id_gender1"));
    }
}