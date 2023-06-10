package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetails extends GenericWrappers {
	
public PassengerDetails Waitproperty() {
		
		waitproperty(1000);
		
		return new PassengerDetails();
	}
	
	public PassengerDetails Selecttitle(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectTitle.Xpath"), data);
		
		return new PassengerDetails();
	}
	
	public PassengerDetails enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetails.enterFirstName.Xpath"), data);
		
		return new PassengerDetails();
	}
	
public PassengerDetails enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetails.enterLastname.Xpath"), data);
		
		return new PassengerDetails();
	}


public PassengerDetails SelectCountry(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectCountry.Xpath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails SelectState(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectState.Xpath"), data);
	
	return new PassengerDetails();
}
public PassengerDetails enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.MobileNumber.Xpath"), data);
	
	return new PassengerDetails();
}
public PassengerDetails enterEmail(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.enterEmail.Xpath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails SelectGST(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectGST.Xpath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails enterGSTnumber(String data) {
	
	enterByXpath("//input[@name='gstNumber']", data);
	
	return this;
}

public PassengerDetails enterCompanyName(String data) {
	
	enterByXpath("//input[@name='companyName']", data);
	
	return new PassengerDetails();
}

public PassengerDetails enterCompanyAdress(String data) {
	
	enterByXpath("//input[@name='companyAddress']", data);
	
	return new PassengerDetails();
}
public SummaryPage clickOnContinue() {
	
	clickByXpath("//button[text()='Continue']");
	
	return new SummaryPage();
}



}