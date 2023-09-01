package Testengine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runnerclass2 {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    POM1 p1=new POM1(driver);
	    p1.userName("poojawati096@gmail.com");
	    Thread.sleep(2000);
	    p1.password("Pooja@123");
	    Thread.sleep(2000);
	    p1.ClickLogin();


}
}
