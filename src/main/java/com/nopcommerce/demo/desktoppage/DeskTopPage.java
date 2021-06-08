package com.nopcommerce.demo.desktoppage;

import com.nopcommerce.demo.computer.TestSuite;
import org.openqa.selenium.By;

public class DeskTopPage extends TestSuite {
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        selectMenu( "Computers" );
        Thread.sleep( 1000 );
        clickOnElement( By.xpath( "//div[@class='item-grid']/div/div//a[text()=' Desktops ']" ) );  //click on desktop
        selectByVisibleTextFromDropDown( By.id( "products-orderby" ),"Name: A to Z" );      //select 'A to Z'
        Thread.sleep( 1000 );
        clickOnElement( By.xpath( "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]" ) );



    }
}
