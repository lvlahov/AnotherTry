package components;

import base.tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

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
