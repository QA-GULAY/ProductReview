package com.productreview.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.productreview.utilities.Driver.driver;

public class JavaScriptExecuter {
    public void scrollAndClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void doubleClick(WebElement element) {

        //cift click metodu
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
    }
}
