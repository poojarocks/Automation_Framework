package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoopath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("poojawati096@yahoo.com");
		driver.findElement(By.xpath ("//input[@id='login-signin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pooja123");
		Thread.sleep(2000);
		driver.findElement(By.xpath ("//button[@name='verifyPassword']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='root_1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-owns='react-typehead-list-to']")).sendKeys("poojawati096@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("hii pooja");
		driver.findElement(By.xpath("//input[@data-test-id='compose-send-button']")).click();
		Thread.sleep(5000);

		

		
		


}
}
