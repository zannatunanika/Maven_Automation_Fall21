package ActionItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AC_Bing {

    public static void main(String[] args) throws InterruptedException {

        //search multiple cities and eac time capture the search number from the result page

        // set an array
        String[] sports = new String[6];
        sports[0] = "Soccer";
        sports[1] = "Tennis";
        sports[2] = "Football";
        sports[3] = "Cricket";
        sports[4] = "Badminton";
        sports[5] = "Softball";

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        for(int i = 0; i < sports.length; i++){
            //simply open the bing website
            //simply open the bing website

        driver.navigate().to("https://www.bing.com");

        //anytime when you go to a new page you should put some wait statement
        Thread.sleep(2000);
        System.out.println("navigated to bing");

        //searching for cars on bing search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports[i]);

        //hit submit on bing search button
        driver.findElement(By.xpath("//*[@class='search icon tooltip']")).submit();

        //another wait statement since we came to anew page(result page)
        Thread.sleep(3000);

        //capture the search result and store it as a variable
        String result = driver.findElement(By.xpath("//*[@data-bm='4']")).getText();
        //declaring the array variable to split the result
        String[] arrayResult = result.split(" ");
        //now print the search number only
        System.out.println("My search number for sport " + sports[i] + " is " + arrayResult[1]);

    }//end of for loop
    //quit will be defined outside of loop because you are quitting only once at the end
        driver.quit();




}//end of main

}//end of java
