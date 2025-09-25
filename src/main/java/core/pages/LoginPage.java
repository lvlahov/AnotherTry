package core.pages;

import base.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    private final static By ERROR_MESSAGE = By.xpath("//h3[@data-test = \"error\"]");
    private final static By USERNAME_FIELD = By.id("user-name");
    private final static By PASSWORD_FIELD = By.id("password");
    private final static By LOGIN_BUTTON = By.id("login-button");

    /**
     * Redirect the user to Swag Labs page.
     */
    public static void goTo() {

        Browser.driver.get("https://saucedemo.com/");

    }

    /**
     * This method is used to log in the user.
     * @param username
     * @param password
     */
    public static void login(String username, String password) {
       type(USERNAME_FIELD, username);
       type(PASSWORD_FIELD, password);
        click(LOGIN_BUTTON);
    }

    public static void verifyUserIsLocked(String expectedMessage, String messageOnFailure) {
       String actualMessage = getText(ERROR_MESSAGE);
        Assert.assertEquals(actualMessage, expectedMessage, messageOnFailure);



    }

    public static void loginWithDelay(String username, String password) {
        type(USERNAME_FIELD, username);
        type(PASSWORD_FIELD, password);
        click(LOGIN_BUTTON);
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
