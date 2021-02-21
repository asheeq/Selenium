package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String innerText = driver.findElement(
                By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(innerText);

        //Nested Table

        String baseUrl2 = "http://demo.guru99.com/test/accessing-nested-table.html";

        driver.get(baseUrl2);
        String innerText2 = driver.findElement(
                By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
        System.out.println(innerText2);

        //Attribute as Predicates

        String baseUrl3 = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl3);
        String innerText3 = driver.findElement(By
                .xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
                .getText();
        System.out.println(innerText3);

        //Inspect Element

        String baseUrl4 = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl4);
        String innerText4 = driver.findElement(By
                .xpath("//table/tbody/tr/td[2]"
                        + "//table/tbody/tr[4]/td/"
                        + "table/tbody/tr/td[2]/"
                        + "table/tbody/tr[2]/td[1]/"
                        + "table[2]/tbody/tr[3]/td[2]/font"))
                .getText();
        System.out.println(innerText4);
        driver.quit();

    }
}

