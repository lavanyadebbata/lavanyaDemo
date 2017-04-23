package com.lavanya;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by maheshreddy on 07/04/2017.
 */
public class SmokeTestSuite extends BaseTest {


    Homepage homepage = new Homepage();
    ProductListingPage listingPage = new ProductListingPage();

    @Test
    public void searchTest() {
        homepage.searchProduct("adidas");
        String actual = listingPage.getProductText();
        String expected = "Nike";
        Assert.assertEquals(expected, actual);
        System.out.println("hi");
    }
}
