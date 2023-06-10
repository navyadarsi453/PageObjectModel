package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {
	
	
	public UserRegistrationPage enterUserId(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterUserId.Xpath"), data);
		
		return new UserRegistrationPage();
	}


public UserRegistrationPage enterPassword(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.enterPassword.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage enterConfirmPassword(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.ConfirmPassword.Xpath"), data);
	
	return new UserRegistrationPage();
}



public UserRegistrationPage selectSecurityQuestion(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.SelectSecurityQuestion.Xpath"), Value);
	
	return new UserRegistrationPage();
	}

public UserRegistrationPage entersecurityAnswer(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.enterSecurityAnswer.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnDate() {
	
	clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnDate.Xpath"));
	
	return new UserRegistrationPage();
}

public UserRegistrationPage selectMonth(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.SelectMonth.Xpath"), data);
	
	
	return new UserRegistrationPage();
}

public UserRegistrationPage selectyear(String data) {
	
	selectVisibileTextByXpath("//select[@class='ui-datepicker-year']", data);
	
	return new UserRegistrationPage();
}


public UserRegistrationPage clickOnDatenum() {
	
	clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnDate.Xpath"));
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnMale() {
	
	clickByXpath("(//input[@name='gender'])[1]");
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnFemale() {
	
	clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnFemale.Xpath"));
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnTransgender() {
	
	clickByXpath("(//input[@name='gender'])[3]");
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnInstitution() {
	
	clickByXpath("(//input[@name='gender'])[4]");
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnMarried() {
	
	clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnMarried.Xpath"));
	
	return new UserRegistrationPage();
}
public UserRegistrationPage clickOnUnmarried() {
	
	clickByXpath("(//input[@name='maritalStatus'])[2]");
	
	return new UserRegistrationPage();
}

//input[@name='email']

public UserRegistrationPage enterEmail(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.Email.Xpath"), data);
	
	return new UserRegistrationPage();
}



public UserRegistrationPage selectOccupation(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.Occupation.Xpath"), Value);
	
	return new UserRegistrationPage();
	}

//input[@name='secAnswer']



public UserRegistrationPage enterFirstName(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.FirstName.Xpath"), data);
	
	return new UserRegistrationPage();
	
	
}



public UserRegistrationPage enterMiddleName(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.MiddleName.Xpath"), data);
	
	return new UserRegistrationPage();
}
public UserRegistrationPage enterLastName(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.LastName.Xpath"), data);
	
	return new UserRegistrationPage();
}



public UserRegistrationPage selectNationalty(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.SelectNationility.Xpath"), Value);
	
	return new UserRegistrationPage();
	}



public UserRegistrationPage enterFlatnO(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.Flatno.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage enterStreet(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.street.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage enterArea(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.Area.Xpath"), data);
	
	return new UserRegistrationPage();
}

//select[@name='country']

public UserRegistrationPage selectcountry(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.Country.Xpath"), Value);
	
	return new UserRegistrationPage();
	}


//input[@name='mobile']
public UserRegistrationPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.Mobile.Xpath"), data);
	
	return new UserRegistrationPage();
}
public UserRegistrationPage enterPincode(String data) {
	
	enterByXpath(prop.getProperty("UserRegistration.Pincode.Xpath"), data);
	
	return new UserRegistrationPage();
}

//select[@name='city']
public UserRegistrationPage selectCity(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegisrationPage.city.Xpath"), Value);
	
	return new UserRegistrationPage();
	}

public UserRegistrationPage selectState(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.State.Xpath"), Value);
	
	return new UserRegistrationPage();
	}

public UserRegistrationPage selectPostOffice(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.PostOffice.Xpath"), Value);
	
	return new UserRegistrationPage();
	}

public UserRegistrationPage clickOnYes() {
	
	clickByXpath("(//input[@name='sameAddresses'])[1]");
	
	return new UserRegistrationPage();
}

public UserRegistrationPage clickOnNo() {
	
	clickByXpath(prop.getProperty("UserRegistrationPage.No.Xpath"));
	
	return new UserRegistrationPage();
}

//input[@name='flatNoOffice']

public UserRegistrationPage enterCommunicationFlatNo(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.CommunicationAdd.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage enterCommunicationStreet(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.commstreet.Xpath"), data);
	
	return new UserRegistrationPage();
}

public UserRegistrationPage enterCommuncationArea(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.CommArea.Xpath"), data);
	
	return new UserRegistrationPage();
}


public UserRegistrationPage selectCommunicationcountry(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.Commcountry.Xpath"), Value);
	
	return new UserRegistrationPage();
	}


//input[@name='mobile']
public UserRegistrationPage enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.Commmobile.Xpath"), data);
	
	return new UserRegistrationPage();
}
public UserRegistrationPage enterCommunicationPincode(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.CommPincode.Xpath"), data);
	
	return new UserRegistrationPage();
}












}