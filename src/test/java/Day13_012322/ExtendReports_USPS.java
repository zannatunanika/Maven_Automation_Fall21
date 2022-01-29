package Day13_012322;

import Reusable_Library.Reuseaable_Annotations;
import Reusable_Library.Reuseable_Actions_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class ExtendReports_USPS extends Reuseaable_Annotations {


    @Test()
    public void uspsTest(){
        logger = reports.startTest("Track a package on USPS");
        //navigate to usps
        logger.log(LogStatus.INFO,"Navigate to USPS home page");
        driver.navigate().to("https://www.usps.com");
        //hover to the quick tool tab
        Reuseable_Actions_Loggers.mouseHover(driver,"//*[text()='Quick Tools']",logger,"Quck tools");
        //click on track a package
        Reuseable_Actions_Loggers.clickMethod(driver,"//*[text()='Track a Package']",logger,"Track a Packgage");
        //enter your tracking number
        Reuseable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
        //click on track button
        Reuseable_Actions_Loggers.clickMethod(driver,"//*[@class='button tracking-btn']",logger,"Track Button");

    }//end of test

}//end of class
