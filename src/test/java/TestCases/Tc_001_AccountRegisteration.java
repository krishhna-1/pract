package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseClass;

public class Tc_001_AccountRegisteration extends BaseClass  {
	
	@Test
	void test_accountRegisteration() {
		try {
			logger.info("Starting test");
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			
		} catch (Exception e) {
			Assert.fail();
		}
		
	}
}
