package core.pages;

import base.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

import java.util.List;

public class ChekoutOverViewPage extends BasePage {

    public static void verifyUserIsOnOverviewPage(String expectedHeader, String messageOnFailure) {
        WebElement pageTitle = Browser.driver.findElement(By.xpath("//span[text()  = 'Checkout: Overview']"));
        String actualHeader = pageTitle.getText();
        Assert.assertEquals(actualHeader, expectedHeader, messageOnFailure);
    }

    public static void verifyAllProductsAreDisplayed() {
        List<WebElement> allProducts = Browser.driver.findElements(By.className("inventory_item_name"));
        for (WebElement addedProduct:allProducts){
            System.out.println(addedProduct.isDisplayed());
        }


    }
}

