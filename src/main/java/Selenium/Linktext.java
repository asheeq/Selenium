package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());

        //Partial link

        String baseUrl2 = "http://demo.guru99.com/test/accessing-link.html";

        driver.get(baseUrl2);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());

        //Case-sensitivity

        String baseUrl3 = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl3);
        String theLinkText = driver.findElement(By
                .partialLinkText("egis"))
                .getText();
        System.out.println(theLinkText);
        theLinkText = driver.findElement(By
                .partialLinkText("EGIS"))
                .getText();
        System.out.println(theLinkText);

        //Link with Scope

        String baseUrl4 = "http://demo.guru99.com/test/block.html";

        driver.get(baseUrl4);
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        driver.quit();


    }
}