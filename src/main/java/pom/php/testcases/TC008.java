package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PHPRegistrationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To Register php";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC008";
	}
	
	@Test(dataProvider = "fetchData")
	
public void php(String name,String lname,String email,String number,String cname,String add1,String add2,String city,String state,
		String post,String country,String phonenum,String password,String password2){
		
		new PHPRegistrationPage()
		
		.enterFirstName(name)
		.enterLastName(lname)
		.enterEmailAddress(email)
		.clickOnCountryCode()
		.enterCompanyname(cname)
		.enterStreetAddress(add1)
		.enterStreetAddress2(add2)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(post)
		.enterMobile(phonenum)
		.selectCountry(country)
		.enterPassword(password)
		.enterConfirmPassword(password2);
		
	}

}


