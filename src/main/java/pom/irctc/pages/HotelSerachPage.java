package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSerachPage extends GenericWrappers {
	
	public HotelSerachPage switchToHotelSearchWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelSerachPage Waitproperty() {
		
		waitproperty(1000);
		
		return new HotelSerachPage();
	}
	
	
	public HotelDetails clickOnHotel() {
		
		clickByXpath(prop.getProperty("HotelSearchPage.ClickonHotel.Xpath"));
		
		return new HotelDetails();
	}
	
	
	
	

}
