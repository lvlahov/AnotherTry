package core.pages;

import base.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    private final static By SECOND_ITEM = By.id("demo_basic-dropdown-selected");


    public static void goTo() {
        Browser.driver.get("https://formstone.it/components/dropdown/demo/");


    }

    public static void selectSecondItem() {
        WebElement ddown = Browser.driver.findElement(By.id("demo_basic"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Two");
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    public static void verifyCorrectItemIsSelected(String expectedMessage, String messageOnFailure) {
        String actualMessage = getText(SECOND_ITEM);
        Assert.assertEquals(actualMessage,expectedMessage,messageOnFailure);
    }
}
