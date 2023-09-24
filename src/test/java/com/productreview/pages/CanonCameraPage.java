package com.productreview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CanonCameraPage extends PageObject {

    @FindBy(xpath = "//span[@class='fa fa-stack']")
    private   List<WebElement> stars;

    //********Methods************//

    public  List<WebElement> star() {

        for (WebElement star : stars) {
            System.out.println("star = " + star.isSelected());
            Assert.assertFalse(star.isSelected(), "Stars selected");
        }
        return stars;
    }

}



