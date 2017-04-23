package com.lavanya;

import org.openqa.selenium.By;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class HeaderPage extends BaseMain {

    public void clickOnPriceDropButton() {
        driver.findElement(By.cssSelector(".font-argos-condensed-extra-bold.text-uppercase.text-center.header-link-bau.header-link-bau-margin")).click();
        sleep(20000);
    }
}
