package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;
import com.codeborne.selenide.ElementsCollection;

import java.util.Random;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class Elements_RadioButton extends BasePage {

    public ElementsCollection RadioButtons = $$x("//input[@type='radio']");

    public SelenideElement getText = $x("//p[@class='mt-3']");

    public Elements_RadioButton clickToRadioButton(){
        for (SelenideElement rbuttons:RadioButtons){
            rbuttons.shouldBe(enabled).sendKeys(" ");
        }
         return this;
    }


}
