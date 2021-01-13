package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.LoginPage;
import resources.Comm;

public class HomeTest extends Comm{
	public WebDriver driver;
	
	@BeforeTest
	public void browser() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		
	}
	
	@Test
	public void hom() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		Thread.sleep(3000);
		l.login(prop.getProperty("user"), prop.getProperty("password"));
		
		Home h = new Home(driver);
		Thread.sleep(3000);
		driver.navigate().to("https://ui.freecrm.com/contacts");
		h.getNe();
		h.getFname("Sai");
		h.getLname("Naga");
		h.getSearch("ABC");
		h.getEmail(prop.getProperty("user"));
		h.getLe();
		h.getLead();
		h.getDesc("Hi");
		h.getAddress("hgdfsc");
		h.getCity("blr");
		h.getState("AP");
		h.getZip("560075");
		h.getCountry();
		h.getCou();
		h.getNum("7395611021");
		h.getHome("Home");
		
		
	}
	
	
}
