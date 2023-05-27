package ui.regression;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForms extends BaseUiTest {
    @Test
    public void TestRegisterFields(){
        String userName = Faker.instance().name().firstName();
        String userLastName = Faker.instance().name().lastName();
        String userEmail = Faker.instance().internet().emailAddress();
        String userPhone = fakerGenerator.randomMnumber();
        String userCurrentAdress = fakerGenerator.randomCurrentAddress();
        homePage.clickForms();
        practiceForms.openPractic();
        $(By.id("firstName")).setValue(userName);
        $(By.id("lastName")).setValue(userLastName);
        $(By.id("userEmail")).setValue(userEmail);
        practiceForms
                .SelectGender();
        $(By.id("userNumber")).setValue(userPhone);
        practiceForms
                .writeDatebirth()
                .selectSubjects()
                .SelectHobbies()
                .ClickUploadFile();
        $(By.id("currentAddress")).setValue(userCurrentAdress);
        practiceForms
                .SelectState()
                .SelectCity()
                .scrollDown()
                .clickSubmit();
        sleep(3000);
        $("tr:nth-child(1) td:nth-child(2)").shouldHave(Condition.text(userName));
        $("tr:nth-child(2) td:nth-child(2)").shouldHave(Condition.text(userEmail));
        $("tr:nth-child(4) td:nth-child(2)").shouldHave(Condition.text(userPhone));
        $("tr:nth-child(8) td:nth-child(2)").shouldHave(text("sampleFile.jpeg"));
        $("tr:nth-child(9) td:nth-child(2)").shouldHave(Condition.text(userCurrentAdress));

    }
}
