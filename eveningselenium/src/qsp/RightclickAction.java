package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement rclick =driver.findElement(By.xpath("//button[text()="));
		Actions act=new Actions(driver);
		act.contextClick().perform();


}
}
