package pom.Formc.pages;

import wrappers.GenericWrappers;

public class FormCPage  extends GenericWrappers{
	
	
public FormCPage enterUserId(String data) {
		
		enterByXpath(prop.getProperty("FormCPage.username.Xpath"), data);
		
		
		
		return new FormCPage();
	}
	
public FormCPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("FormCPage.password.Xpath"), data);
		
		
		return new FormCPage();
	}

public FormCPage enterConfirmPassword(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.confirmPassword.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage selectSecurityQuestion(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.security.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage enterYourAnswer(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.answer.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterName(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.entername.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterDateOfBirth(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.enterdob.Xpath"), data);
	
	
	return new FormCPage();
}


public FormCPage enterDesignation(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.designation.Xpath"), data);
	
	
	return new FormCPage();
}


public FormCPage enterEmailid(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.email.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mobile.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterPhonenumber(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.phonenumber.Xpath"), data);
	
	
	return new FormCPage();
}


public FormCPage enterNmae(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.name.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterCapacity(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.capacity.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterAddress(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.Adress.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enteremailId(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mail.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterMobile1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mobile1.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterPhoneNumber(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.phone.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterName1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.name1.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterAddress1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.address.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterEmailId1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.email1.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterPhoneNumber1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.phone1.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterMobileNumber1(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mobilenumber1.Xpath"), data);
	
	
	return new FormCPage();
}


public FormCPage enterName2(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.name2.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterAddress2(String data) {
	
	enterByXpath("address_o", data);
	
	
	return new FormCPage();
}
public FormCPage enterEmail2(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.email2.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterPhone2(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.phone2.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterMobile2(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mobile2.Xpath"), data);
	
	
	return new FormCPage();
}

public FormCPage enterName3(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.name3.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterAddress3(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.address3.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterEmailId3(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.id3.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterPhone3(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.phone3.Xpath"), data);
	
	
	return new FormCPage();
}
public FormCPage enterMobile3(String data) {
	
	enterByXpath(prop.getProperty("FormCPage.mobile3.Xpath"), data);
	
	
	return new FormCPage();
}



public FormCPage selectGender(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.gender.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectNationality(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.nationality.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectState(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.selectstate.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectCity(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.city.Xpath"), data);
	
	return new FormCPage();
}
public FormCPage selectAccomodationType(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.acco.Xpath"), data);
	
	return new FormCPage();
}
public FormCPage selectAccomodationGrade(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.grade.Xpath"), data);
	
	return new FormCPage();
}
public FormCPage selectState1(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.state1.Xpath"), data);
	
	return new FormCPage();
}
public FormCPage selectCity1(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.city1.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectState2(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.state2.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectCity2(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.city2.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectCity3(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.city3.Xpath"), data);
	
	return new FormCPage();
}

public FormCPage selectState3(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FormCPage.state3.Xpath"), data);
	
	return new FormCPage();



	
}


}



