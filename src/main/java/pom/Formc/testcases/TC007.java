package pom.Formc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Formc.pages.FormCPage;
import pom.Formc.pages.FormcHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To Register FormC";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC007";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void FormcHomepage(String user,String pwd,String repwd,String qstn,String ans, String name,String gender,String dob,
			String occ,String email,String mob,String phn,String stay,String cap,String add,String state,String city,
			String house,String star,String email1,String contact,String contact1,String name0,String add1,String stateo,
			String city1,String phone1,String phone2,String name3,String add2,String state3,String district,String email3,
			String p1, String p2,String name4,String add4,String State,String city3,String email4,String phone4,String mobile4) {
		
		
		new FormcHomePage()
		
		.clickOnSignUp()
	    .enterUserId(user)
		//.enterPassword(pwd)
		//.enterConfirmPassword(repwd)
		.selectSecurityQuestion(qstn)
		.enterYourAnswer(ans)
		.enterName(name)
		.selectGender(gender)
		.enterDateOfBirth(dob)
		.enterDesignation(occ)
		.enterEmailid(email)
		.enterMobile(mob)
		.enterPhonenumber(phn)
		.selectNationality("INDIA")
		.enterNmae("navya")
		.enterCapacity(cap)
		.enterAddress(add)
		.selectState(state)
		//.selectCity("GUNTUR")
		//.selectAccomodationType(" Bed and Breakfast")
		.selectAccomodationGrade(star)
		.enteremailId(email1)
		.enterMobile1(mob)
		.enterPhoneNumber(phn)
		.enterName1(stay)
		.enterAddress1(add)
		.selectState1(state)
		//.selectCity1("GUNTUR")
		.enterEmailId1(email)
		.enterPhoneNumber1(mob)
		.enterMobileNumber1(phn)
		.enterName2(stay)
		//.enterAddress2("Velechery")
		.selectState2(state)
		//.selectCity2("GUNTUR")
		.enterEmail2(email)
		.enterPhone2(contact)
		.enterMobile2(contact1)
		.enterName3(name)
		.enterAddress3(add1)
		.selectState3(stateo)
		//.selectCity3("GUNTUR")
		.enterEmailId3(email3)
		.enterPhone3(p1)
		.enterMobile3(p2);
		
	}

}
