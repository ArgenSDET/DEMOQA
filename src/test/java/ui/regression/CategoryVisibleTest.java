package ui.regression;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.demoqa.annotations.TestCase;
import org.demoqa.ui.config.SelenideConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class CategoryVisibleTest extends BaseUiTest {

//
//    @Test(priority = 1)
//    public void verifyCategoryListSize() {
//        int expectedSize = 6;
//        $$(homePage.listOfCategory).shouldHave(
//          CollectionCondition.texts(
//                  "Elements",
//                  "Forms",
//                  "Alerts, Frame & Windows",
//                  "Widgets",
//                  "Interactions",
//                  "Book Store Application"
//
//          )
//        );
//    }
//    @Test(priority = 2)
//    public void verifylistOfElements(){
//        $$(elementsPage.elementsList).shouldHave(
//                CollectionCondition.texts(
//                        "Text Box",
//                        "Check Box",
//                        "Radio Button",
//                        "Web Tables",
//                        "Links",
//                        "Buttons",
//                        "Broken Links - Images",
//                        "Upload and Download",
//                        "Dynamic Properties"
//
//                )
//        );
    }



