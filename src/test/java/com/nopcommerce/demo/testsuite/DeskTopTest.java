package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.desktoppage.DeskTopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class DeskTopTest extends TestBase {
    DeskTopPage shoppingCartPage = new DeskTopPage();//calling desktop class hear
    @Test
    public void clickOnComputersAndDesktopAndSortByAtoZ() throws InterruptedException {
        shoppingCartPage.verifyProductAddedToShoppingCartSuccessFully();
    }
}
