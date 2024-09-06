package testngbasic;


import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NeedOfTestNG {
    //Whenever We want to define test case in TestNG We have to use annotation(@Test)

    @Test
    public void openUrl1(){
        WebDriver driver = new ChromeDriver(); //Upcasting//browser driver path pick and set up in backend bydefault
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
		System.out.println("Hello git");
       

    }
    @Test
    public void openUrl2(){
        WebDriver driver = new ChromeDriver(); //Upcasting//browser driver path pick and set up in backend bydefault
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
       // Assert.assertFalse(true);//Assert.assertTrue(false);
        driver.close();

    }
    @Test
    public void openUrl3(){
        WebDriver driver = new ChromeDriver(); //Upcasting//browser driver path pick and set up in backend bydefault
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}

    /*<plugins>

        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.5.0</version>
            <configuration>
                <suiteXmlFiles>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
            </configuration>
        </plugin>

    </plugins>*/