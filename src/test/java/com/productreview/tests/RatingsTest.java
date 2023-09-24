package com.productreview.tests;

import com.productreview.pages.CanonCameraPage;
import com.productreview.pages.HomePage;
import com.productreview.utilities.BaseTest;

import org.testng.annotations.Test;

public class RatingsTest extends BaseTest {
    @Test
    public void ratingsTest() {
        HomePage homePage=new HomePage();
        CanonCameraPage canonCameraPage=new CanonCameraPage();
        extentLogger = reports.createTest("Rating Test");
//        Kullanici Canon EOS 5D camera sayfasina girebilmeli
        homePage.cameraLink();
        extentLogger.info("camera asyfasini ac");

//         Kullanici urunle ilgili diger kullanicilarin derecelendirmelerini gorebilmeli
        canonCameraPage.star();
        extentLogger.info("Yildizlar secili ");
    }
}