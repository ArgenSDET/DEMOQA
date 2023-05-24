package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$$x;

public class Elements_BrokenImgLinks extends BasePage {

    public  Elements_BrokenImgLinks getImage(){
        ElementsCollection imgBrVal = $$x("//div/div/div[2]/div[2]/div[2]/img");
        for(SelenideElement img: imgBrVal){
            img.shouldBe(Condition.visible);
        }
        return this;
    }

    public Elements_BrokenImgLinks getlinks(){
        ElementsCollection linkss = $$x("//div/div/div[2]/div[2]/div[2]/a");
        for (SelenideElement linkk : linkss) {
            String href = linkk.getAttribute("href");
            int statusCode = getResponseCode(href);

            if (statusCode == 200) {
                System.out.println(href + " - OK");
            } else {
                System.out.println(href + " - Failed (" + statusCode + ")");
            }
        }
        return this;
    }

    private int getResponseCode(String urlString){
        int statusCode = -1;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            statusCode = connection.getResponseCode();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return statusCode;
    }

}
