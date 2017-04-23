package com.lavanya;

import org.openqa.selenium.By;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class MyTrollyPage extends BaseMain {
    public String getTxtOnBasket() {
        String actual = driver.findElement(By.cssSelector(".columns.twelve>h1")).getText();
        return actual;
    }


}
