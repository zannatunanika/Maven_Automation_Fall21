package Express_Page_Object;

import Reusable_Library.Reuseaable_Annotations;
import USPS_Page_Object.HomePage;
import USPS_Page_Object.SendMailAndPackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_Express extends Reuseaable_Annotations {

    public BaseClass_Express(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for usps home page
    public static HomePage homepage(){
        HomePage homepage = new HomePage(driver);
        return  homepage;
    }

    //create static reference for dresses
    public static SendMailAndPackages sendMailAndPackages(){
        SendMailAndPackages sendMailAndPackages = new SendMailAndPackages(driver);
        return  sendMailAndPackages;
    }


}//end of class
