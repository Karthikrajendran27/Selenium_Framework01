package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(String firstName, String lastName, String postCode, String alerttext) throws InterruptedException {
		click("addCustBtn_CSS");
		type("lastname_CSS",firstName);
		type("firstname_CSS",lastName);
		type("postcode_CSS",postCode);
		click("addBtn_CSS");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
		
		
	
	}
	
	
}
