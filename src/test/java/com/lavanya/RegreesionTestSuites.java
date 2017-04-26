package com.lavanya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import com.google.common.collect.Ordering;

public class RegreesionTestSuites extends BaseTest {


    Homepage homepage=new Homepage();
    ProductListingPage listingPage =new ProductListingPage();
    ProductDescriptionPage descriptionPage =new ProductDescriptionPage();
    MyTrollyPage trollyPage=new MyTrollyPage();
    HeaderPage headerPage =new HeaderPage();
    BigEventPage eventPage=new BigEventPage();

    @Test
    public void basketTest() {
        homepage.searchProduct("nike");
        listingPage.selectAnyProduct();
        descriptionPage.add2Trolly();
        descriptionPage.go2Trolly();
        String actual = trollyPage.getTxtOnBasket();
        String expected = "My Trolley";
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void lowToHigtSortTest() {
        homepage.searchProduct("puma");
        listingPage.selectLow2HighFromSortBy();
        List<Double> pricelist = listingPage.getAllProductsPrices();
        Boolean condition = Ordering.natural().isOrdered(pricelist);
        System.out.println("is in order or not: " + condition);
        Assert.assertTrue(condition);
    }

    @Test
    public void dropPriceTest() {
        headerPage.clickOnPriceDropButton();
        homepage.clickOnBigRedEventTab();
        eventPage.clickOnShopAll();
        String actual = listingPage.getTextOnPriceDropPage();
        String ecpected = "Shop All Big Red Event";
        Assert.assertEquals(ecpected, actual);
    }
}
