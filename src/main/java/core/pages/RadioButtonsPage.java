package core.pages;

import base.tests.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class RadioButtonsPage extends BasePage {

    private static final By GREEN_RADIO_BUTTON = By.xpath(("//span[text() = \"Green\"]"));
    public static void goTo() {
        Browser.driver.get("https://materializecss.com/radio-buttons.html");
    }

    public static void selectGreen() {
        if(!isSelected(GREEN_RADIO_BUTTON))
            click(GREEN_RADIO_BUTTON);
        }



    public static void verifyGreenIsSelected(String expectedRadioButtonText, String messageOnFailure) {
        String actualRadioButtonText = getText(GREEN_RADIO_BUTTON);
        Assert.assertEquals(actualRadioButtonText, expectedRadioButtonText,messageOnFailure);
    }
}
