package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1 Set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2 Creat instance/object of the Selenium WebDriver

        WebDriver driver = new ChromeDriver();

        // 3 Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

       //Get the title of the page

        String currentTitle = driver.getTitle();

        // Stop code executions for 3 seconds
        Thread.sleep(3000);


        //use selenium to navigate back
        driver.navigate().back();

        // Stop code executions for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // Stop code executions for 3 seconds
        Thread.sleep(3000);

        // use selenium to refresh the page
        driver.navigate().refresh();

        // Stop code executions for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate().to():

        driver.navigate().to("https://www.google.com");

        // get the current title after getting the google page

        currentTitle = driver.getTitle();

       // System.out.println("driver.getTitle()= "+driver.getTitle());

        System.out.println("CurrentTitle = "+currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println("CurrentURl = "+ currentURL);



    }
}
