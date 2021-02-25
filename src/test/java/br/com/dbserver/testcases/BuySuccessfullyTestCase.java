package br.com.dbserver.testcases;

import br.com.dbserver.utils.BaseTest;
import org.testng.annotations.Test;

public class BuySuccessfullyTestCase extends BaseTest {

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php");
    }
}