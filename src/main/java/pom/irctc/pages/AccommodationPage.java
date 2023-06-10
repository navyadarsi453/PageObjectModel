package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	
	public AccommodationPage switchToAccommodationWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage clickOnRightMenu()
	{
		clickByXpath(prop.getProperty("Accommodation.ClickOnRightMenu.Xpath"));
		return new AccommodationPage();
	}
	
	
	
	public FtrPage clickOnBookYourCoach()
	{
		clickByXpath(prop.getProperty("Accommodation.ClickOnBookYourCoach.Xpath"));
		return new FtrPage();
	}
	
	public HotelPage clickOnHotel() {
		
		clickByXpath(prop.getProperty("Accommodation.ClickOnHotel.Xpath"));
		
		return new HotelPage();
	}
	
	public CharterPage  clickOnCharter() {
		
		clickByXpath(prop.getProperty("Accommodation.ClickOnCharter.Xpath"));
		
		return new CharterPage();
	}

	
}
