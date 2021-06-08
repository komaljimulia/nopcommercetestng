package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.homepage.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage= new TopMenuPage();
    @Test
    public void selectTopMenuPage(){
        topMenuPage.selectMenu("Apparel");
    }
}
