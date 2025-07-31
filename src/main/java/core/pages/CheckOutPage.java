package core.pages;

import base.tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

public class CheckOutPage extends BasePage {

    private final static By FIRST_NAME_FIELD = By.id("first-name");
    private final static By LAST_NAME_FIELD = By.id("last-name");
    private final static By ZIP_FIELD = By.id("postal-code");
    private final static By SUBMIT_BUTTON = By.id("continue");

    private final static By PAGE_TITLE = By.xpath("//span[text() = 'Checkout: Your Information']");

    public static void verifyUserIsOnCheckOutPage(String expectedHeader, String messageOnFailure) {
        String actualHeader = getText(PAGE_TITLE);
        Assert.assertEquals(actualHeader, expectedHeader, messageOnFailure);

    }

    public static void insertYourDetailsAndSubmit(String firstName, String lasttName, String ZIP) {
        type(FIRST_NAME_FIELD, firstName);
        type(LAST_NAME_FIELD, lasttName);
        type(ZIP_FIELD, ZIP);
        click(SUBMIT_BUTTON);



    }

    public static void finishTheOrder() {
        WebElement finishButton = Browser.driver.findElement(By.id("finish"));
        finishButton.click();
    }
}
