package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
		return new RegistrationPage();
	}

	
	public HomePage mouseHoverOnHolidays() {
		MouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnHolidays.Xpath"));
		return this;
	}
	
	
	public HomePage mouseHoverOnStays() {
		MouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnstays.Xpath"));
		return new HomePage();
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("Homepage.ClickOnLounge.Xpath"));
		return new AccommodationPage();
	}
	
	
	
}
