package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public  class ElementsPage extends BasePage {

    public ElementsCollection elementsList = $$x("//div[@class='element-list collapse show']");
    public SelenideElement getOpenTextBox = $x("//div[@class='element-list collapse show']/ul/li[@id='item-0']");
    public SelenideElement getOpenCheckBox = $x("//div[@class='element-list collapse show']/ul/li[@id='item-1']");
    public SelenideElement getOpenRadioButton = $x("//div[@class='element-list collapse show']/ul/li[@id='item-2']");
    public SelenideElement getOpenWebTables = $x("//div[@class='element-list collapse show']/ul/li[@id='item-3']");
    public SelenideElement getOpenButtons = $x("//div[@class='element-list collapse show']/ul/li[@id='item-4']");
    public SelenideElement getOpenLinks = $x("//div[@class='element-list collapse show']/ul/li[@id='item-5']");
    public SelenideElement getOpenBrokenLinks = $x("//div[@class='element-list collapse show']/ul/li[@id='item-6']");
    public SelenideElement getOpenUploadDownloadFile = $x("//div[@class='element-list collapse show']/ul/li[@id='item-7']");
    public SelenideElement getOpenDynamicProperties = $x("//div[@class='element-list collapse show']/ul/li[@id='item-8']");

    public ElementsPage openTextBox(){
        elementActions.press(getOpenTextBox);
        return this;
    }

    public ElementsPage openCheckBox(){
        elementActions.press(getOpenCheckBox);
        return this;
    }

    public ElementsPage openRadioButton(){
        elementActions.press(getOpenRadioButton);
        return this;
    }

    public ElementsPage openWebTables(){
        elementActions.press(getOpenWebTables);
        return this;
    }
    public ElementsPage openButtons(){
        elementActions.press(getOpenButtons);
        return this;
    }

    public ElementsPage openLinks(){
        elementActions.press(getOpenLinks);
        return this;
    }

    public ElementsPage openBrokenLinksandimages(){
        elementActions.press(getOpenBrokenLinks);
        return this;
    }

}
