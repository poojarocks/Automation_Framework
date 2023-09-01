package TakeScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0, 600)");
			Thread.sleep(1000);
		}
			WebElement ele=driver.findElement(By.xpath("//span[text()='Samsung Galaxy M04 Dark Blue, 4GB RAM, 64GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera']"));
			ele.sendKeys("mobile");
			ele.sendKeys(Keys.ENTER);
			
			
			
			

}
	}
