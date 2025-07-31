package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

import java.util.List;

public class CartPage {

    public static void verifyUserIsOnTheCartPage(String expectedHeader, String messageOnFailure) {
        WebElement pageTitle = Browser.driver.findElement(By.className("title"));
        String actualHeader = pageTitle.getText();
        Assert.assertEquals(actualHeader, expectedHeader, messageOnFailure);


    }

    public static void verifyProductsAreAdded() {
        List<WebElement> addedProducts = Browser.driver.findElements(By.xpath("//div[@class = \"cart_item\"]"));
        for (WebElement product : addedProducts){
            System.out.println(product.getText());
            System.out.println(product.isDisplayed());
        }

    }

    public static void removeTheBackPack() {
        WebElement removeBackBackButton = Browser.driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeBackBackButton.click();
    }

    public static void removeTheTshirt() {
        WebElement removeTShirtButton = Browser.driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        removeTShirtButton.click();

    }


    public static void checkOut() {
        WebElement checkoutButton = Browser.driver.findElement(By.id("checkout"));
        checkoutButton.click();
        checkoutButton.isSelected();
    }
}

