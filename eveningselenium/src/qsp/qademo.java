package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qademo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.id("firstName")).sendKeys("sonu");
		driver.findElement(By.id("lastName")).sendKeys("Awati");
		 driver.findElement(By.id("userEmail")).sendKeys("sonu123@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("userNumber")).sendKeys("4567839013");
		 Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("dateOfBirthInput"));
		ele.clear();
		ele.sendKeys("31/07/1997");
		Thread.sleep(2000);		
   // driver.findElement(By.xpath("//lable[text()='Reading']")).click();
    Thread.sleep(2000);		
    driver.findElement(By.id("currentAddress")).sendKeys("bangalore");
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("
    
   
}
}
