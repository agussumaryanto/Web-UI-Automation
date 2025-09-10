package saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected static WebDriver driver;

    protected void getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // headless used for pipeline or CI/CD (browser couldn't appear)

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
    }

}
