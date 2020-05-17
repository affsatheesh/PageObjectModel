package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction
{
	public static Properties properties=null;
	public static WebDriver driver =null;
	static Logger logger=Logger.getLogger(CommonFunction.class);
	
	public Properties loadpropertiesfile() throws IOException
	{
		FileInputStream fileinputstream=new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	@BeforeSuite
	public void launchbrowser() throws IOException
	{
		PropertyConfigurator.configure("config@.properties");
		logger.info("properties file loaded");
		loadpropertiesfile();
		String browser =   properties.getProperty("Browser");
		String url =   properties.getProperty("Url");
		String driverlocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver =new ChromeDriver();
			logger.info("ChromeBrowser lanuched");
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driverlocation);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		logger.info("Url Entered");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		logger.info("Browser closed");

	}

}
