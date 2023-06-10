package pom.alert.pages;

import wrappers.GenericWrappers;

public class AlertsPage  extends GenericWrappers{
	
	public  static String alertText= null;
	
public  AlertsPage acceptTheAlert() {
		
		acceptAlert();
		
		return new AlertsPage();
		
	
		
	}

	public  AlertsPage sendThekeys(String value) {
		
		sendkeys(value);
		
		return this;
	}

	public AlertsPage gettheAlert() {
		
		alertText =getAlertText();
		
		return this;
	}

	public  AlertsPage    dismisstheAlert() {
		
		dismissAlert();
		
		return  this;
	}
	
	public W3SchoolAlertPage Switchdefault() {
		
		defaultcontent();

		return  new  W3SchoolAlertPage();


		}

	

	

}
