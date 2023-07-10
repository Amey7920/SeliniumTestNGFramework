package testcases;
import java.io.IOException;
import org.testng.annotations.Test;

import pageobjectmode.loginPageObjects;
import pageobjectmode.signupPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.constant;

public class signuptestcases extends BaseClass{
	@Test
	public void verifysignup() throws IOException,InterruptedException {
	
	 loginPageObjects lpo= new loginPageObjects(driver);
	lpo.clickontryForFree().click();
	
	signupPageObjects spo= new signupPageObjects(driver);
	Thread.sleep(5000);
	spo.enterFirstName().sendKeys(constant.firstName);
	spo.enterLastName().sendKeys(constant.lastName);
	spo.enterJobTitle().sendKeys(constant.jobTitle);
	spo.clickOnNextButton().click();
	commonMethods.selectDropdown(spo.selectEmployees(), 2);
	spo.entercompanyname().sendKeys("test");
	commonMethods.selectDropdown(spo.selectcountry(), 4);
	spo.clickOnNextButton().click();
	commonMethods.selectDropdownWithVisbleTExt(spo.selectcountry(), "india");
	spo.clickOnNextButton().click();
	commonMethods.verifyAssertions(spo.SignuppageConfirmation(),constant.expectedTextSignupText,"valid signup text is not visible" );
	
	
	}
}