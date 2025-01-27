package tests;

import static utils.FrameworkUtils.report;
import static utils.FrameworkUtils.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import utils.BrowserUtils;

public class TestSample3 {

	@Test
	public void test() throws Exception {
		String path = "D:\\SumanSir Projects\\ProjectbatchProjects\\project16\\target\\execution_report.html";
		report = new ExtentReports(path);
		test = report.startTest("Test case 01 - google search");
		HomePage homePage = new HomePage();
		BrowserUtils.openBrowser();
		test.log(LogStatus.INFO, "Browser launched successfully");
		BrowserUtils.invokeApp();
		test.log(LogStatus.INFO, "google url invoked successfully");
		homePage.performSearch();
		test.log(LogStatus.INFO, "Search perfomed");
		homePage.verifySearch();
		test.log(LogStatus.INFO, "serach is successfull");
		BrowserUtils.killBrowser();
		test.log(LogStatus.INFO, "Browser closed successfully");
		report.endTest(test);
		report.flush();
		report.close();
		new ChromeDriver().get(path);
	}

}
