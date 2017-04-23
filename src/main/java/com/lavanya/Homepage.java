package com.lavanya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class Homepage extends BaseMain {

    public void searchProduct(String item) {
        driver.findElement(By.id("searchTerm")).sendKeys(item);
        driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);

     //   sleep(2000);

    }

    public void clickOnBigRedEventTab() {
        driver.findElement(By.className("header-big-link")).click();
        sleep(20000);
    }
}
