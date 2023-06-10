package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {
	
	
	public FacebookPage ClickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		
		return new FacebookPage();
	}
	

}
