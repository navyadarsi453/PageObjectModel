package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertsPage;
import pom.alert.pages.W3SchoolAlertPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="Confirmation Alert";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	
	@Test
	
	public void Confirmation() {
		
new W3SchoolAlertPage()

		.switchframe()
		.clickOnTryIt()
		.gettheAlert()
		.acceptTheAlert()
		.Switchdefault()
		.refreshThepage()
		.switchframe()
		.clickOnTryIt()
	   .dismisstheAlert()
	   .Switchdefault()
	   .clickonHome();

		
		


		
		

		
	}
	}


