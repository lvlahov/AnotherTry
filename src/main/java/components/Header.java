package components;

import base.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Header extends BasePage {

    private final static By PRODUCT_TEXT = By.className("title");

    /**
     * Verifies that the customer has been successfully logged in.
     * @param expectedProductsText
     * @param messageOnFailure
     */
    public static void verifyProductsText(String expectedProductsText, String messageOnFailure) {
        String actualProductText = getText(PRODUCT_TEXT);
        Assert.assertEquals(actualProductText,expectedProductsText,messageOnFailure);
    }
}
