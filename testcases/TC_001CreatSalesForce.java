package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceCreat;

public class TC_001CreatSalesForce extends BaseClass {
    @Test
	public void runCreatSalesForce() throws InterruptedException {
		new SalesForceCreat(driver)
		.creatsalesforce();
		
		

	}
}
