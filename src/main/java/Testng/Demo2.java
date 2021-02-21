package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

    @Test
    public void run(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("The Browser is opened now!");
        driver.manage().window().maximize();
        Reporter.log("The Browser is maximized!");
        driver.get("https://www.google.com/");
        Reporter.log("Google website is opened!");
        driver.findElement(By.name("q")).sendKeys("Hi");
        Reporter.log("Hi has been sent");
        driver.close();


    }
}
