package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		FrameworkUtils.driver= new ChromeDriver();
		FrameworkUtils.driver.manage().window().maximize();	
	}

	public static void invokeApp() {
		FrameworkUtils.driver.get("https://www.google.com/");
		
	}

	public static void killBrowser() {
		FrameworkUtils.driver.quit();
		
	}

}
