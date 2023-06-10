package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLogin  extends GenericWrappers{
	
	public HotelPage switchToHotelWindow() {
		switchToLastWindow();
		return new HotelPage();
	}
	
	

	

public GuestUserLogin clickOnGuestUserLogin() {
	
	clickByXpath(prop.getProperty("GuestUserLogin.ClickOnguestUserlogin.Xpath"));
	
	return this;
}

public GuestUserLogin enterEmailId(String data) {
	
	enterByXpath(prop.getProperty("GuestUserLogin.email.Xpath"), data);
	return  this;
}



public GuestUserLogin  enterMobleNumber(String data) {
	
	enterByXpath(prop.getProperty("GuestUserLogin.MobileNumber.Xpath"), data);
	return this;
}

public HotelPage clickOnuestLogin() {
	
	clickByXpath(prop.getProperty("GuestUserLogin.clickonGuest.Xpath"));
	
	return new HotelPage();
}
	

}
