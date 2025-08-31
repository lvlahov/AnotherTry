package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Browser;

import java.sql.SQLOutput;
import java.util.List;

public class ProductPage {
    public static void getProductCount(int expectedCount, String messageOnFailure) {
        List<WebElement> allProducts = Browser.driver.findElements(By.className("inventory_item_name"));
        int actualCount = allProducts.size();
        System.out.println("Count of all products is " + actualCount);
        Assert.assertEquals(actualCount, expectedCount, messageOnFailure);

    }

    public static void verifyProductsText(String expectedProductText, String messageOnFailure) {
        WebElement product4 = Browser.driver.findElement(By.id("item_4_title_link"));
        String actualProductText = product4.getText();
        Assert.assertEquals(actualProductText, expectedProductText, messageOnFailure);

    }

    public static void addSauceBackPack() {
        WebElement addBackPackToCartButton = Browser.driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

        addBackPackToCartButton.click();

    }

    public static void addTHshirt() {
        WebElement addTShirtToCartButton = Browser.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addTShirtToCartButton.click();

    }

    public static void goToCart() {
        WebElement shoppingCartLink = Browser.driver.findElement(By.id("shopping_cart_container"));
        shoppingCartLink.click();
    }

    public static void verifyProductsAreRemoved(String expectedButtonText, String messageOnFailure) {
        Browser.driver.navigate().back();
        WebElement addToCartBackPackButton = Browser.driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement addToCartTShirtButton = Browser.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        String actualText2 = addToCartTShirtButton.getText();
        String actualText = addToCartBackPackButton.getText();
        Assert.assertEquals(actualText, expectedButtonText, messageOnFailure);
        Assert.assertEquals(actualText2, expectedButtonText, messageOnFailure);
    }

    public static void sortPriceLowToHigh(String expectedOption, String messageOnFailure) {
        WebElement ddown = Browser.driver.findElement(By.className("product_sort_container"));
        Select select = new Select(ddown);
        select.selectByValue("lohi");
        WebElement selectedOption = Browser.driver.findElement(By.xpath("//span[@class = \"active_option\"]"));
        String actualOption = selectedOption.getText();
        Assert.assertEquals(actualOption, expectedOption, messageOnFailure);
        List<WebElement> inventoryItemPrice = Browser.driver.findElements(By.className("inventory_item_price"));
        for (WebElement price : inventoryItemPrice) {
            System.out.println(price.getText());

        }

    }

    public static void addAllProducts() {
        List<WebElement> allProducts = Browser.driver.findElements(By.xpath("//button[contains(@class, \"btn_inventory \")]"));
        for (WebElement product : allProducts) {
            product.click();

        }

    }

    public static void getProductNames() {
        List<WebElement> allProducts = Browser.driver.findElements(By.className("inventory_item_name"));
        for (WebElement product : allProducts) {
            Assert.assertTrue(product.isDisplayed());
            System.out.println(product.getText());



          /*  Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Sauce Labs Backpack", "incorrect");
            Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Sauce Labs Bike Light", "incorrect");
            Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Sauce Labs Bolt T-Shirt", "incorrect");
            Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Sauce Labs Fleece Jacket", "incorrect");
            Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Sauce Labs Onesie", "incorrect");
            Assert.assertEquals(allProducts.get(allProducts.indexOf(product)).getText(), "Test.allTheThings() T-Shirt (Red)", "incorrect");
*/

        }
    }
}
