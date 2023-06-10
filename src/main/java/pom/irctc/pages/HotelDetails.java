package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetails  extends GenericWrappers{
	
	public HotelDetails switchToHotelDetailsWindow() {
		switchToLastWindow();
		return new HotelDetails();
	}
	
	public HotelDetails Waitproperty() {
		
		waitproperty(1000);
		
		return new HotelDetails();
	}
	
	
	public PassengerDetails clickOnContinueBook() {
		clickByXpath(prop.getProperty("HotelDetails.clickoncontinuebook.Xpath"));
		
		return new PassengerDetails();
	}
	
	

}
