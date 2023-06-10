package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SSCRegistrationPage extends GenericWrappers {
	
public SSCRegistrationPage clickOnYes() {
		
		clickByXpath(prop.getProperty("SSCRegistrationPage.clickonyes.Xpath"));
		
		return new SSCRegistrationPage();
	}
	
public SSCRegistrationPage clickOnNO() {
		
		clickByXpath("(//input[@name='DoyouhaveAadhar'])[2]");
		
		return new SSCRegistrationPage();
	}

public SSCRegistrationPage enterAdharNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.Adharnumber.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage enterConfirmAdharNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.confirmAdhar.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage selectType(String data) {
	
	selectVisibileTextByXpath("//select[@name='TypeofID']", data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterIDnumber(String data) {
	
	enterByXpath("//input[@name='IDnumber']", data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage enterName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.name.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage enterVerifyName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyname.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage clickOnChangeNameYes() {
	
	clickByXpath(prop.getProperty("SSCRegistrationPage.changeName.Xpath"));
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage clickOnChangeNameNo() {
	
	clickByXpath("(//input[@name='HaveEverChangedName'])[2]");
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage enterNewName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.newname.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}
public SSCRegistrationPage enterFathersName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.Fathername.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}
public SSCRegistrationPage enterVerifyFatherName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyFather.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}
public SSCRegistrationPage enterMotherName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.mothername.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}
public SSCRegistrationPage enterVerifyMotherName(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyMothername.Xpath"), data);
	
	return new SSCRegistrationPage();
	
}

public SSCRegistrationPage enterDate(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.date.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterVerifyDate(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyDate.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage selectEducationBoard(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.Education.Xpath"), data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage selectVerifyEducationBoard(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.VerifyEducation.Xpath"), data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterRollNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.Rollnumber.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterVerifyRollNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyrollnumber.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage selectYeraOfPassing(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.YearOfPassing.Xpath"), data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage selectVerifyYearOfPassing(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.VerifyYearOfPassing.Xpath"), data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage clickOnMale() {
	
	clickByXpath("(//input[@name='Gender'])[1]");
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage clickOnFemale() {
	
	clickByXpath(prop.getProperty("SSCRegistrationPage.clickonfemale.Xpath"));
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage clickOnTransGender() {
	
	clickByXpath("(//input[@name='Gender'])[3]");
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage clickOnVerifyMale() {
	
	clickByXpath("(//input[@name='VerifyGender'])[1]");
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage clickOnVerifyFemale() {
	
	clickByXpath(prop.getProperty("SSCRegistrationPage.VerifyFemale.Xpath"));
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage clickOnVerifyTransGender() {
	
	clickByXpath("(//input[@name='VerifyGender'])[3]");
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage selectLevelOfEducationQualification(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.EducationQualification.Xpath"), data);
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.mobile.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterVerifyMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyMobile.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterEmailId(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.email.Xpath"), data);;
	
	return new SSCRegistrationPage();
}

public SSCRegistrationPage enterVerifyEmailId(String data) {
	
	enterByXpath(prop.getProperty("SSCRegistrationPage.verifyemail.Xpath"), data);;
	
	return new SSCRegistrationPage();
}
public SSCRegistrationPage selectStatePermanentAddress(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("SSCRegistrationPage.permanentAddress.Xpath"), data);
	
	return new SSCRegistrationPage();
}



}
