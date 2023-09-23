package com.productreview.utilities;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static com.productreview.utilities.Driver.driver;


public class BrowserUtils {
    public static void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait(2);
    }

    public static void wait(int secs) {
        try {
            Thread.sleep(1000L * secs);
        } catch (InterruptedException | NoSuchElementException | StaleElementReferenceException |
                 ElementClickInterceptedException e) {
            e.printStackTrace();
        }
    }

    //    static WebDriverManager driver;
    // scroll method
    public void scrollAndClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void doubleClick(WebElement element) {

        //double click method
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
    }

}


