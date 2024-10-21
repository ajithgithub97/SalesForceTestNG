package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceEdit;

public class TC_002EditSalesForce extends BaseClass{
	
	
	@Test
	public void runEditSalesForce() throws InterruptedException {
		new SalesForceEdit(driver)
		.editSalesForce();

	}
}
