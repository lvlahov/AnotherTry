package core.tests;

import base.tests.BaseTest;
import core.pages.RadioButtonsPage;
import org.testng.annotations.Test;

public class RadioButtonsTests extends BaseTest {

    @Test
    public void testRadioButtons(){

        RadioButtonsPage.goTo();
        RadioButtonsPage.selectGreen();
        RadioButtonsPage.verifyGreenIsSelected("Green", "Radio button is not selected");
    }
}
