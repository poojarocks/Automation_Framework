package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleopt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91849/Desktop/multiple.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("countries"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("Russia");
		Thread.sleep(2000);
		s.deselectAll();
		
	}	

}
