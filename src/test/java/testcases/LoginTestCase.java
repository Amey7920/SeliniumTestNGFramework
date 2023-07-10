package testcases;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobjectmode.loginPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.constant;
public class LoginTestCase extends BaseClass {
	@Test (dataProvider="testData")
	 public void verifyLogin(String username, String password) throws IOException {
	 
	 
	  loginPageObjects lpo = new loginPageObjects(driver);
	 lpo.enterusername().sendKeys(username);
	 lpo.enterpassword().sendKeys(password);
	 lpo.ClickOnLogin().click();
	 commonMethods.verifyAssertions(lpo.errorMessage(), constant.expectedTextErrorMSg, "Valid Error message is not showing");
	
	}
	
	 @DataProvider
	 public Object[][] testData() {  
	  Object[][] data=new Object[3][2]; 
	  data[0][0]=constant.username1; //1st username
	  data[0][1]=constant.password1;// 1st password
	  data[1][0]=constant.username2; //2nd username
	  data[1][1]=constant.password2; //2nd password
	  data[2][0]=constant.username3; //3rd username
	  data[2][1]=constant.password3;  //3rd password
	  
	  return data;
}
}
