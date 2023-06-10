package pom.php.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers {
	
	
public PHPRegistrationPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.FirstName.Xpath"), data);
		
		
		return new PHPRegistrationPage();
	}
	
public PHPRegistrationPage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.lastName.Xpath"), data);
		
		
		return new PHPRegistrationPage();
	}
public PHPRegistrationPage enterEmailAddress(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.email.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}

public PHPRegistrationPage clickOnCountryCode() {
	
	clickByXpath(prop.getProperty("PHPRegistrationPage.countrycode.Xpath"));
	return new PHPRegistrationPage();
}

public PHPRegistrationPage enterCompanyname(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.companyName.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterStreetAddress(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.Address.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterStreetAddress2(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.Address2.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterCity(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.city.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterState(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.state.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterPostCode(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.pincode.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.mobile.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}

public PHPRegistrationPage selectCountry(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PHPRegistrationPage.country.Xpath"), data);
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterPassword(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.password.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterConfirmPassword(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.password2.Xpath"), data);
	
	
	return new PHPRegistrationPage();
}


}
