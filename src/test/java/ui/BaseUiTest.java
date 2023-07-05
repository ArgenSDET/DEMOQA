package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.demoqa.ui.config.SelenideConfig;
import org.demoqa.ui.element_helper.FakerGenerator;
import org.demoqa.ui.element_helper.WebElementActions;
import org.demoqa.ui.pages.AlertsFrameWindow.AlertsFrameWindowPage;
import org.demoqa.ui.pages.Elements.*;
import org.demoqa.ui.pages.Forms.PracticeForms;
import org.demoqa.ui.pages.HomePage;
import org.demoqa.ui.pages.Widgets.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.TestRunner.PriorityWeight.priority;

public abstract class BaseUiTest {
   private static Logger logger = LogManager.getLogger(BaseUiTest.class);
   public WebElementActions elementActions;
   public HomePage homePage;
   public Elements_TextBox elementsTextBox;
   public ElementsPage elementsPage;
   public Elements_CheckBox elementsCheckBox;
   public Elements_RadioButton elementsRadioButton;
   public Elements_WebTables elementsWebTables;

   public Elements_Buttons elementsButtons;

   public Elements_Links elementsLinks;
   public Elements_BrokenImgLinks elementsBrokenImgLinks;
   public Elements_UplFile elementsUplFile;

   public PracticeForms practiceForms;
   public FakerGenerator fakerGenerator;
   public AlertsFrameWindowPage alertsFrameWindowPage;
   public Accordian accordian ;
   public AutoComplete autoComplete;
   public Data_Picker dataPicker;
   public Slider slider;
   public ProgressBar progressBar;
   public Tabs tabs;
   public ToolTips toolTips;
   public Menu menu;
   public SelectMenu selectMenu;

   @BeforeClass
    public void setup(){
      homePage = new HomePage();
      elementActions = new WebElementActions();
      elementsTextBox = new Elements_TextBox();
      elementsPage = new ElementsPage();
      elementsCheckBox = new Elements_CheckBox();
      elementsRadioButton = new Elements_RadioButton();
      elementsWebTables = new Elements_WebTables();
      elementsButtons = new Elements_Buttons();
      elementsLinks = new Elements_Links();
      elementsBrokenImgLinks = new Elements_BrokenImgLinks();
      elementsUplFile = new Elements_UplFile();
      practiceForms = new PracticeForms();
      fakerGenerator = new FakerGenerator();
      alertsFrameWindowPage = new AlertsFrameWindowPage();
      accordian = new Accordian();
      autoComplete = new AutoComplete();
      dataPicker = new Data_Picker();
      slider = new Slider();
      progressBar = new ProgressBar();
      tabs = new Tabs();
      toolTips = new ToolTips();
      menu = new Menu();
      selectMenu = new SelectMenu();




//       ChromeOptions chromeOptions = new ChromeOptions();
//       chromeOptions.addArguments("--window-size=1920,1080");
//       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//       desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
//       Configuration.browserCapabilities = desiredCapabilities;

       Configuration.browserSize = "1920x1080";
     open("https://demoqa.com/");
   }


}
