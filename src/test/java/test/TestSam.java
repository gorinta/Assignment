package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.LoginPage;
import resources.Comm;

public class TestSam extends Comm {
	public WebDriver driver;
	
	@BeforeTest
	public void browser() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login()
	{
		
		LoginPage l = new LoginPage(driver);
		l.login(prop.getProperty("user"), prop.getProperty("password"));
		/*
		 * l.getName().sendKeys(prop.getProperty("user"));
		 * l.getPass().sendKeys(prop.getProperty("password")); l.getLogin().click();
		 */
		
		
		
	}

	@AfterTest
	public void close()
	{
	
		
		//driver.close();
		
	}
}
