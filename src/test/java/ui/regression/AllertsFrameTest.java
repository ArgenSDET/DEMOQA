package ui.regression;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;


public class AllertsFrameTest extends BaseUiTest {
    @Test
    public void TestNewTab(){
        homePage.clickAllertsFrame();
        alertsFrameWindowPage.openBrowserWindow()
                        .clicktoNewTab();
                switchTo().window(1);
        $(By.id("sampleHeading")).shouldHave(Condition.text("This is a sample page"));
        closeWindow();
        switchTo().window(0);

        $(By.id("windowButton")).click();
        switchTo().window(1);
        $(By.id("sampleHeading")).shouldHave(Condition.text("This is a sample pag"));
        closeWindow();
        switchTo().window(0);

        $(byId("messageWindowButton")).click();
        switchTo().window(1);
        String bodyText = $("body").getText();
        Assert.assertEquals(bodyText,"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
        closeWindow();
        switchTo().window(0);
    }


    @Test
    public void TestAlerts(){
        String name = Faker.instance().name().firstName();
        homePage.clickAllertsFrame();
        alertsFrameWindowPage.openAlerts();
        $(byId("alertButton")).click();
        switchTo().alert();
        String alertText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(alertText,"You clicked a button");
        Selenide.switchTo().alert().accept();


        $(byId("timerAlertButton")).click();
        sleep(6000);
        switchTo().alert();
        String alert5secondsText = switchTo().alert().getText();
        Assert.assertEquals(alert5secondsText,"This alert appeared after 5 seconds");
        switchTo().alert().accept();

        $(byId("confirmButton")).click();
        switchTo().alert();
        String alertConfirmationText = switchTo().alert().getText();
        Assert.assertEquals(alertConfirmationText,"Do you confirm action?");
        switchTo().alert().accept();
        $(byId("confirmResult")).shouldHave(Condition.text("You selected Ok"));

        $(byId("confirmButton")).click();
        switchTo().alert();
        String alertConfirmationText1 = switchTo().alert().getText();
        Assert.assertEquals(alertConfirmationText1,"Do you confirm action?");
        switchTo().alert().dismiss();
        $(byId("confirmResult")).shouldHave(Condition.text("You selected Cancel"));

        $(byId("promtButton")).click();
        switchTo().alert();
        String alertWriteText= switchTo().alert().getText();
        Assert.assertEquals(alertWriteText,"Please enter your name");
        switchTo().alert().sendKeys(name);
        switchTo().alert().accept();
        $(byId("promptResult")).shouldHave(Condition.text("You entered "+name));
    }
}
