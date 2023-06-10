package pom.ssc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.SSCHomePage;
import pom.ssc.pages.SSCRegistrationPage;
import wrappers.ProjectWrappers;

public class TC006  extends ProjectWrappers{
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To Register ssc";
		author="Navya";
		category="Smoke";
		browserName="chrome";
		url="https://ssc.nic.in/";
		sheetName="TC006";
	}
	
	@Test(dataProvider = "fetchData")
	
	
public void SSC(String Adhar, String verify, String Name , String verifyname, String Newname, String father, String verifyfat,
		String mother, String verifymoth,String dob,String vdob,String board,String ddl,String num,String vnum, String yop,
		String dyop,String edu,String mob,String vermob,String email, String vemail,String state) {
		
		new  SSCHomePage()
		.ClickOnNewRegistration()
		.clickOnYes()
		//.clickOnNO()
		.enterAdharNumber(Adhar)
		.enterConfirmAdharNumber(verify)
		//.selectType("")
		//.enterIDnumber("")
		.enterName(Name)
		.enterVerifyName(verifyname)
		//.clickOnChangeNameNo()
		.clickOnChangeNameYes()
		.enterNewName(Newname)
		.enterFathersName(father)
		.enterVerifyFatherName(verifyfat)
		.enterMotherName(mother)
		.enterVerifyMotherName(verifymoth)
		.enterDate(dob)
		.enterVerifyDate(vdob)
		.selectEducationBoard(board)
		.selectVerifyEducationBoard(ddl)
		.enterRollNumber(num)
		.enterVerifyRollNumber(vnum)
		.selectYeraOfPassing(yop)
		.selectVerifyYearOfPassing(dyop)
		//.clickOnMale()
		.clickOnFemale()
		////.clickOnTransGender()
		//.clickOnVerifyMale()
		.clickOnVerifyFemale()
		//.clickOnVerifyTransGender()
		.selectLevelOfEducationQualification(edu)
		.enterMobileNumber(mob)
		.enterVerifyMobileNumber(vermob)
		.enterEmailId(email)
		.enterVerifyEmailId(vemail)
		.selectStatePermanentAddress(state);
		
	}
}


