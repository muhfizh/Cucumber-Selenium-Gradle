package com.muhfizh;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    protected static WebDriver driver;

    protected void getDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm=usage");
        options.addArguments("--remote-allow=origin=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
    }


}