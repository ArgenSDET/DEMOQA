package org.demoqa.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.Elements.ElementsPage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public  class  HomePage extends BasePage {

    public ElementsCollection listOfCategory = $$x("//div[@class='category-cards']");

    public SelenideElement gotoElements = $x("//div[1][@class='card mt-4 top-card']");

    public SelenideElement gotoForms =$x("//div[2][@class='card mt-4 top-card']");

    public SelenideElement gotoAlertsFrame = $x("//div[3][@class='card mt-4 top-card']");

    public SelenideElement gotoWidgets =$x("//div[4][@class='card mt-4 top-card']");

    public SelenideElement gotoInteraction = $x("//div[5][@class='card mt-4 top-card']");

    public SelenideElement gotoBooks = $x("//div[6][@class='card mt-4 top-card']");

    public HomePage clickElements(){
        elementActions.press(gotoElements);
        return this;
    }


    public HomePage clickForms(){
        elementActions.press(gotoForms);
        return this;
    }

    public HomePage clickAllertsFrame(){
        elementActions.press(gotoAlertsFrame);
        return this;
    }

}
