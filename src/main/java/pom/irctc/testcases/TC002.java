package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FtrPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.UserRegistrationPage;
import wrappers.ProjectWrappers;

public class TC002  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Register irctc";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void BookyourCoach(String name,String password, String verpass,String qstn, String ans,String month , String year,String email,
			String occ,String fname , String mname ,String lname,String coun,String flat, String street, String area,String con,String mob, 
			String pin,String city ,String state,String po,String off, String soff, String aoff, String offcoun,
			String mob1,String pinoff, String offcit, String offsat, String offpo) {
		
		
		new HomePage()
		
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
		.clickOnRightMenu()
		.clickOnBookYourCoach()
		.switchToFtrWindow()
		.clickOnNewuser()		
		.enterUserId(name)
		.enterPassword(password)
		.enterConfirmPassword(verpass)
		.selectSecurityQuestion(qstn)
		.entersecurityAnswer(ans)
		//.clickOnDate()
		//.selectyear(year)
		//.selectMonth(month)
		//.clickOnDatenum()
		//.clickOnMale()
		.clickOnFemale()
		//.clickOnTransgender()
		//.clickOnInstitution()
		.clickOnMarried()
		//.clickOnUnmarried()
		.enterEmail(email)
		.selectOccupation(occ)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
		.selectNationalty(coun)
		.enterFlatnO(flat)
		.enterStreet(street)
		.enterArea(area)
		.selectcountry(con)
		.enterMobile(mob)
		.enterPincode(pin)
		//.selectCity("Chennai")
		//.selectState("Tamilnadu")
		//.selectPostOffice("600042")
		//.clickOnYes()
		.clickOnNo()
		.enterCommunicationFlatNo(off)
		.enterCommunicationStreet(soff)
		.enterCommuncationArea(aoff)
		.selectCommunicationcountry(offcoun)
		.enterMobileNumber(mob1)
		.enterCommunicationPincode(pinoff)
		;
		
		
		
	}

}
