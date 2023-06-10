package pom.Formc.pages;

import wrappers.GenericWrappers;

public class FormcHomePage extends GenericWrappers {
	
	
public FormCPage clickOnSignUp() {
		
		clickByXpath(prop.getProperty("FormcHomePage.signup.Xpath"));
		
		
		return new FormCPage();
				
	}

}
