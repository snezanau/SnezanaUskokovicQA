package tests;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    
        public static WebDriver driver;
        public static WebDriverWait wait;
        public String baseURL;
    
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            baseURL = "https://magento.softwaretestingboard.com/";
            driver.get(baseURL);
    
    
        }
    
    
        @After
    
        public void endTest() {
            driver.quit();
    
        }
    }
    
