package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Elements_UplFile extends BasePage {
    SelenideElement linkDownloadfile = $x("//a[@id='downloadButton']");

    public Elements_UplFile ClickUploadDownLoadFile(){
        linkDownloadfile.click();
        File file = new File("C:\\Users\\DELL\\Downloads\\sampleFile.jpeg");
        $(By.id("uploadFile")).uploadFile(file);
        return this;
    }
}
