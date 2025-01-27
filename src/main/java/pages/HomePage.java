package pages;

import static utils.FrameworkUtils.captureScreenShot;
import static utils.FrameworkUtils.driver;
import static utils.FrameworkUtils.test;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class HomePage {

	public void performSearch() {
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).submit();
	}

	public void verifySearch() throws Exception{
		if(driver.findElement(By.xpath("//*[text()='Images']")).isDisplayed()) {
			test.log(LogStatus.PASS, "Pass - Serach is  successfully"+test.addScreenCapture(captureScreenShot("google.png")));
		}else {
			test.log(LogStatus.FAIL, "Fail - serach is not successfully");
		}
		
	}

	

}
