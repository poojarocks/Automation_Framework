package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class xyz {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91849/Desktop/pooja.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();
		//or
		//driver.findElement(By.tagName("a")).click();
		//path
		WebElement ele1=driver.findElement(By.id("a1"));
		ele1.click();
		//or
		//driver.findElement(By.id("a1")).click();
		//path
		//driver.findElement(By.name("n1")).click();
		//path
		driver.findElement(By.className("c1")).click();
		
		
	}
}
