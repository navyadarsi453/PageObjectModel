package pom.alert.pages;

import pom.irctc.pages.AccommodationPage;
import pom.irctc.pages.HotelDetails;
import wrappers.GenericWrappers;

public class W3SchoolAlertPage  extends GenericWrappers{
	
public static 	String alertText=null;


public W3SchoolOnline clickonHome() {
		
		clickByXpathNoSnap(prop.getProperty("W3SchoolAlertPage.clickonhome.Xpath"));
		
		return new W3SchoolOnline();
		
		
	}

public AlertsPage clickOnTryIt() {
	
	clickByXpathNoSnap(prop.getProperty("W3SchoolAlertPage.ClickOntryit"));
	
	return  new AlertsPage();
	
}


public W3SchoolAlertPage switchframe() {
	
	switchtoFrameByXpath(prop.getProperty("W3SchoolAlertPage.Switchframe"));
	
	return  new W3SchoolAlertPage();
}




public 	W3SchoolAlertPage refreshThepage() {
	
	refresh();
	return new W3SchoolAlertPage();
}
public W3SchoolAlertPage Waitproperty() {
	
	waitproperty(1000);
	
	return new W3SchoolAlertPage();
}








}
