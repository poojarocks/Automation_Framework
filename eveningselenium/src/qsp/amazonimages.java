package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonimages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> imgs = driver.findElements(By.xpath("//img"));
		int count = imgs.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement we = imgs.get(i);
			String t=we.getAttribute("src");
			System.out.println(t);
		}
		

	}

}
