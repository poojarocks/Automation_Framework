package Testengine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
		@FindBy(name="username")
		private WebElement unTbox;
		@FindBy(name="pwd")
		private WebElement pwdTbox;
		@FindBy(xpath="//a[text()='Login']")
		private WebElement loginBtn;
		public POM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void userName(String un)
		{
			unTbox.sendKeys(un);
		}
		public void password(String pwd)
		{
			pwdTbox.sendKeys(pwd);
			
		}
		public void ClickLogin() {
			// TODO Auto-generated method stub
			loginBtn.click();
		}
}
		

