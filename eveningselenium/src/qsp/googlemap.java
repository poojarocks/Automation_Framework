package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='gb_Of gb_x']")).click();
		driver.findElement(By.xpath("//input[class=tactile-'searchbox-input']")).sendKeys("bangalore");
		driver.findElement(By.xpath ("//button[aria-label='search']")).sendKeys("mysore");


}
}
