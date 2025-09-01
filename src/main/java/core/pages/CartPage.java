package core.pages;

import base.tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

import java.util.List;

public class CartPage extends BasePage {

    private final static By CART_PAGE_TITLE = By.xpath("//span[@data-test = 'title']");

    private final static By REMOVE_BACKPACK_BUTTON = By.id("remove-sauce-labs-backpack");

    private final static By REMOVE_TSHIRT_BUTTON = By.id("remove-sauce-labs-bolt-t-shirt");

    private final static By CHECKOUT_BUTTON = By.id("checkout)");


    public static void verifyUserIsOnTheCartPage(String expectedHeader, String messageOnFailure) {
        WebElement pageTitle = Browser.driver.findElement(By.className("title"));
        String actualHeader = getText(CART_PAGE_TITLE);
        Assert.assertEquals(actualHeader, expectedHeader, messageOnFailure);


    }

    public static void verifyProductsAreAdded() {
        List<WebElement> addedProducts = Browser.driver.findElements(By.xpath("//div[@class = \"cart_item\"]"));
        for (WebElement product : addedProducts){
            System.out.println(product.getText());
            System.out.println(product.isDisplayed());
        }

    }

    public static void removeTheBackPack(){

        click(REMOVE_BACKPACK_BUTTON);
    }

    public static void removeTheTshirt() {
     click(REMOVE_TSHIRT_BUTTON);

    }


    public static void checkOut() {
       click(CHECKOUT_BUTTON);
    }
}

