package br.com.dbserver.tasks;

import br.com.dbserver.appobjects.RegisterNewUserAppObject;
import br.com.dbserver.utils.WaitElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class RegisterNewUserTask {
    private final WebDriver driver;
    private final RegisterNewUserAppObject registerNewUserAppObject;
    private final Faker faker;

    public RegisterNewUserTask(WebDriver _driver) {
        driver = _driver;
        registerNewUserAppObject = new RegisterNewUserAppObject(_driver);
        faker = new Faker();
    }

    public void createAnAccount() {
        registerNewUser();
    }

    private void registerNewUser() {
        WaitElement.visibilityOf(driver, registerNewUserAppObject.getGenderCheckBox()).click();
        WaitElement.visibilityOf(driver, registerNewUserAppObject.getFirstNameTextField()).sendKeys(faker.name().firstName());
    }
}