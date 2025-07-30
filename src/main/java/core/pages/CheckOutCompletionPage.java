package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

public class CheckOutCompletionPage {
    public static void verifyOrderIsSuccessfullySubmitted(String expectedMessage, String messageOnFailure) {
        WebElement successMessage = Browser.driver.findElement(By.xpath("//div[text() = 'Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));
        String actualMessage = successMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, messageOnFailure);
    }
}
