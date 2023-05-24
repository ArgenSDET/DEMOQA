package ui.regression;

import org.testng.annotations.Test;
import ui.BaseUiTest;

public class PracticeForms extends BaseUiTest {
    @Test
    public void TestRegisterFields(){
        homePage.clickForms();
        practiceForms.openPractic()
                .registrationfield()
                .SelectGender();
//        practiceForms.registrationfield();
    }
}
