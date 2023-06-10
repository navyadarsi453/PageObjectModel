package pom.alert.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.W3SchoolAlertPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="Confirmation Alert";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	
	@Test
	
	public void prompt(){
		
		new W3SchoolAlertPage()
		.switchframe()
		.clickOnTryIt()
		.sendThekeys("Navya")
		.gettheAlert()
		.acceptTheAlert()
		.Switchdefault()
		.refreshThepage()
		.Waitproperty()
		.switchframe()
		.clickOnTryIt()
	   .dismisstheAlert()
	   .Switchdefault()
	   .clickonHome();
		
		
		
		
		
		
		
		
		
		
	}

}
