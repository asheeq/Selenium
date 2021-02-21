package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
    WebDriver driver;
    public static final String driverPath = "Drivers/geckodriver-v0.29.0-win64/geckodriver.exe";


    // Method 1: Open Browser say Firefox
    @Test (priority=1)
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
    }

    // Method 2: Launch Google.com
    @Test (priority=2)
    public void launchGoogle() {
        driver.get("https://www.google.com");
    }

    // Method 3: Perform a search using "Facebook"
    @Test (priority=3)
    public void peformSeachAndClick1stLink() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@title='সার্চ করুন']")).sendKeys("Facebook");
        Thread.sleep(3000);
    }

    // Method 4: Verify Google search page title.
    @Test (priority=4)
    public void FaceBookPageTitleVerification() throws Exception {
        driver.findElement(By.xpath(".//*[@class='gNO89b']")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
    }
}