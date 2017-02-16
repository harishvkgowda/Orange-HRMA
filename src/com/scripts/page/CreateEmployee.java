package com.scripts.page;

import generics.Excel;

import org.testng.annotations.Test;

import com.base.pages.BaseTest;
import com.pom.pages.AddEmployeePage;
import com.pom.pages.DashboardPage;
import com.pom.pages.EmployeePersonalDetailsPage;


public class CreateEmployee extends BaseTest {
	 @Test
	 public void testCreateEmployee()
	 { 
		 for(int i=1;i<=Excel.getRowCount(INPUT_PATH, "CreateEmployee");i++){
		 //click on PIM
		 DashboardPage dbPage=new DashboardPage(driver);
		 dbPage.clickPIM_Menu();
		 //click on Add Emp
		 dbPage.clickAddEmp_Menu();
		 //verify AddEmpPage
		 AddEmployeePage aePage=new AddEmployeePage(driver);
		 aePage.verifyURLhas("addEmployee");
		 //enter valid FN
		 String fn = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 1);
		 aePage.setFirstname(fn);
		 //enter valid LN
		 String ln = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 2);
		 aePage.setLastname(ln);
		 //click on Save
		 aePage.clickSave();
		 //verify Emp Personal Details page
	 EmployeePersonalDetailsPage epdPage=new EmployeePersonalDetailsPage(driver);
		 epdPage.verifyURLhas("viewPersonalDetails");
		 //verify the FN
		 epdPage.verifyFirstname(fn);
	 }
  }
}
