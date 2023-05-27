package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Elements_TextBox extends BasePage {
    public SelenideElement getDataName = $x("//p[@id='name']");
    public SelenideElement getDataEmail = $x("//p[@id='email']");



    public SelenideElement getDataCurrent = $x("//p[@id='currentAddress']");
    public SelenideElement getDataPernamanent =$x("//p[@id='permanentAddress']");

    public Elements_TextBox writeFullname(){
        $(By.id("userName")).setValue(fakerGenerator.name);
        return this;
    }
    public Elements_TextBox writeEmail(){
        $(By.id("userEmail")).setValue(fakerGenerator.randomEmail());
        return this;
    }
    public Elements_TextBox writeCrAddress(){
        $(By.id("currentAddress")).setValue(fakerGenerator.randomCurrentAddress());
        return this;
    }
    public Elements_TextBox writePrAddress(){
        $(By.id("permanentAddress")).setValue(fakerGenerator.randomCurrentAddress());
        return this;
    }
    public Elements_TextBox clickSubmit(){
        elementActions.press($(By.id("submit")));
        return this;
    }



}
