package testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodAnnotation {

    public WebDriver driver;

    @BeforeMethod //(Prerequisite) this method will execute before exeute each of the test case
    public void beforeMethodDemo() {
        driver = new ChromeDriver(); //Upcasting//browser driver path pick and set up in backend bydefault
    }

    @AfterMethod //(Postrequisite)this method will execute after exeute each of the test case
    public void afterMethodDemo() {
        driver.close();
    }

    @Test
    public void verifyOpenUrlTcs() {
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyOpenUrlAmazon() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        // Assert.assertFalse(true);//Assert.assertTrue(false);


    }

    @Test
    public void verifyOpenUrlFlipkart() {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

    }
}
