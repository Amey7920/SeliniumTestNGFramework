package pageobjectmode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class signupPageObjects {
	public WebDriver driver; //This driver dont have scope;

	 private By firstName = By.xpath("//input[@name='UserFirstName']");

	 private By lastName = By.xpath("//input[@name='UserLastName']");
	 
	 private By jobTitle = By.xpath("//input[@name='UserTitle']");
	 
	 private  By nextButton=By.xpath("//span[contains(text(),'Next')]");
	 
	 private By selectEmployee=By.xpath("//select[@name='CompanyEmployees']");
	 

	 public signupPageObjects(WebDriver driver) {
	  
	  this.driver=driver;
	 }

	 public WebElement enterFirstName() {

	  return driver.findElement(firstName);

	 }

	 public WebElement enterLastName() {

	  return driver.findElement(lastName);

	 }

	 
	 public WebElement enterJobTitle() {

	  return driver.findElement( jobTitle);

	 }
	 

	 public WebElement clickOnNextButton() {

	  return driver.findElement(nextButton);

	 }
	 
	 public WebElement selectEmployees() {
	  
	  return driver.findElement(selectEmployee);
	  
	 }
}
