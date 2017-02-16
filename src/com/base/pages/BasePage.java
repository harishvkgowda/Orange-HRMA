package com.base.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Utility;

public abstract class BasePage {
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
 
  public BasePage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  public void verifyURLhas(String expectedUrl){
	  WebDriverWait wait= new WebDriverWait(driver,timeout);
	  wait.until(ExpectedConditions.urlContains(expectedUrl));
  }
 
}
