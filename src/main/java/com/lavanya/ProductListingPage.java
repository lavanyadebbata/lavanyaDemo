package com.lavanya;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maheshreddy on 23/04/2017.
 */
public class ProductListingPage extends BaseMain{

    public void selectAnyProduct() {
        wait.until(ExpectedConditions.textToBe(By.className(".text-center.search-title__term"),"Nike"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className(".row.no-gutter"),30));

        List<WebElement> allProducts = driver.findElements(By.cssSelector(".row.no-gutter"));
        allProducts.get(1).click();
        //sleep(20000);
    }

    public void selectLow2HighFromSortBy() {
        Select select = new Select(driver.findElement(By.cssSelector(".form-control.sort-select")));
        select.selectByValue("price_asc");
        sleep(1000);
    }


    public List<Double> getAllProductsPrices() {
        List<WebElement> allPrices = driver.findElements(By.cssSelector(".price-now"));
        List<Double> pricelist = new ArrayList<Double>();
        for (WebElement price : allPrices)
            pricelist.add(Double.parseDouble(price.getText().replace("£", "")));
        System.out.println("list of prices " + pricelist);
        return pricelist;
    }

    public String getProductText() {
        return driver.findElement(By.cssSelector(".text-center.search-title__term")).getText();
    }


    public String getTextOnPriceDropPage(){
        return driver.findElement(By.cssSelector(".text-center.search-title__term")).getText();
    }

}
