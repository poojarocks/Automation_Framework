package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count = link.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement we = link.get(i);
			String t=we.getAttribute("href");
			System.out.println(t);
		}
		
	}
}
