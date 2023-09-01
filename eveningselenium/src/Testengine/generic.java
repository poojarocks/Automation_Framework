package Testengine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class generic {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}
@AfterClass
public void closeAppln()
{
	driver.close();		
	
	}

}
