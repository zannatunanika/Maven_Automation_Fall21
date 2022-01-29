package ActionItem;

import Day9_010822.Reuseable_Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AC_TestNG {
    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reuseable_Actions.setDriver();
        //navigate hulu home page
        driver.navigate().to("https://www.hulu.com");
        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }
    }//end of precondition

    @Test(priority = 1)
    public void SearchForAKeyword() {
        JavascriptExecutor jsee = (JavascriptExecutor) driver;

        jsee.executeScript("scroll (0 ,3000)");

        //click on Select
        Reuseable_Actions.clickMethod(driver, "//*[@class='button--cta button--black plan-card__cta plan-card__0_cta button--black ']", "Select");


        //emails
        ArrayList<String> emails = new ArrayList<>();
        emails.add("samiu15886@yahoo.com");

        for (int i = 0; i < emails.size(); i++) {
            //entering a unique keyword from array list
            Reuseable_Actions.sendKeysMethod(driver, "//*[@id='email']", emails.get(i), "EMAIL");
        }

        //enter in password
        Reuseable_Actions.sendKeysMethod(driver,"//*[@id='password']","Basketball15!","PASSWORD");

        //enter in name
        Reuseable_Actions.sendKeysMethod(driver,"//*[@id='firstName']","Bob","NAME");

        //click on dropdown for birthMonth
        Reuseable_Actions.clickMethod(driver, "(//*[@class='selector-selected input__text placeholder'])[1]", "Month");

        //Click on a month
        Reuseable_Actions.clickMethod(driver, "//*[@id='birthdayMonth-item-0']", "January");

        //click on dropdown for birthDay
        Reuseable_Actions.clickMethod(driver, "(//*[@class='selector-selected input__text placeholder'])[1]", "Day");

        //Click on a Day
        Reuseable_Actions.clickMethod(driver, "//*[@id='birthdayDay-item-26']", "27");

        //click on dropdown for birthYear
        Reuseable_Actions.clickMethod(driver, "(//*[@class='selector-selected input__text placeholder'])[1]", "Year");

        //Click on a Year
        Reuseable_Actions.clickMethod(driver, "(//*[text()='1986'])[1]", "1986");

        //click on dropdown for gender
        Reuseable_Actions.clickMethod(driver, "(//*[@class='selector-selected input__text placeholder'])[1]", "Gender");

        //Click on a gender
        Reuseable_Actions.clickMethod(driver, "//*[@value='f']", "Female");


        //scroll down to see all buttons
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by pixels
        jse.executeScript("scroll (0,200)");


        //click on Continue
        Reuseable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "CONTINUE");

        //subscription amount

        {String result = Reuseable_Actions.getTextMethod(driver,"//*[@class='ledger__price']","6.99");
        String[] arrayResult = result.split(" ");
        System.out.println("My subscription amount is " + arrayResult[1]);}

        //capture text "Total Due Today"
        { String result = Reuseable_Actions.getTextMethod(driver,"//*[@class='summary__price']","0.00");
        String[] arrayResult = result.split(" ");
        System.out.println("The amount due today is " + arrayResult[1]);}


    }//end of test 1







}//end of class
