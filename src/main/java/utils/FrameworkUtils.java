package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class FrameworkUtils {
	
	public static WebDriver driver;
	public static ExtentReports report ;
	public static ExtentTest test;
	
	public static String captureScreenShot(String name) throws Exception {
		String screenshotPath="D:\\SumanSir Projects\\ProjectbatchProjects\\project16\\target\\"+name+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screenshotPath));
		return screenshotPath;
	}

}
