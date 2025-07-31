package base.tests;

import org.openqa.selenium.By;
import utils.Browser;

public class BasePage {

    protected static String getText(By locator) {



    }

    protected static void type(By locator, String whatToType) {
        Browser.driver.findElement(locator).sendKeys(whatToType);

    }

    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }

    protected static boolean isSelected(By locator) {
        return Browser.driver.findElement(locator).isSelected();
    }


}
