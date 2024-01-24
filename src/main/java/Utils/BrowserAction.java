package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserAction {

        public static WebDriver driver =new ChromeDriver();

        @BeforeMethod
        public String openBrowser(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://eservices.rs.ge/Registration.aspx");
            return null;
        }

        @AfterMethod
        public static void closeBrowser(){
            driver.quit();
        }

    }


