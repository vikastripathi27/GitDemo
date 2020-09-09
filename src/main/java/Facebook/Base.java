package Facebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public WebDriver intializeDriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Vikas Tripathi\\eclipse-workspace\\Letsautomate\\src\\main\\java\\Facebook\\data.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe");
      driver=new ChromeDriver();
		
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\geckodriver.exe");
	 driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	return driver;
	}

}
