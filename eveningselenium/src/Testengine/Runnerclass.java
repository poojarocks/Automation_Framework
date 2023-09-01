package Testengine;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runnerclass extends generic 
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		
		
	}
	

}
