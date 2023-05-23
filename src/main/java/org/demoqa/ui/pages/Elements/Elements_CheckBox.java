package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class Elements_CheckBox extends BasePage {

    public SelenideElement homecheck = $x("//*[@id=\"tree-node\"]/ol/li/span/label");
    public SelenideElement downstrelka = $x("//div[@id=\"tree-node\"]/ol/li/span/button");
    public ElementsCollection strelkiDowns = $$x("//div[@id=\"tree-node\"]/ol/li/ol/li//span/button");
    public ElementsCollection getStrelkiDowns = $$x("//div[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li/span/button");


    public ElementsCollection clickLabelCheckBox = $$x("//label");

    public Elements_CheckBox clickToAllCheckBox(){
        homecheck.click();
        return this;
    }
    public Elements_CheckBox clickstrelki(){
        for(SelenideElement toggle: strelkiDowns){
            toggle.click();
        }
        return this;
    }
    public Elements_CheckBox clickStrelkiDownsTwo(){
        for (SelenideElement secondToggle: getStrelkiDowns){
            secondToggle.click();
        }
        return this;
    }
    public Elements_CheckBox allClickLabel(){
        for (SelenideElement label: clickLabelCheckBox){
            label.click();
        }
        return this;
    }


    public Elements_CheckBox clickFistBox(){
        elementActions.press(downstrelka);
        return this;
    }




}
