package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Parallel {
    @Test(groups={"executeSessionOne-Group"})
    public void executeSessionOne(){
        //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://www.google.com/");
        //find user name text box and fill it
        //driver.findElement(By.name("uid")).sendKeys("Driver 1");
        driver.close();

    }

    @Test(groups={"executeSessionTwo-Group"})
    public void executeSessionTwo(){
        //Second session of WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://www.google.com/");
        //find user name text box and fill it
        //driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.close();
    }

    @Test(groups={"executeSessionThree-Group"})
    public void executeSessionThree(){
        //Third session of WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://www.google.com/");
        //find user name text box and fill it
        //driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.close();
    }
}
