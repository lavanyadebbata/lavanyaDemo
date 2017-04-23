package com.lavanya;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by maheshreddy on 19/04/2017.
 */
public class BaseMain {

    public static WebDriver driver;
    private final String BROWSER = "chrome";
    private final String URL = "http://www.argos.co.uk/";
    WebDriverWait wait = new WebDriverWait(driver, 10);


    public void openBrowser() {
        if (BROWSER.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (BROWSER.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (BROWSER.equals("ie")) {
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();
        }
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }


    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
