package ui.regression;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.demoqa.ui.pages.Elements.Elements_BrokenImgLinks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.codeborne.selenide.ElementsCollection;

import ui.BaseUiTest;
import Listeners.ScreenshotListener;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
/**
 * @author Argen
 */

@Listeners({SoftAsserts.class, ScreenShooter.class, ScreenshotListener.class
})


public class ElementsTest extends BaseUiTest {
    @Test(priority = 1)
    public void TextBoxTest(){
        homePage.clickElements();
        elementsPage.openTextBox();
        elementsTextBox.writeFullname()
                .writeEmail()
                .writeCrAddress()
                .writePrAddress()
                .clickSubmit();
    }
    @Test(priority = 2)
    public void Testforentereddata(){
        Assert.assertNotNull(elementsTextBox.getDataName,"Generated name is null");
        Assert.assertNotNull(elementsTextBox.getDataCurrent,"Generated current is null");
        Assert.assertNotNull(elementsTextBox.getDataPernamanent,"Generated pernamanent is null");
        elementsTextBox.getDataName.shouldBe(Condition.visible);
        elementsTextBox.getDataEmail.shouldBe(Condition.visible);
        elementsTextBox.getDataCurrent.shouldBe(Condition.visible);
        elementsTextBox.getDataPernamanent.shouldBe(Condition.visible);
    }
    @Test(priority = 3)
    public void checkBoxClickTest(){
        elementsPage.openCheckBox();
        elementsCheckBox.clickFistBox()
                .clickstrelki()
                .clickStrelkiDownsTwo()
                .allClickLabel()
                .clickToAllCheckBox();

        String expectedResult = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        ElementsCollection getResults = $$x("//div[@id='result']/span");
        String[] expectedLines = expectedResult.split("\\r?\\n");

        for (int i = 0; i < expectedLines.length; i++) {
            getResults.get(i).shouldHave(text(expectedLines[i]));
        }

    }

   @Test(priority = 4)
    public void clickTestRadioButtons(){
        refresh();
        sleep(3000);
        elementsPage.openRadioButton();
        elementsRadioButton.clickToRadioButton();
       elementsRadioButton.getText.isDisplayed();

   }

   @Test(priority = 5)
    public void TestWebTables(){
       refresh();
       sleep(3000);
        elementsPage.openWebTables();
        elementsWebTables.FillinginthRegistrationfields();
        sleep(5000);
        refresh();
        elementsWebTables.registrationWithoutRequiredFields();
       $(By.id("submit")).click();
       $(By.id("submit")).shouldBe(Condition.enabled);
       $x("//button[@class='close']").click();
       sleep(3000);
       elementsWebTables.searchField();
       sleep(5000);
   }
   @Test(priority = 6)
    public void TestClickToButtons(){
       refresh();
       sleep(3000);
        elementsPage.openButtons();
        elementsButtons.ClickToButtons();
       String expectedText = "You have done a double click\n"+"You have done a right click\n"+"You have done a dynamic click";
      String[] expectedLines1 = expectedText.split("\\r?\\n");
      for(int i = 0; i<expectedLines1.length;i++){
          elementsButtons.getTextButtons.get(i).shouldHave(text(expectedLines1[i]));
      }
   }

   @Test(priority = 7)
    public void LinkTest(){
       refresh();
       sleep(3000);
        elementsPage.openLinks();
        elementsLinks.getResponseLinks();
   }

   @Test(priority = 8)
    public void TestBrokenLinksImage(){
        elementsPage.openBrokenLinksandimages();
        refresh();
       elementsBrokenImgLinks .getImage()
               .getlinks();
   }
   @Test(priority = 9)
    public void TestUploadFile(){
       homePage.clickElements();
        elementsPage.openDownFile();
        elementsUplFile.ClickUploadDownLoadFile();
        $(By.id("uploadedFilePath")).shouldHave(text("C:\\fakepath\\sampleFile.jpeg"));
   }

   @Test(priority = 10)
    public void TestDynamicProper(){
        elementsPage.openDynamicProperties();
        SelenideElement dynamicElement = $(By.id("colorChange"));
        String initValue = dynamicElement.getValue();
        sleep(5000);
        String updateValue = dynamicElement.getValue();
        Assert.assertNotEquals(initValue,updateValue);
   }



}
