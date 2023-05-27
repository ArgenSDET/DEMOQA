package org.demoqa.ui.pages.Forms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;

import java.io.File;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForms extends BasePage {
    public SelenideElement gotoPractic = $x("//div/div/div[2]/div[1]/div/div/div[2]/div/ul/li[@id='item-0']") ;

    public SelenideElement firstName = $(By.id("firstName")) ;


    public SelenideElement lastname = $(By.id("lastName"));

    public SelenideElement email = $(By.id("userEmail"));

    public ElementsCollection gender = $$x("//*[@id=\"genterWrapper\"]/div[2]");

    public SelenideElement mnumber = $(By.id("userNumber"));
    public SelenideElement Dateb = $(By.id("dateOfBirthInput"));

    public SelenideElement subject = $(By.id("subjectsInput"));
    public SelenideElement listOfSubjects = $x("//*[contains(@class,'26l3qy-menu')]");

    public SelenideElement hobbies = $x("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]");

    public SelenideElement picture = $(By.id("uploadPicture"));

    public SelenideElement Craddress = $(By.id("currentAddress"));

    public SelenideElement state = $(By.id("react-select-3-input"));
    public SelenideElement listofState = $x("//*[contains(@class,'26l3qy-menu')]");

    public SelenideElement city = $(By.id("react-select-4-input"));

    public SelenideElement listofCity =$x("//*[contains(@class,'26l3qy-menu')]");

    public SelenideElement submit = $(By.id("submit"));


    public PracticeForms openPractic(){
        gotoPractic.click();
        return this;
    }

    public  PracticeForms SelectGender(){
        String randomGenderValue =  generateRandomGender();
        SelenideElement gender1 = $x("//input[@value='" + randomGenderValue + "']");
        gender1.sendKeys(" ");
        return this;
    }

    public static  String generateRandomGender(){
        String [] genderList = {"Male","Female","Other"};
        Random random = new Random();
        int index = random.nextInt(genderList.length);
        return genderList[index];
    }



    public PracticeForms writeDatebirth(){
        this.Dateb.sendKeys(Keys.SHIFT,Keys.HOME);
        elementActions.input(this.Dateb, String.valueOf(fakerGenerator.randomDateBirth()));
        this.Dateb.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeForms selectSubjects() {
        String subjectName = "ma,eng,ch,comm,eco";
        String[] parts = subjectName.split(",");
        for (String e: parts) {
            elementActions.input(this.subject, e);
            listOfSubjects.shouldBe(Condition.visible);
            ElementsCollection subjects = $$(listOfSubjects.findElements(By.tagName("div")));
            for (SelenideElement s : subjects) {
                if (s.getText().toLowerCase().substring(0, e.length()).equals(e.toLowerCase())) {
                    s.click();
                    break;
                }
            }
        }
        return this;
    }

    public static  String generateRandomHobbies(){
        String[] hobbiesList = {"Sports","Reading","Music"};
        Random random =  new Random();
        int index = random.nextInt(hobbiesList.length);
        return hobbiesList[index];
    }

    public PracticeForms SelectHobbies(){
        String hobby = generateRandomHobbies();
        SelenideElement hobbies1 = $x("//label[text()='" + hobby + "']");
        hobbies1.click();
        return this;
    }

    public PracticeForms ClickUploadFile(){
        File file = new File("C:\\Users\\DELL\\Downloads\\sampleFile.jpeg");
        $(By.id("uploadPicture")).uploadFile(file);
        return this;
    }



    public static String clickRandomState(){
        String[] stateList = {"NCR","Uttar Pradesh","Haryana","Rajasthan"};
        Random random = new Random();
        int index = random.nextInt(stateList.length);
        return stateList[index];

    }

    public  PracticeForms SelectState(){
        String statename = clickRandomState();
        elementActions.input(this.state,statename);
       listofState.findElements(By.tagName("div")).stream()
               .filter(s-> s.getText().toLowerCase().startsWith(statename.toLowerCase()))
               .findFirst()
               .ifPresent(WebElement::click);
       return this;
    }

    public static String clickRandomCityNCR(){
        String[] stateNCR = {"Delhi","Gurgaon","Noida"};
        Random random = new Random();
        int index = random.nextInt(stateNCR.length);
        return stateNCR[index];
    }

    public static String clickRandomCityUttar(){
        String[] stateUttar = {"Agra","Lucknow","Merrut"};
        Random random = new Random();
        int index = random.nextInt(stateUttar.length);
        return stateUttar[index];
    }

    public static String clickRandomCityHaryana(){
        String[] stateHaryana = {"Karnal","Panipat"};
        Random random = new Random();
        int index = random.nextInt(stateHaryana.length);
        return stateHaryana[index];
    }

    public static String clickRandomCityRajastan(){
        String[] stateRajastan = {"Jaipur","Jaiselmer"};
        Random random = new Random();
        int index = random.nextInt(stateRajastan.length);
        return stateRajastan[index];
    }

    public PracticeForms SelectCity() {
        String statename = clickRandomState();
        String cityNCR = clickRandomCityNCR();
        String cityUttar = clickRandomCityUttar();
        String cityHaryana = clickRandomCityHaryana();
        String cityRajastan = clickRandomCityRajastan();
        if (statename.contains("NCR")) {
            elementActions.input(this.city, cityNCR);
            listofCity.findElements(By.tagName("div")).stream()
                    .filter(s -> s.getText().toLowerCase().startsWith(cityNCR.toLowerCase()))
                    .findFirst()
                    .ifPresent(WebElement::click);
        } else if (statename.contains("Uttar Pradesh")) {
            elementActions.input(this.city, cityUttar);
            listofCity.findElements(By.tagName("div")).stream()
                    .filter(s -> s.getText().toLowerCase().startsWith(cityUttar.toLowerCase()))
                    .findFirst()
                    .ifPresent(WebElement::click);
        } else if (statename.contains("Haryana")) {
            elementActions.input(this.city, cityHaryana);
            listofCity.findElements(By.tagName("div")).stream()
                    .filter(s -> s.getText().toLowerCase().startsWith(cityHaryana.toLowerCase()))
                    .findFirst()
                    .ifPresent(WebElement::click);
        } else if (statename.contains("Rajasthan")) {
            elementActions.input(this.city, cityRajastan);
            listofCity.findElements(By.tagName("div")).stream()
                    .filter(s -> s.getText().toLowerCase().startsWith(cityRajastan.toLowerCase()))
                    .findFirst()
                    .ifPresent(WebElement::click);
        }
        return  this;
    }

    public PracticeForms clickSubmit(){
        submit.click();
        return this;
    }
    public PracticeForms scrollDown() {
        Selenide.executeJavaScript("window.scrollBy(0,400)");
        return this;
    }

}
