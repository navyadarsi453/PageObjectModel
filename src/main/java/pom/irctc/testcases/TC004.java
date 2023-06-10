package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccommodationPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelSerachPage;
import pom.irctc.pages.OTPVerificationpage;
import pom.irctc.pages.PassengerDetails;
import pom.irctc.pages.SummaryPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To check otp validation";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC004";
	}
	
	
	@Test(dataProvider = "fetchData")

	
	public void OTPvalidation(String email,String mob,String city,String room,String adult,String title,
			String fname,String last,String state,String gst) {
		
		new HomePage()
		
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
	     .clickOnHotel()
	     .switchToHotelWindow()
	    .clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmailId(email)
		.enterMobleNumber(mob)
		.clickOnuestLogin()
		.switchToHotelWindow()
         .Waitproperty()
		.enterDestination(city)
		.Waitproperty()
		.ClickOnCity()
		.ClickOnDate1()
		.Waitproperty()
		.click1OnYear()
		//.Waitproperty()
		.ClickOnYear()
		.Waitproperty()
		.ClickOnMonth()
		.Waitproperty()
		.ClickOnDate()
		//.Waitproperty()
	   .ClickOnReturnDateOfTravel()
	  .Waitproperty()
	   .ClickOnYear1()
		.clickOnReturnYear()
		//.Waitproperty()
		.clickOnreturnMonth()
		.ClickOnReturnDate()
		.ClickOnGuest()
		.selectRooms(room)
		.selectAdults(adult)
		.ClickOnDone()
		.ClickOnFindHotel()
		.Waitproperty()
		
		.switchToHotelSearchWindow()
		.clickOnHotel()
		.switchToHotelDetailsWindow()
		.Waitproperty()
		.clickOnContinueBook()
	     .Selecttitle(title)
		.enterFirstName(fname)
		.enterLastName(last)
		.SelectCountry("India")
		.SelectState(state)
		//.enterMobileNumber("9887456321")
		//.enterEmail("darsi.navya313@gmail.com")
		.SelectGST(gst)
		.Waitproperty()
		.clickOnContinue()
		.Waitproperty()
		.ClickOnAgree()
		.ClickOnMakePayment();
	     //.ClickOnVerifyOTP();
		
		
	}

}
