package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void reporting() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		
		// start test
		ExtentTest test =  report.startTest("TC007", "To verify Facebook Registration for the new user");
		
		test.assignAuthor("Navya");
		
		test.assignCategory("Performance");
		
	
		// log test steps
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got laucnhed with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		
		
		
		
	}
	
	
	

}
