package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/91849/Desktop/gangu.html");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.tagName("input"));
			ele.click();
			//or
			//driver.findElement(By.tagName("input")).sendKeys("admin");
			//path
			//driver.findElement(By.id("a1")).sendKeys("admin");
			//path
			//driver.findElement(By.name("n1")).sendKeys("admin");
			//path
			driver.findElement(By.className("c1")).sendKeys("admin");
			
			
			

}
}
