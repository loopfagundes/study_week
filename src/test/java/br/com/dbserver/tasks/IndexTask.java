package br.com.dbserver.tasks;

import br.com.dbserver.appobjects.IndexAppObject;
import br.com.dbserver.utils.WaitElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class IndexTask {
    private final WebDriver driver;
    private final IndexAppObject index;
    private final Faker faker;

    public IndexTask(WebDriver _driver) {
        driver = _driver;
        index = new IndexAppObject(_driver);
        faker = new Faker();
    }

    public void singIn() {
        acessMyAccount();
    }

    private void acessMyAccount() {
        WaitElement.toBeClickable(driver, index.getSignInButton()).click();
        WaitElement.toBeClickable(driver, index.getCreateEmailTextField()).sendKeys(faker.internet().emailAddress());
        WaitElement.toBeClickable(driver, index.getCreateAnAccountButton()).click();
    }
}