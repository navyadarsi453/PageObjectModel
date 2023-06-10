package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccommodationPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelDetails;
import pom.irctc.pages.HotelPage;
import pom.irctc.pages.HotelSerachPage;
import pom.irctc.pages.OTPVerificationpage;
import pom.irctc.pages.PassengerDetails;
import pom.irctc.pages.SummaryPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To check GST Validation";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC005";
	}
	
	
	@Test(dataProvider = "fetchData")


	public void GSTValidation(String email, String mob,String text,String room,String hotel,String title, String name, String last,String state,
			String gst,String gstnum,String comp, String place) {
		
		
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
.enterDestination(text)
//.Waitproperty()
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
.selectAdults(hotel)
.ClickOnDone()
.ClickOnFindHotel()
.Waitproperty()

.switchToHotelSearchWindow()
.clickOnHotel()
.switchToHotelDetailsWindow()
.Waitproperty()
.clickOnContinueBook()
 .Selecttitle(title)
.enterFirstName(name)
.enterLastName(last)
.SelectCountry("India")
.SelectState(state)
//.enterMobileNumber("9887456321")
//.enterEmail("darsi.navya313@gmail.com")

		.SelectGST(gst)
		.Waitproperty()
		.enterGSTnumber(gstnum)
	     .enterCompanyName(comp)
		.enterCompanyAdress(place)
		.clickOnContinue();
		
		
		
	}
}
