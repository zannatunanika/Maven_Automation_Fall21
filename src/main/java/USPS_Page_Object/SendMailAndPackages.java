package USPS_Page_Object;

import Reusable_Library.Reuseaable_Annotations;
import Reusable_Library.Reuseable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMailAndPackages extends Reuseaable_Annotations {

    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public SendMailAndPackages(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reuseaable_Annotations.logger;
    }//end of the constructor method

    @FindBy(xpath = "//*[text()='Print a Label']")
    WebElement PrintLabelButton;

    //click on print a label button
    public void clickOnPrintLabelButton(){
        Reuseable_Actions_Loggers_POM.clickMethod(driver,PrintLabelButton,logger,"Print a Label");
    }//end of method



}
