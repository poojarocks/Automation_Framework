package methodpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close();
		driver.quit();
		driver.findElement(By.tagName("input")).sendKeys("mobile");
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.name("field-keywords"));
		driver.findElement(By.className("nav-input nav-progressive-attribute"));
		driver.findElement(By.linkText("amazon")).click();
		driver.findElement(By.partialLinkText("amazon"));
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and@class='nav-input nav-progressive-attribute']"));
		driver.findElement(By.xpath("//span[text()='All']"));
		driver.findElement(By.xpath("//span[contains(text(),'All']"));
		
		
		
		
		
		
		

}
}
