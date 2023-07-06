package testcases;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmode.loginPageObjects;
import resources.BaseClass;
public class LoginTestCase extends BaseClass {
	@Test
	 public void verifyLogin() throws IOException {
	  
	  initializeDriver();
	  driver.get("https://login.salesforce.com/");
	  loginPageObjects lpo = new loginPageObjects(driver);
	 lpo.enterusername().sendKeys("test");
	 lpo.enterpassword().sendKeys("secure123");
	 lpo.ClickOnLogin().click();

	}
}
