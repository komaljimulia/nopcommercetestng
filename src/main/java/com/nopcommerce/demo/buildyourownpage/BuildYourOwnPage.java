package com.nopcommerce.demo.buildyourownpage;

import com.nopcommerce.demo.desktoppage.DeskTopPage;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnPage extends Utility {
    public void veryFyAddToCart() throws InterruptedException {
        String expectedMessage="Build your own computer";
        String actualMessage=getTextFromElement(By.xpath("//div[@class='overview']/div/child::h1"));//copied this code from mruganki
        Assert.assertEquals(expectedMessage,actualMessage);
        selectByVisibleTextFromDropDown(By.id("product_attribute_1"),"2.2 GHz Intel Pentium Dual-Core E2200");
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"),"8GB [+$60.00]");//dropdown select from 8GB
        clickOnElement(By.id("product_attribute_3_7"));//select 8GB
        clickOnElement( By.id( "product_attribute_4_9" ) ); //select vista premium
        clickOnElement( By.id( "product_attribute_5_12" ) );//select commander radio button
        clickOnElement(By.id("product_attribute_5_12"));//click on total commander
        Thread.sleep(3000);
        String expectedTotal = "$1,475.00";          //Verify Total
        String actualTotal = getTextFromElement( By.xpath( "//span[text()='$1,475.00']" ) );
        System.out.println("Print actualTotal="+ actualTotal);
        Assert.assertEquals( expectedTotal,actualTotal );
        clickOnElement( By.id( "add-to-cart-button-1" ) );  //click on add to cart
        String expectedLastMessage= "The product has been added to your shopping cart";
        String actualLastMessage = getTextFromElement( By.xpath( "//*[@id=\"bar-notification\"]/div/p" ) );
        Assert.assertEquals( expectedLastMessage,actualLastMessage );

    }




}
