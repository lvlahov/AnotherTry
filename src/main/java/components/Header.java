package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

public class Header {

    /**
     * Verifies that the customer has been successfully logged in.
     * @param expectedProductsText
     * @param messageOnFailure
     */
    public static void verifyProductsText(String expectedProductsText, String messageOnFailure) {
        WebElement productText = Browser.driver.findElement(By.className("title"));
        String actualProductText = productText.getText();
        Assert.assertEquals(actualProductText,expectedProductsText,messageOnFailure);
    }
}
