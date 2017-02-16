package com.scripts.page;

/**
 * 
 */


import generics.Excel;

import org.testng.annotations.Test;

import com.base.pages.BaseTest;
import com.pom.pages.DashboardPage;
import com.pom.pages.EmployeeListPage;

/**
 * @author Harish
 *
 */
public class DeleteEmployee extends BaseTest{
	@Test
	public void testDeleteEmployee(){
//click on PIM
		for(int i=1;i<=Excel.getRowCount(INPUT_PATH, "DeleteEmployee");i++){
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPIM_Menu();
// verify PIM page is displayed or not
		dbPage.verifyURLhas("pim/viewEmployeeList");
//Select the checkbox of the employee to be removed
		EmployeeListPage elPage=new EmployeeListPage(driver);
		String fn = Excel.getCellValue(INPUT_PATH, "DeleteEmployee", i, 1);
		elPage.selectEmployee(fn);
//Delete the selected employee
		elPage.deleteEmployee();
//click ok on the confirmation popup
		elPage.clickOkOnPopupMessage();
//verify that deleted employee is not present in the list
		boolean result = elPage.VerifyEmployeedeleted(fn);
		if(result==true)
			log.info("Fail:Employee not deleted");
		else
			log.info("Pass:Employee deleted sucessfully");
  }
 }
}
