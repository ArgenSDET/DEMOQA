package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class Elements_Buttons extends BasePage {
    SelenideElement DoubleClick = $(By.id("doubleClickBtn"));
    SelenideElement RightClick = $(By.id("rightClickBtn"));
    SelenideElement OneClick= $(byText("Click Me"));

   public ElementsCollection getTextButtons = $$x("//div[@class= 'col-12 mt-4 col-md-6']/div[2]/p");

    public  Elements_Buttons ClickToButtons(){
        DoubleClick.doubleClick();
        RightClick.contextClick();
        OneClick.click();
        return this;
    }
}
