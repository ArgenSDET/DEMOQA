package org.demoqa.ui.pages.AlertsFrameWindow;

import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AlertsFrameWindowPage extends BasePage {
    public SelenideElement gotoBrowserWindow = $x("//div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[@id='item-0']");
    public SelenideElement gotoAlerts  = $x("//div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[@id='item-1']");




    public AlertsFrameWindowPage openBrowserWindow(){
        gotoBrowserWindow.click();
        return this;
    }

    public AlertsFrameWindowPage clicktoNewTab(){
        $(By.id("tabButton")).click();
        return this;
    }

    public AlertsFrameWindowPage openAlerts(){
       elementActions.press(gotoAlerts);
        return this;
    }
}
