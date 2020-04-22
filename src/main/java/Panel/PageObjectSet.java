package Panel;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PageObjectSet {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static ChromeOptions driverOptions;
    public static ChromeDriver chromeDriver;
    public static Actions action;

    @Before
    public void setUp(){
/*        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<Host:port>");*/
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--log-level=3");
        chromeOptions.addArguments("--silent");
/*
        chromeOptions.addArguments("enable-automation");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-browser-side-navigation");
        chromeOptions.addArguments("--disable-gpu");
*/

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driverWait = new WebDriverWait(driver, 20);

        driver.get("https://bluemedia.pl/kontakt");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
    }
    @After
    public void closeDown(){
        driver.close();
        driver.quit();
    }
}
