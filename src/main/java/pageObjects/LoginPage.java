package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By log = By.xpath("//span[text()='Log In']");
	By name = By.name("email");
	By pass = By.xpath("//input[@name='password']");
	By login = By.xpath("//div[text()='Login']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}
	
	/*
	 * public WebElement getLog() { return driver.findElement(log); }
	 * 
	 * public WebElement getName() { return driver.findElement(name); }
	 * 
	 * public WebElement getPass() { return driver.findElement(pass); } public
	 * WebElement getLogin() { return driver.findElement(login); }
	 */
	
	public void login(String un, String pwd)
	{
		driver.findElement(log).click();
		driver.findElement(name).sendKeys(un);
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(login).click();
	}
	
	

}
