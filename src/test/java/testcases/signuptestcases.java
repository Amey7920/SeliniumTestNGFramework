package testcases;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmode.loginPageObjects;
import pageobjectmode.signupPageObjects;
import resources.BaseClass;

public class signuptestcases extends BaseClass{
	@Test
	public void veriftsignup() throws IOException,InterruptedException {
	initializeDriver();
	 driver.get("https://login.salesforce.com/");
	 loginPageObjects lpo= new loginPageObjects(driver);
	lpo.clickontryForFree().click();
	
	signupPageObjects spo= new signupPageObjects(driver);
	Thread.sleep(5000);
	spo.enterFirstName().sendKeys("test");
	spo.enterLastName().sendKeys("secure123");
	spo.enterJobTitle().sendKeys("BA");
	spo.clickOnNextButton().click();
	
	WebElement a=spo.selectEmployees();
	Select s= new Select(a);
	s.selectByIndex(2);
}
}