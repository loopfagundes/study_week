package br.com.dbserver.tasks;

import br.com.dbserver.appobjects.IndexAppObject;
import br.com.dbserver.utils.WaitElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexTask {
    private final WebDriver driver;
    private final IndexAppObject index;

    public IndexTask(WebDriver _driver) {
        driver = _driver;
        index = new IndexAppObject(_driver);
    }

    public void singIn(String email, String password, String search) {
        acessMyAccount(email, password);
        searchProduct(search);
    }

    private void acessMyAccount(String email, String password) {
        WaitElement.toBeClickable(driver, index.getSignInButton()).click();
        WaitElement.toBeClickable(driver, index.getEmailTextField()).sendKeys(email);
        WaitElement.toBeClickable(driver, index.getPasswordTextField()).sendKeys(password);
        WaitElement.toBeClickable(driver, index.getSignInAuthButton()).click();
    }

    private void searchProduct(String search) {
        WaitElement.toBeClickable(driver, index.getSearchProductTextField()).sendKeys(search);
        WaitElement.toBeClickable(driver, index.getSearchProductTextField()).sendKeys(Keys.ENTER);
    }
}