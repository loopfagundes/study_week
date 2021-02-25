package br.com.dbserver.testcases;

import br.com.dbserver.tasks.ChooseProductTask;
import br.com.dbserver.tasks.IndexTask;
import br.com.dbserver.utils.BaseTest;
import org.testng.annotations.Test;

public class BuySuccessfullyTestCase extends BaseTest {

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php");
        IndexTask index = new IndexTask(driver);
        ChooseProductTask chooseProductTask = new ChooseProductTask(driver);
        index.singIn("datumqatest@soprock.com", "datum2021", "dress");
        chooseProductTask.detailsProducts("Faded Short Sleeve T-shirts");
    }
}