package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class validatem {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91849/Desktop/multiple.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("countries"));
		Select s=new Select(ele);
		Boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("multi select dd");
		}
		else
		{
			System.out.println("not a multi select ");	
		}
		}

}
