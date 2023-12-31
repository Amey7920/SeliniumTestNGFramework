package pageobjectmode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	public WebDriver driver;
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='login']");
	 private By tryForFree= By.xpath("//a[@id='signup_link']");
private By errorMessage= By.xpath("//div[@id='error']");
	 
	
	 public loginPageObjects(WebDriver driver) {
		  
		  this.driver=driver;
		 }
	public WebElement enterusername() {
		return driver.findElement(username);
				
	}
	
	public WebElement enterpassword() {
		return driver.findElement(password);
				
	}
	public WebElement ClickOnLogin() {
		return driver.findElement(login);
				
	}
	public WebElement clickontryForFree() {
		return driver.findElement(tryForFree);
		
	}
	public WebElement errorMessage() {
		return driver.findElement(errorMessage);
	}
	
}
