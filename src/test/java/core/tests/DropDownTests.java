package core.tests;

import base.tests.BaseTest;
import core.pages.MainPage;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTest {

    @Test
    public void SelectRandomItem() {
        MainPage.goTo();
        MainPage.selectSecondItem();
        MainPage.verifyCorrectItemIsSelected("Two", "Failire with drop-down item");


    }
}
