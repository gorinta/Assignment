package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Comm {
	public WebDriver driver;
	public Properties prop;
	
	
	public   WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\JavaGitWorkSpace\\Assignment\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String bName = prop.getProperty("browser");
		
		if(bName.equalsIgnoreCase("chrome")) 
		{  
			/*System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();*/
			 
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		return driver;	
	}

}
