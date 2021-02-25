package br.com.dbserver.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {
    public static WebElement visibilityOf(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement toBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}