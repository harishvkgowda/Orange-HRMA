package com.pom.pages;

/**
 * 
 */


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.pages.HomePage;

/**
 * @author Harish
 *
 */
public class EmployeeListPage extends HomePage{
	public EmployeeListPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="btnDelete")
	private WebElement deleteButton;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement okButton;
	
	public void selectEmployee(String name){
		WebElement chbox = driver.findElement(By.xpath("//a[.='"+name+"']/../..//td[1]/input"));
		chbox.click();
	}
	public void deleteEmployee(){
		deleteButton.click();
	}
	
	public void clickOkOnPopupMessage(){
		okButton.click();
	}
	public boolean VerifyEmployeedeleted(String name){
		try{
			WebElement chbox = driver.findElement(By.xpath("a[.='"+name+"']//../..//td[1]/input"));
		chbox.click();
		return true;
		}
		catch(NoSuchElementException e){
			return false;
		}
	}
}
