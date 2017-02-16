package com.pom.pages;

/**
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.pages.HomePage;

/**
 * @author Harish
 *
 */
public class EmployeePersonalDetailsPage extends HomePage {

	public EmployeePersonalDetailsPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id="personal_txtEmpFirstName")
private WebElement firstnameTextBox;

@FindBy(id="personal_txtEmpLastName")
private WebElement lastnameTextBox;

public void verifyFirstname(String expectedFirstname){
	String actualFirstname = firstnameTextBox.getAttribute("value");
	Assert.assertEquals(actualFirstname, expectedFirstname);

}
}

