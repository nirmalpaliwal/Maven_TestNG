package mavenintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenBasics {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Upcasting//browser driver path pick and set up in backend bydefault
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();


    }


}
