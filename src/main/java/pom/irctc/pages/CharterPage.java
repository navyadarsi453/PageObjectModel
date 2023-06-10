package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage  extends GenericWrappers{
	
	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("CharterPage.ClickOnEnquiry.Xpath"));
		
		return new CharterPage();
	}


	
	public CharterPage enterNameOfApplicant(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.Entername.Xpath"), data);
		
		return new CharterPage();
		
		
		
		
		
	}
public CharterPage enterNameOfOrganization(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.NameofOrg.Xpath"), data);
		
		return new CharterPage();
		
		
		
		
		
	}
public CharterPage enterAddress(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.EnterAddress.Xpath"), data);
	
	return new CharterPage();
	
	
	
	
	
}
public CharterPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.EnterMobile.Xpath"), data);
	
	return new CharterPage();
	
	
	
	
	
}
public CharterPage enterEmail(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.EnterEmail.Xpath"), data);
	
	return new CharterPage();
	
	
	
	
	
}

public CharterPage selectRequestFor(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.SelectRequest.Xpath"), Value);
	
	return new CharterPage();
	}

public CharterPage enterOriginatingStation(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.EnteroriginatingStation.Xpath"), data);
	
	return new CharterPage();}

public CharterPage enterDestinationStaton(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.EnterDestination.Xpath"), data);
	
	return new CharterPage();}


	
	
	





public CharterPage clickOnDate() {
	
	clickByXpath(prop.getProperty("CharterPage.ClickOnDate.Xpath"));
	
	return new CharterPage();
}

public CharterPage selectYear(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.SelectYear.Xpath"), Value);
	
	return new CharterPage();
	}

public CharterPage clickOnMonth() {
	
	clickByXpath(prop.getProperty("CharterPage.ClickOnMonth.Xpath"));
	
	return new CharterPage();
}

//span[text()='31']

public CharterPage clickOnSpecificDate() {
	
	clickByXpath(prop.getProperty("CharterPage.ClickOnspecificDate.Xpath"));
	
	return new CharterPage();
}

public CharterPage Waitproperty() {
	
	waitproperty(1000);
	
	return new CharterPage();
}

public CharterPage clickOnArrivalBackDate() {
	
	clickByXpath(prop.getProperty("CharterPage.ArrivalBackDate.Xpath"));
	
	return new CharterPage();
}

public CharterPage selectArrivalBackYear(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.ArrivalBackYear.Xpath"), Value);
	
	return new CharterPage();
	}
public CharterPage clickOnArrivalBackMonth() {
	
	clickByXpath(prop.getProperty("CharterPage.ArrivalBackMonth.Xpath"));
	
	return new CharterPage();
}
public CharterPage clickOnSpecificArrivalBackDate() {
	
	clickByXpath(prop.getProperty("CharterPage.ArrivalBackDate.Xpath"));
	
	return new CharterPage();
}

public CharterPage enterNoOfDays(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.NoofDays.Xpath"), data);
	
	return new CharterPage();
	
	
	
	
	
}

//input[@name='coachDetails']

public CharterPage enterNoOfCoaches(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.Noofcoaches.Xpath"), data);
	
	return new CharterPage();
	
	
	
	
	
}

public CharterPage enterNoOfPassengers(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.NoofPassengers.Xpath"), data);
	
	return new CharterPage();
	
}	

public CharterPage enterPurposeOfCharter(String data) {
	
	enterByXpath(prop.getProperty("//textarea[@name='charterPurpose']"), data);
	
	return new CharterPage();
	
}

public CharterPage enterAdditionalService(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.AdditionalServices.Xpath"), data);
	
	return new CharterPage();
}
	
public CharterPage clickOnSubmit() {
	
	clickByXpath(prop.getProperty("CharterPage.ClickOnsubmit.Xpath"));
	
	return new CharterPage();
}
	






	
	













}


