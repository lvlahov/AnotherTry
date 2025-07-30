package core.tests;

import base.tests.BaseTest;
import core.pages.ProductPage;
import org.testng.annotations.Test;

public class ProductPageTests extends BaseTest {

    @Test
    public void validateProductNamesOnThePage(){
        LoginTest login = new LoginTest();
        login.standartLogin();
        ProductPage.getProductNames();

    }
}
