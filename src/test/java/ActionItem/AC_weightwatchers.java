package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AC_weightwatchers {


    public static void main(String[] args) throws InterruptedException {

        //search multiple zipcodes and eac time capture the search number from the result page

        // set an array
        String[] zipcodes = new String[3];
        zipcodes[0] = "11218";
        zipcodes[1] = "10462";
        zipcodes[2] = "10034";

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);


        for(int i = 0; i < zipcodes.length; i++) {
            //navigate to weightwatchers
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(2500);

            //click on drop down
            driver.findElement(By.xpath("//*[@class='MenuItem_menu-item__angle-wrapper__1XaUv']")).click();
            //Select Unlimited classes
            driver.findElement(By.xpath("(//*[text()='Unlimited Workshops'])[2]")).click();
            Thread.sleep(2500);

        }// end of for loop

    }//end of main

}//end of java