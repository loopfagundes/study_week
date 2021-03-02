package br.com.dbserver.testcases;

import br.com.dbserver.tasks.ChooseProductTask;
import br.com.dbserver.tasks.IndexTask;
import br.com.dbserver.tasks.RegisterNewUserTask;
import br.com.dbserver.utils.BaseTest;
import org.testng.annotations.Test;

public class BuySuccessfullyTestCase extends BaseTest {

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php");
        IndexTask index = new IndexTask(driver);
        ChooseProductTask chooseProductTask = new ChooseProductTask(driver);
        RegisterNewUserTask registerNewUserTask = new RegisterNewUserTask(driver);
        index.singIn();
        registerNewUserTask.createAnAccount();
        //chooseProductTask.detailsProducts("dress","Faded Short Sleeve T-shirts");
    }
}