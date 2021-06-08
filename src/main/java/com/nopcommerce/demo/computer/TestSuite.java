package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.homepage.TopMenuPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TopMenuPage {
    public void clickOnComputerAndDesktopAndSortByZToA() throws InterruptedException {
        selectMenu("Computers");//click on computer
        Thread.sleep(2000);
        clickOnElement( By.xpath( "//div[@class='item-grid']/div/div//a[text()=' Desktops ']" ) );//click on desktop
        selectByVisibleTextFromDropDown( By.id( "products-orderby" ),"Name: Z to A" );//select z to a from dropdown
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']/div/div/div[2]/child::h2"));
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList){
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList,Collections.reverseOrder());
        Collections.sort( productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
       Assert.assertEquals( productName,tempList );

    }

}
