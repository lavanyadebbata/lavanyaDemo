package com.lavanya;

import org.openqa.selenium.By;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class BigEventPage extends BaseMain {



    public void clickOnShopAll(){
        driver.findElement(By.linkText("Shop all")).click();
        sleep(20000);
    }
}
