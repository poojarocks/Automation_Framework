package TakeScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
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
		//WebElement ele=driver.findElement(By.xpath("//a[text()='Instagram']"));
		//Point locn=ele.getLocation();
		//Thread.sleep(2000);
		System.out.println(locn);
		int x=locn.getX();
		System.out.println(x);
		int y=locn.getY();
		System.out.println(y);
		
		
		

}
}

