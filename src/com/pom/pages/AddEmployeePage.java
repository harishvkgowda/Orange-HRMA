package com.pom.pages;

/**
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.pages.HomePage;

/**
 * @author Harish
 *
 */
public class AddEmployeePage extends HomePage {

	public AddEmployeePage(WebDriver driver) {
		super(driver);
	}
@FindBy(id="firstName")
private WebElement firstnameTextBox;

@FindBy(id="lastName")
private WebElement lastnameTextBox;

@FindBy(id="btnSave")
private WebElement saveButton;

public void setFirstname(String fn){
	firstnameTextBox.sendKeys(fn);
}
public void setLastname(String ln){
	lastnameTextBox.sendKeys(ln);
}
public void clickSave(){
	saveButton.click();
}
}