package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Comm;

public class Home extends Comm{
	
	public WebDriver driver;
	
	By ne = By.xpath("//button[text()='New']");
	By fname = By.name("first_name");
	By lname = By.name("last_name");
	By search = By.xpath("//input[@class='search']");
	By email = By.xpath("//input[@placeholder='Email address']");
	By le = By.xpath("//div[@class='ui selection dropdown']");
	By lead = By.xpath("//span[text()='Lead']");
	By desc = By.name("description");
	
	By address = By.name("address");
	By city = By.name("city");
	By state = By.name("state");
	By zip = By.name("zip");
	By country = By.name("country");
	By cou = By.xpath("//span[text()='India']");
	
	
	By num = By.xpath("//input[@placeholder='Number']");
	By home = By.xpath("//input[@placeholder='Home, Work, Mobile...']");
	By position = By.name("position");
	By dept = By.name("department");
	By supe = By.xpath("(//input[@class='search'])[6]");
	By assis = By.xpath("(//input[@class='search'])[7]");
	By refer = By.cssSelector("div[name='referred_by'] input[type='text']");
	
	
	By day = By.name("day");
	By year = By.name("year");
	By iden = By.name("identifier");
	
	By tog = By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Call')]");
	
	/*public  Home(WebDriver driver)
	{
		this.driver = driver;
	}*/
	
	
	public Home(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	
	public void getNe()
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		WebElement we = w.until(ExpectedConditions.elementToBeClickable(ne));
		 we.click();
	}
	public void getFname(String fn)
	{
		 driver.findElement(fname).sendKeys(fn);
	}
	public void getLname(String ln)
	{
		 driver.findElement(lname).sendKeys(ln);
	}
	public void getSearch(String se)
	{
		 driver.findElement(search).sendKeys(se);
	}
	public void getEmail(String mail)
	{
		 driver.findElement(email).sendKeys(mail);
	}
	public void getLe()
	{
		 driver.findElement(le).click();
	}
	public void getLead()
	{
		 driver.findElement(lead).click();
	}
	public void getDesc(String description)
	{
		 driver.findElement(desc).sendKeys(description);
	}
	public void getAddress(String add)
	{
		 driver.findElement(address).sendKeys(add);
	}
	public void getCity(String ci)
	{
		 driver.findElement(city).sendKeys(ci);
	}
	public void getState(String stat)
	{
		 driver.findElement(state).sendKeys(stat);
	}
	public void getZip(String zi)
	{
		 driver.findElement(zip).sendKeys(zi);
	}
	public void getCountry()
	{
		 driver.findElement(country).click();
	}
	public void getCou()
	{
		 driver.findElement(cou).click();
	}
	public void getNum(String phone)
	{
		 driver.findElement(num).sendKeys(phone);
	}
	public void getHome(String hom)
	{
		 driver.findElement(home).sendKeys(hom);
	}
	public WebElement getPosition()
	{
		return driver.findElement(position);
	}
	public WebElement getDept()
	{
		return driver.findElement(dept);
	}
	public WebElement getSupe()
	{
		return driver.findElement(supe);
	}
	public WebElement getAssis()
	{
		return driver.findElement(assis);
	}
	public WebElement getRefer()
	{
		return driver.findElement(refer);
	}
	public WebElement getDay()
	{
		return driver.findElement(day);
	}
	public WebElement getYear()
	{
		return driver.findElement(year);
	}
	public WebElement getIden()
	{
		return driver.findElement(iden);
	}
	public WebElement getTog()
	{
		return driver.findElement(tog);
	}

	
	
}
