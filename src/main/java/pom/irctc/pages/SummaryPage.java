package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SummaryPage  extends GenericWrappers{
	
public SummaryPage Waitproperty() {
		
		waitproperty(1000);
		
		return new SummaryPage();
	}
	
	public SummaryPage ClickOnAgree() {
		
		clickByXpath(prop.getProperty("SummaryPage.ClickContinue.Xpath"));
		
		return new SummaryPage();
	}
	public SummaryPage ClickOnMakePayment() {
		
		clickByXpath(prop.getProperty("SummaryPage.ClickOnPayment.Xpath"));
		
		return new SummaryPage();
	}
public SummaryPage ClickOnVerifyOTP() {
		
		clickByXpath(prop.getProperty("SummaryPage.VerifyOTP.Xpath"));
		
		return new SummaryPage();
	}
	

}
