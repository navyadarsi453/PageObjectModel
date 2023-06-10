package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookPage extends GenericWrappers {
	
public FacebookPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("FacebookPage.FirstName.XPath"), data);
		
		return new FacebookPage();
	}
	
public FacebookPage enterSurName(String data) {
		
		enterByXpath(prop.getProperty("FacebookPage.LastName.XPath"), data);
		
		return new FacebookPage();
	}

public FacebookPage enterEmailId(String data) {
	
	enterByXpath(prop.getProperty("FacebookPage.EmailId.Xpath"), data);
	
	return new FacebookPage();
}

public FacebookPage enterConfirmEmailId(String data) {
	
	enterByXpath(prop.getProperty("FacebookPage.confirmEmailID.Xpath"), data);
	
	
	return new FacebookPage();
}

public FacebookPage enterNewPassword(String data) {
	
	enterByXpath(prop.getProperty("Facebookpage.password.Xpath"), data);
	
	return new FacebookPage();
}

public FacebookPage selectDate(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("Facebookpage.date.Xpath"), data);
	
	return new FacebookPage();
}

public FacebookPage selectMonth(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("Facebookpage.month.Xpath"), data);
	
	return new FacebookPage();
}

public FacebookPage selectYear(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("Facebookpage.year.Xpath"), data);
	
	return new FacebookPage();
}

public FacebookPage clickOnGender(String data) {
	clickByXpath("//label[text()='"+data+"']/following-sibling::input");
	return new FacebookPage();
}

public FacebookPage ClickOnFemale() {
	
	clickByXpath(prop.getProperty("Facebookpage.clickonGender.Xpath"));
	
	return new FacebookPage();
}

public FacebookPage ClickOnMale() {
	
	clickByXpath("(//input[@name='sex'])[2]");
	
	return new FacebookPage();
}

public FacebookPage ClickOnCustom() {
	
	clickByXpath("(//input[@name='sex'])[3]");
	
	return new FacebookPage();
}
public FacebookPage ClickOnSignUp() {
	
	clickByXpath(prop.getProperty("Facebookpage.clickOnSignup.Xpath"));
	
	return new FacebookPage();
}

public FacebookPage CloseTab() {
	
	closeAllBrowsers();
	
	return new FacebookPage();
}



}
