package ActionItem;

import Day9_010822.Reuseable_Actions;
import Express_Page_Object.BaseClass_Express;
import Reusable_Library.Reuseaable_Annotations;
import USPS_Page_Object.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AC_Express extends Reuseaable_Annotations {


    @Test
    public  void ExpressDataDriven() throws BiffException, IOException, InterruptedException, WriteException {
        //verify the welcome page title appears as expected
        logger.log(LogStatus.INFO,"Express - Men's & Women's Clothing");
        driver.navigate().to("https://www.express.com");


    // Step 1: read the data from the excel sheet you created
    Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
    //Step 2: locating the worksheet that you created for the workbook
    Sheet readableSheet = readableFile.getSheet(1);
        int rowCount = readableSheet.getRows();
        System.out.println("My readable row count is " + rowCount);


    //Step 3: create a writable file to mimic readable but you can also write back the results to this file
    WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Express.xls"),readableFile);
    WritableSheet writableSheet = writableFile.getSheet(1);
    //will return the physical rows present on the sheet

        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

            //click on women tab
            BaseClass_Express.homepage().getNavigationTabsCount();
            Reuseable_Actions.clickMethod(driver, "(//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING'])", "Women");

            //click on dresses
            Reuseable_Actions.clickMethod(driver, "(//*[@href='/womens-clothing/dresses/cat550007?ICID=WLP_DRESSES'])", "Dresses");
            Thread.sleep(2000);

        //scroll down to see all dresses
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by pixels
        jse.executeScript("scroll (0,550)");

        //click on second dress
        Reuseable_Actions.clickMethod(driver, "(//*[@class='_1vuRDTYH _3jxErwTw'])[1]", "Puff Sleeve Button Sweater Dress");
        Thread.sleep(3000);


        //Step 4: generated the for/while loop
        int i = 1;
        while( i < rowCount2){
        //store all lists as a variable
         String size = writableSheet.getCell(0,i).getContents();
         System.out.println("My values are " + size);

         String quantity = writableSheet.getCell(1,i).getContents();
         System.out.println("My values are " + quantity);

         String FirstName = writableSheet.getCell(2,i).getContents();
         System.out.println("My values are " + FirstName);

         String LastName = writableSheet.getCell(3,i).getContents();
         System.out.println("My values are " + LastName);

         String Email = writableSheet.getCell(4,i).getContents();
         System.out.println("My values are " + Email);

         String PhoneNumber = writableSheet.getCell(5,i).getContents();
         System.out.println("My values are " + PhoneNumber);

         String Address = writableSheet.getCell(6,i).getContents();
         System.out.println("My values are " + Address);

         String ZipCode = writableSheet.getCell(7,i).getContents();
         System.out.println("My values are " + ZipCode);

         String City = writableSheet.getCell(8,i).getContents();
         System.out.println("My values are " + City);

         String State = writableSheet.getCell(9,i).getContents();
         System.out.println("My values are " + State);

         String CardNumber = writableSheet.getCell(10,i).getContents();
         System.out.println("My values are " + CardNumber);

         String ExpMonth = writableSheet.getCell(11,i).getContents();
         System.out.println("My values are " + ExpMonth);

         String ExpYear = writableSheet.getCell(12,i).getContents();
         System.out.println("My values are " + ExpYear);

         String CVV = writableSheet.getCell(13,i).getContents();
         System.out.println("My values are " + CVV);

         //click on size tab
         Reuseable_Actions.clickMethod(driver,"(//*[@class='_1KGBycJLyQp_ZZYP6WGXGU'])", "Size Tab");

         //click on size
         Reuseable_Actions.sendKeysMethod(driver,"(//*[@class='_2lcJtgWzF0q05mVFExRmDq'])",size,"Size");

         //click add to bag
         Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF _1UL8jbSKi_lJk1h-uAQ0e _3pJe12e9WWrXBNv6H-DyNU _3AXg-5OJtmBBP6EuBMBV40'])", "Add To Bag");

         //click view bag
         Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF'])[1]", "View Checkout");
         Thread.sleep(3000);

         //select a quantity
          Reuseable_Actions.sendKeysMethod(driver, "(//*[@class='dropdown__select _3sadDDi3 inputInactive Sx8uIkYS'])",quantity,"Quantity");

          //click on checkout
          Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF ZyLrFzBKz1-AZgP7_PHxh'])", "Checkout");
          Thread.sleep(3000);

          //click on checkout as guest
          Reuseable_Actions.clickMethod(driver, "(//*[@class='_2nTo6fuj _3E9P5IPo _3Fy5Xenh _2UzsqcoIQ8eUCvNG8QMTC7'])", "Checkout As Guest");
          Thread.sleep(3000);

          //enter in first name
          Reuseable_Actions.sendKeysMethod(driver,"//*[@id='contact-information-firstname']",FirstName,"First Name");

          //enter in last name
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='lastname'] [1]",LastName,"Last Name");

          //enter in email address
          Reuseable_Actions.sendKeysMethod(driver,"//*[@class='_TKLSjzp inputInactive _3KB8SZPF7lPf148JgxwNqo'] [1]",Email,"Email Address");

          //confirm email address
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='confirmEmail']",Email,"Confirm Email Address");

          //enter in phone number
          Reuseable_Actions.sendKeysMethod(driver,"//*[@class='_TKLSjzp inputInactive _8IF_U1dpyCTtobUqknD2L']",PhoneNumber,"Phone Number");

          //click on continue for contact information
          Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF _20KKq5HTI3CGh1uB1f03zh'])", "Continue Contact Info");

          //enter in street address
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='shipping.line1']",Address,"Street Address");

          //enter zipcode
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",ZipCode,"Postal Code");

          //enter city
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='shipping.city']",City,"City");

          //enter state
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='shipping.state']",State,"State");

          //click on continue for shipping and billing address
          Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF _20KKq5HTI3CGh1uB1f03zh'])[1]", "Continue Shipping and Billing Address");

          //click on continue for delivery options
          Reuseable_Actions.clickMethod(driver, "(//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF _20KKq5HTI3CGh1uB1f03zh'])[2]", "Continue Delivery Options");

          //click on exp month
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='expMonth']",ExpMonth,"Exp Month");

          //click on exp year
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='expYear']",ExpYear,"Exp Year");

          //click on cvv
          Reuseable_Actions.sendKeysMethod(driver,"//*[@name='cvv'][2]",CVV,"CVV");

          //click on place order
          Reuseable_Actions.clickMethod(driver, "(//*[text()='Place Order'])", "Place Order");

            //capture the result
            String results = Reuseable_Actions.getTextMethod(driver,"//*[@class='_2paT8dZ2 _1gNCYBQ3']","Capture Result");
            String[] arrayResults = results.split(" ");

            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(14,i,arrayResults[1]);
            //I need to write back to the writable sheet
            writableSheet.addCell(label);




         //increment
            i = i+1;
        }//end of loop

        //step 6: writing back to the writable file to see
        writableFile.write();
        writableFile.close();

        driver.manage().deleteAllCookies();


    }//end of test

    }//end of class

