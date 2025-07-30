package core.tests;

import base.tests.BaseTest;
import core.pages.*;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void Add2ProductsToCart(){
        LoginTest login = new LoginTest();
        login.standartLogin();
        ProductPage.addSauceBackPack();
        ProductPage.addTHshirt();
        ProductPage.goToCart();
        CartPage.verifyUserIsOnTheCartPage("Your Cart", "User is not on the Cart page");
        CartPage.verifyProductsAreAdded();

    }

    @Test
    public void removeAllProductsAndSortTheirPrice(){
        CartTests cartTest = new CartTests();
        cartTest.Add2ProductsToCart();
        CartPage.removeTheBackPack();
        CartPage.removeTheTshirt();
        ProductPage.verifyProductsAreRemoved("Add to cart", "Product is not removed from cart");
        ProductPage.sortPriceLowToHigh("Price (low to high)", "Incorrect drop-down selection");


    }
    @ Test
    public void AddAllProductsAndCheckOut(){
        LoginTest login = new LoginTest();
        login.standartLogin();
        ProductPage.addAllProducts();
        ProductPage.goToCart();
        CartPage.verifyUserIsOnTheCartPage("Your Cart", "User is not on the Cart page");
        CartPage.verifyProductsAreAdded();
        CartPage.checkOut();
        CheckOutPage.verifyUserIsOnCheckOutPage("Checkout: Your Information", "You're not on the Checkout Page!");
        CheckOutPage.insertYourDetailsAndSubmit("Lyudmil", "Vlahov", "1517");
        ChekoutOverViewPage.verifyUserIsOnOverviewPage("Checkout: Overview", "You are not on the Checkout Overview Page!");
        ChekoutOverViewPage.verifyAllProductsAreDisplayed();
        CheckOutPage.finishTheOrder();
        CheckOutCompletionPage.verifyOrderIsSuccessfullySubmitted("Your order has been dispatched, and will arrive just as fast as the pony can get there!", "Error with the order");



    }

}
