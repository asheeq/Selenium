package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapability {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer_x64_3.150.1/IEDriverServer.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
        capabilities.setCapability(InternetExplorerDriver.
                INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

        //it is used to initialize the IE driver
        WebDriver driver = new InternetExplorerDriver(capabilities);

        driver.manage().window().maximize();

        driver.get("http://gmail.com");

        driver.quit();
    }

}
