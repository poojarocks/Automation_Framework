package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title=driver.getCurrentUrl();
		System.out.println("title");
		String etitle="facebook";
		if(title.contains("facebook"))
		{
			System.out.println("testcase pass");	
		}
		else
		{
		System.out.println("testcase fail");
		
	}

}
}
