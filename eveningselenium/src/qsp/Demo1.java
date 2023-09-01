package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		//browser to launch
		String value="./Softwares/chromedriver.exe";
		//path of the drivers
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}

}
