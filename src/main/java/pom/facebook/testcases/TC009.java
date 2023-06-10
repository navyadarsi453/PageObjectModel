package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHomePage;
import pom.facebook.pages.FacebookPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify new user registration for the facebook";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC009";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void facebook(String firstName, String lastName, String EmailId	, String confirmEmailID
			,String password, String date, String month, String year) {
		
		new FacebookHomePage()
		.ClickOnCreateNewAccount()
		.enterFirstName(firstName)
		.enterSurName(lastName)
		.enterEmailId(EmailId)
		.enterConfirmEmailId(confirmEmailID)
		.enterNewPassword(password)
		.selectDate(date)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender("Female")
		.ClickOnSignUp();
		
	}

}
