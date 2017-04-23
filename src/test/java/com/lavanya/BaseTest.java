package com.lavanya;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by maheshreddy on 07/04/2017.
 */
public class BaseTest {

    BaseMain baseMain=new BaseMain();
    @Before
    public void setUp(){
        baseMain.openBrowser();
    }

    @After
    public void tearDown(){
        baseMain.closeBrowser();
    }


}
