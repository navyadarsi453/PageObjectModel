package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import pom.irctc.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers  {
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To Register irctc";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void irctcRegistration(String name, String password, String confirm, String petname,String Firstname,String middle,String lastname,String Month, String year,
			String country, String email,String mobile,String Adress1,String ad2,String ad3,String pincode,String state,String city, String place, String phone , String office, String offad,String offpincode, String offstate, String offcity, String offplace, String offphn) {
		
		new HomePage()
		
		.clickOnRegister()
		.enterUserName(name)
		.enterPassword(password)
		.enterConfirmPassword(confirm)
		.clickPreferedLanguage()
		.selectLanguage()
		.clickOnSecurityQuestion()
		.selectSecurityQuestion()
		.enterSecurityAnswer(petname)
		.clickOnContinue()
		.enterFirstName(Firstname)
		.enterSecondName(middle)
		.enterLastName(lastname)
		.clickOnOccupation()
		.selectOccupation()
		.clickOnDateOfBirth()
		.selectMonth(Month)
		.selectYear(year)
		.clickOnDate()
		.clickOnMarried()
		.clickOnUnmarried()
		.selectNation(country)
		.clickOnMale()
		.clickOnFemale()
		.clickOnTransgender()
		.enterEmailId(email)
		.enterMobileNumber(mobile)
		.selectNationality("India")
		.clickOnContinue2()
		.enterFlatDoorNo(ad2)
		.enterStreet(ad3)
		.enterArea("AGScolony")
		.enterPincode(pincode)
		.clickOnState()
		//.enterState("Tamilnadu")
		//.selectCity("Chennai")
		//.selectPostoffice("Velacheri S.O")
		.enterPhone(phone)
		
		//.clickOnNo()
		.clickOnYes();
		//.clickOnTermsandConditions()
		//.cLickOnRegister()
	
		
		
		
		
		
		
	}
	

}
