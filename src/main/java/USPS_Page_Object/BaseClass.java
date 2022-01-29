package USPS_Page_Object;

import Reusable_Library.Reuseaable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reuseaable_Annotations {
    //start of class

    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for usps home page
    public static HomePage homepage(){
        HomePage homepage = new HomePage(driver);
        return  homepage;
    }//end

    //create static reference for send mail and packages page
    public static SendMailAndPackages sendMailAndPackages(){
        SendMailAndPackages sendMailAndPackages = new SendMailAndPackages(driver);
        return  sendMailAndPackages;
    }

}//end of class
