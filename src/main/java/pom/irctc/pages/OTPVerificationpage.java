package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPVerificationpage extends GenericWrappers {
	
	
public SummaryPage ClickOnVerifyOTP() {
		
		clickByXpath(prop.getProperty("OTPVerification.OTP.Xpath"));
		
		return new SummaryPage();
	}

}
