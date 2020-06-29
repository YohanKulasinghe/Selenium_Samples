package net.phptravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PHPTravelsLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/admin");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {

    }
}
