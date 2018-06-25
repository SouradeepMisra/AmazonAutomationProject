package GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BAseTest implements Constant {
	public WebDriver driver;

	@BeforeMethod
	public void oprnapp()
	{
		System.setProperty(Key,Value);
	       driver = new FirefoxDriver();
	      
	 
	String ss=Excel.getExcelData(path, "Sheet1", 0, 1);
	
	driver.get(ss);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	
	}
	@AfterMethod
	public void closeapp()
	{
		
		driver.quit();
	}

}
