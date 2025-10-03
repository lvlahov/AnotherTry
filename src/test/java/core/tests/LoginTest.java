package core.tests;

import base.tests.BaseTest;
import components.Header;
import core.pages.LoginPage;
import core.pages.ProductPage;
import io.cucumber.java.en.Given;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    @Given("I login")
    public void standartLogin(){
        LoginPage.goTo();
        LoginPage.login("standard_user", "secret_sauce");
        Header.verifyProductsText("Products", "You were unable to login");

}
    @Test
    public void lockedUserLogin(){
        LoginPage.goTo();
        LoginPage.login("locked_out_user", "secret_sauce");
        LoginPage.verifyUserIsLocked("Epic sadface: Sorry, this user has been locked out.", "Error with test");
    }

    @Test
    public void problemUserLogin(){
        LoginPage.goTo();
        LoginPage.login("problem_user", "secret_sauce" );
        ProductPage.verifyProductsText("Sauce Labs Backpack", "Error with problem user login");
    }
    @Test
    public void performanceGlitchUserLogin(){
        LoginPage.goTo();
        LoginPage.loginWithDelay("performance_glitch_user", "secret_sauce");
        Header.verifyProductsText("Products", "You were unable to login");
    }

    @Test
    public void loginWithErrorUser(){
        LoginPage.goTo();
        LoginPage.login("error_user", "secret_sauce");
        Header.verifyProductsText("Products", "You were unable to login");
    }
    @Test
    public void loginWithVisualUser(){
        LoginPage.goTo();
        LoginPage.login("visual_user", "secret_sauce");
        Header.verifyProductsText("Products", "You were unable to login");
    }

}
