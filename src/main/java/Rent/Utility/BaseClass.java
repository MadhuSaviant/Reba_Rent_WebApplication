package Rent.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void launchbrowser() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://reba-rent-brookfield-dev-web.azurewebsites.net/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
