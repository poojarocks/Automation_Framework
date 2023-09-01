package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("div[class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='31']")).click();
		Thread.sleep(2000);
		driver.quit();

}
}
