package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.buildyourownpage.BuildYourOwnPage;
import com.nopcommerce.demo.computer.TestSuite;
import com.nopcommerce.demo.desktoppage.DeskTopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class BuildYourOwnTest extends TestBase {
    TestSuite computersPage = new TestSuite();
    DeskTopPage shoppingCartPage = new DeskTopPage();//calling desktop class hear
    BuildYourOwnPage buildYourOwnPage=new BuildYourOwnPage();
   @Test

    public void veryFyAddToCartAndShowMessage() throws InterruptedException {
       computersPage.clickOnComputerAndDesktopAndSortByZToA();
       shoppingCartPage.verifyProductAddedToShoppingCartSuccessFully();
        buildYourOwnPage.veryFyAddToCart();

    }


}
