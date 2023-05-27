package org.demoqa.ui.pages.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class Elements_WebTables extends BasePage {
    public SelenideElement addButton = $(By.id("addNewRecordButton"));
    public SelenideElement searchUsers = $(By.id("searchBox"));
    public ElementsCollection UsersList = $$x("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]");
    public ElementsCollection UserDelete = $$x("//div[@class='rt-tbody']/div/div/div/div/span[@title='Delete']");
    public ElementsCollection UserEdit = $$x("//div[@class='rt-tbody']/div/div/div/div/span[@title='Edit']");

    public Elements_WebTables FillinginthRegistrationfields() {
        addButton.click();
        $(By.id("firstName")).setValue(fakerGenerator.name);
        $(By.id("lastName")).setValue(fakerGenerator.randomLastName());
        $(By.id("userEmail")).setValue(fakerGenerator.randomEmail());
        $(By.id("age")).setValue(fakerGenerator.randomAge());
        $(By.id("salary")).setValue(fakerGenerator.randomSalary());
        $(By.id("department")).setValue(fakerGenerator.randomDepartment());
        $(By.id("submit")).click();
        return this;
    }

    public Elements_WebTables registrationWithoutRequiredFields(){
        addButton.click();
        $(By.id("age")).setValue(fakerGenerator.randomAge());
        $(By.id("salary")).setValue(fakerGenerator.randomSalary());
        $(By.id("department")).setValue(fakerGenerator.randomDepartment());
        return this;
    }

    public Elements_WebTables searchField(){
         int randomIndex = new Random().nextInt(UsersList.size());
         SelenideElement randomUser = UsersList.get(randomIndex);
        String user =  randomUser.getText();
        elementActions.input(searchUsers,user);
        UsersList.find(Condition.text(user)).should(Condition.visible);
        return this;
    }



    }
