package core.tests;

import base.tests.BaseTest;
import core.pages.LoginPage;
import core.pages.ProductPage;
import org.testng.annotations.Test;

public class ProductCountTest extends BaseTest {

    @Test
    public void getProductCount(){
        LoginTest login = new LoginTest();
        login.standartLogin();
        ProductPage.getProductCount(6, "wrong amount");
    }
}
