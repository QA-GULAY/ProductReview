package com.productreview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{
   @FindBy (xpath="//a[text()='Canon EOS 5D']")
   private WebElement cameraLink;
   @FindBy (xpath = "(//a[@data-toggle='tab'])[2]")
   private WebElement reviewsButton;

   @FindBy(xpath = "//p[text()='There are no reviews for this product.']")
   private WebElement message;

   //********Metodlar************//
   public void cameraLink(){
      cameraLink.click();
   }

   public void reviewsButton(){
      reviewsButton.click();

   }

   public String setMessage(){
      message.getText();
      return getText(message);
   }

}
