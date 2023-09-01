package Testengine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runnerclass1 {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automation-lab/login.jsp");
	    POM1 p1=new POM1(driver);
	    p1.userName("admin");
	    Thread.sleep(2000);
	    p1.password("manage");
	    Thread.sleep(2000);
	    p1.ClickLogin();

}
}
