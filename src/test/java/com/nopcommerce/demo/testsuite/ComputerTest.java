package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.computer.TestSuite;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    TestSuite computersPage = new TestSuite();
    @Test
    public void clickOnDesktopAndSortByZtoA() throws InterruptedException {
        computersPage.clickOnComputerAndDesktopAndSortByZToA();

    }
}
