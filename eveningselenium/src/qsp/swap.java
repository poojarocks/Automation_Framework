package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91849/Desktop/swap.html");
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//input[1]"));
		WebElement b=driver.findElement(By.xpath("//input[2]"));
		WebElement c=driver.findElement(By.xpath("//input[3]"));
		a.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		c.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		b.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		a.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		c.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		b.sendKeys(Keys.CONTROL+"v");	
		Thread.sleep(2000);
		
		
		

}
}
