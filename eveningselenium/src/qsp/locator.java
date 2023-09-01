package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/91849/Desktop/locator.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.tagName("input"));
	ele.clear();
	//or
	driver.findElement(By.tagName("input")).clear();
	//path
			WebElement ele1=driver.findElement(By.id("a1"));
			ele1.clear();
			//or
			//driver.findElement(By.id("a1")).clear();
			//path
			//driver.findElement(By.name("n1")).clear();
			//path
			driver.findElement(By.className("c1")).clear();
			
	

}
}
