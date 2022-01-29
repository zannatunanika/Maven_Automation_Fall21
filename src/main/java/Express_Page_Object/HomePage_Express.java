package Express_Page_Object;

import Reusable_Library.Reuseaable_Annotations;
import Reusable_Library.Reuseable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage_Express extends Reuseaable_Annotations {

    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public HomePage_Express(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reuseaable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='_8GUh-wFlo3OQfza5k9nlw ravenDesktopNav']")
    List<WebElement> navigationTabsList;
    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement WomenTab;

    //create a pom method to get the link count for the list
    public void getNavigationTabsCount(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            wait.until(ExpectedConditions.visibilityOfAllElements(navigationTabsList));
            logger.log(LogStatus.PASS,"Successfully located the navigation tabs count " + navigationTabsList.size());
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to get count from Navigation tabs " + e);
        }
    }//end of method 1

    public void clickOnWomenTab(){
        Reuseable_Actions_Loggers_POM.clickMethod(driver,WomenTab,logger,"Send Tab");
    }//end of clicking on women tab



}//end of class
