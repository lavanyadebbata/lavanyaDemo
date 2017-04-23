package com.lavanya;

import org.openqa.selenium.By;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class ProductDescriptionPage extends BaseMain{


    public void add2Trolly() {
        driver.findElement(By.cssSelector(".btn.btn-primary.add-to-trolley-cta")).click();
       // sleep(20000);
    }


    public void go2Trolly() {
        driver.findElement(By.cssSelector(".btn.btn-primary.hidden-xs")).click();
        //sleep(2000);
    }
}
