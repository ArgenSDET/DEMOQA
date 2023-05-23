package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Elements_Links extends BasePage {
    private ElementsCollection links = $$x("//div[@id='linkWrapper']/p/a");

    public Elements_Links getResponseLinks() {
        for (SelenideElement link : links) {
            String href = link.getAttribute("href");
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
