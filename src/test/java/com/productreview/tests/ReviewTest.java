package com.productreview.tests;

import com.productreview.pages.HomePage;
import com.productreview.utilities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends BaseTest {
    @Test
    public void reviewTest() {
        HomePage homePage = new HomePage();
        extentLogger = reports.createTest("Reivews Test");
//        Kullanici Canon EOS 5D camera sayfasina girebilmeli
        homePage.cameraLink();
        extentLogger.info("camera asyfasini ac");
//         Kulanici “Review “ butonuna tiklayabilmeli
        homePage.reviewsButton();
        extentLogger.info("Reviews ac");

//         Kullanici urunle ilgili diger kullanicilarin yorumlarini gorebilmeli
        String expectedResult = "Reviews";
        String actualResult = homePage.setMessage();

        Assert.assertNotEquals(actualResult, expectedResult, "mesajlar esit");
    }
}
