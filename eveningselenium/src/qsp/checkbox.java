package qsp;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91849/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement>cBox=driver.findElements(By.xpath("//input"));
		int count=cBox.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement we=cBox.get(i);
			we.click();
		}
		for(int i=0;i<count;i--)
		{
			WebElement we=cBox.get(i);
			we.click();
		}
		}
}