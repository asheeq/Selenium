package wikipediatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class Wikipedia {

    private static WebDriver driver;
    private static final String driverPath = "drivers/chromedriver.exe";
    private String baseUrl = "https://www.wikipedia.org";
    private String searchKeyword = "Random";
    private final String searchLocator = "//*[@id=\"search-form\"]/fieldset/button";
    private String languageChangeValue = "bn";
    //private String expectedUrl = "https://de.wikipedia.org/wiki/Random";


    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void browseWikipedia()  {
        driver.get(baseUrl);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Wikipedia");
        Select language = new Select(driver.findElement(By.id("searchLanguage")));
        language.selectByValue(languageChangeValue);
        driver.findElement(By.id("searchInput")).sendKeys(searchKeyword);
        driver.findElement(By.xpath(searchLocator)).click();
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.startsWith("\""+searchKeyword+"\""));
        //String actualUrl = driver.getCurrentUrl();
        //Assert.assertEquals(actualUrl, expectedUrl);
        //Assert.assertEquals(actualTitle, "Random – Wikipedia");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}