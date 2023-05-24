package org.demoqa.ui.pages.Forms;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.demoqa.ui.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForms extends BasePage {
    public SelenideElement gotoPractic = $x("//li[@class='btn btn-light active']") ;

    public SelenideElement firstName = $(By.id("firstName")) ;


    public SelenideElement lastname = $(By.id("lastName"));

    public SelenideElement email = $(By.id("userEmail"));

    public ElementsCollection gender = $$x("//*[@id=\"genterWrapper\"]/div[2]");

    public SelenideElement mnumber = $(By.id("userNumber"));
    public SelenideElement Dateb = $(By.id("dateOfBirthInput"));

    public SelenideElement subjects = $(By.id("subjectsInput"));
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
        elementActions.press(gotoPractic);
        return this;
    }

    public PracticeForms registrationfield(){
        firstName.setValue(fakerGenerator.randomfullName());
        lastname.setValue(fakerGenerator.randomLastName());
        email.setValue(fakerGenerator.randomEmail());
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



//    public PracticeForms writeFirstName(String firstName){
//        elementActions.input(this.firstName,firstName);
//        return this;
//    }
//
//
//
//    public RegistrantionForm writeLastName(String Lastname){
//        elementActions.input(this.lastname,Lastname);
//        return this;
//    }
//    public RegistrantionForm writeEmail(String email){
//        elementActions.input(this.email,email);
//        return this;
//    }
//    public RegistrantionForm chooseGender(String gender){
//        if(gender.equalsIgnoreCase("male")){
//            Driver.getDriver().findElement(By.id("gender-radio-1")).sendKeys(" ");
//        }
//        else if(gender.equalsIgnoreCase("Female")){
//            Driver.getDriver().findElement(By.id("gender-radio-2")).sendKeys(" ");
//        } else if (gender.equalsIgnoreCase("other")) {
//            Driver.getDriver().findElement(By.id("gender-radio-3")).sendKeys(" ");
//        }
//        return this;
//    }
//
//    public RegistrantionForm writeMobileNumber(String mnumber){
//        elementActions.input(this.mnumber,mnumber);
//        return this;
//    }
//
//    public RegistrantionForm writeDatebirth(String dateb){
//        this.Dateb.sendKeys(Keys.SHIFT,Keys.HOME);
//        elementActions.input(this.Dateb,dateb);
//        this.Dateb.sendKeys(Keys.ENTER);
//        return this;
//    }
//    public RegistrantionForm selectSubjects(String subjectName) {
//        String[] parts = subjectName.split(",");
//        for (String e: parts) {
//            elementActions.input(this.subjects, e);
//            listOfSubjects.findElements(By.tagName("div"))
//                    .stream()
//                    .filter(s -> s.getText().toLowerCase().startsWith(e.toLowerCase()))
//                    .findFirst()
//                    .ifPresent(SelenideElement::click);
//        }
//        return this;
//    }
//
//    public RegistrantionForm selectHobies(String hobbiesName){
//        if(hobbiesName.equalsIgnoreCase("Sports")){
//            Driver.getDriver().findElement(By.id("hobbies-checkbox-1")).sendKeys(" ");
//        } else if (hobbiesName.equalsIgnoreCase("Reading")) {
//            Driver.getDriver().findElement(By.id("hobbies-checkbox-2")).sendKeys(" ");
//        }else if (hobbiesName.equalsIgnoreCase("Music")) {
//            Driver.getDriver().findElement(By.id("hobbies-checkbox-3")).sendKeys(" ");
//        }return this;
//    }
//    public RegistrantionForm uploadPicture(String file){
//
//        picture.sendKeys(file);
//        return this;
//    }
//
//    public RegistrantionForm writeCrAddress(String craddres1){
//        elementActions.input(Craddress, craddres1);
//        return this;
//    }
//    public RegistrantionForm SelectState(String stateName) {
//        elementActions.input(this.state, stateName);
//        listofState.findElements(By.tagName("div")).stream()
//                .filter(s -> s.getText().toLowerCase().startsWith(stateName.toLowerCase()))
//                .findFirst()
//                .ifPresent(SelenideElement::click);
//        return this;
//    }
//    public RegistrantionForm SelectCity(String cityName){
//        elementActions.input(this.city, cityName);
//        listofCity.findElements(By.tagName("div")).stream()
//                .filter(s -> s.getText().toLowerCase().startsWith(cityName.toLowerCase()))
//                .findFirst()
//                .ifPresent(SelenideElement::click);
//        return this;
//    }
//    public RegistrantionForm btnsubmit(){
//        submit.click();
//        return  this;
//    }
//    public RegistrantionForm scrollDown(){
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scrollBy(0,400)");
//        return this;
//    }


//
//    @FindBy(css = "tr:nth-child(1) td:nth-child(1)")
//    public SelenideElement labelName;
//    @FindBy(css = "tr:nth-child(2) td:nth-child(1)")
//    public SelenideElement labelEmail;
//    @FindBy(css = "tr:nth-child(3) td:nth-child(1)")
//    public SelenideElement labelGender;
//    @FindBy(css = "tr:nth-child(4) td:nth-child(1)")
//    public SelenideElement labelMobile;
//    @FindBy(css = "tr:nth-child(5) td:nth-child(1)")
//    public SelenideElement labelDateOfBirth;
//    @FindBy(css = "tr:nth-child(6) td:nth-child(1)")
//    public SelenideElement labelSubjects;
//    @FindBy(css = "tr:nth-child(7) td:nth-child(1)")
//    public SelenideElement labelHobbies;
//    @FindBy(css = "tr:nth-child(8) td:nth-child(1)")
//    public SelenideElement labelPicture;
//    @FindBy(css = "tr:nth-child(9) td:nth-child(1)")
//    public SelenideElement labelAddress;
//    @FindBy(css = "tr:nth-child(10) td:nth-child(1)")
//    public SelenideElement labelStateAndCity;
//
//    /////////////////////////////////////////////////////////////
//    @FindBy(css = "tr:nth-child(1) td:nth-child(2)")
//    public SelenideElement valueName;
//    @FindBy(css = "tr:nth-child(2) td:nth-child(2)")
//    public SelenideElement valueEmail;
//    @FindBy(css = "tr:nth-child(3) td:nth-child(2)")
//    public SelenideElement valueGender;
//    @FindBy(css = "tr:nth-child(4) td:nth-child(2)")
//    public SelenideElement valueMobile;
//    @FindBy(css = "tr:nth-child(5) td:nth-child(2)")
//    public SelenideElement valueDateOfBirth;
//    @FindBy(css = "tr:nth-child(6) td:nth-child(2")
//    public SelenideElement valueSubjects;
//    @FindBy(css = "tr:nth-child(7) td:nth-child(2)")
//    public SelenideElement valueHobbies;
//    @FindBy(css = "tr:nth-child(8) td:nth-child(2)")
//    public SelenideElement valuePicture;
//    @FindBy(css = "tr:nth-child(9) td:nth-child(2)")
//    public SelenideElement valueAddress;
//    @FindBy(css = "tr:nth-child(10) td:nth-child(2)")
//    public SelenideElement valueStateAndCity;
//
//
//    public Map<String, String> resultForm() {
//        List<SelenideElement> keys = List.of(labelName, labelEmail, labelGender, labelMobile, labelDateOfBirth, labelSubjects, labelHobbies, labelPicture, labelAddress, labelStateAndCity);
//        List<SelenideElement> value = List.of(valueName, valueEmail, valueGender, valueMobile, valueDateOfBirth, valueSubjects, valueHobbies, valuePicture, valueAddress, valueStateAndCity);
//        LinkedHashMap<String, String> resultForm = new LinkedHashMap<>();
//        for (int i = 0; i < keys.size(); i++) {
//            resultForm.put(keys.get(i).getText(), value.get(i).getText());
//        }
//        return resultForm;
//
//    }

}
