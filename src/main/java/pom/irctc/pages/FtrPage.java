package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage  extends GenericWrappers{
	
	
	
	public FtrPage switchToFtrWindow() {
		switchToLastWindow();
		return this;
	}
	
	public UserRegistrationPage clickOnNewuser() {
		
		clickByXpath(prop.getProperty("FtrPage.ClickOnNewUser.Xpath"));
		
		return new UserRegistrationPage();
	}
	
	

}
