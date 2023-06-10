package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CharterPage;
import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To Register irctc";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void  sallonCheck(String name, String org, String add, String mob,String email,String text,String org1,String orgplace,
			String year,String year2,String pe,String c, String n, String purpose,String ser,String verify ) {
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
		.clickOnRightMenu()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(name)
		.enterNameOfOrganization(org)
		.enterAddress(add)
		.enterMobile(mob)
		.enterEmail(email)
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation(org1)
		.enterDestinationStaton(orgplace)
		//.enterCharterPurpose("luxury")
	//	.clickOnDate()
		//.clickOnMonth()
		//.selectYear(year)
	//	.clickOnSpecificDate()
		.Waitproperty()
		//.clickOnArrivalBackDate()
		//.clickOnArrivalBackMonth()
		//.selectArrivalBackYear(year2)
		//.clickOnSpecificArrivalBackDate()
		.enterNoOfDays("4")
		.enterNoOfCoaches("4")
		.enterNoOfPassengers("3")
		.enterPurposeOfCharter(purpose)
		
		.enterAdditionalService(ser)
		.clickOnSubmit()
		;
		
		
	}

}
