package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Username.Xpath"), data);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), data);
		return new  RegistrationPage();
		
		
	}
	
     public RegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), data);
		return new  RegistrationPage();
}
     
     public RegistrationPage clickPreferedLanguage() {
 		
 		clickByXpath(prop.getProperty("RegistrationPage.PreferedLanguage.Xpath"));
 		return new  RegistrationPage();

     }
     
     public RegistrationPage selectLanguage() {
  		
  		clickByXpath(prop.getProperty("RegistrationPage.Language.Xpath"));
  		return new  RegistrationPage();

      }
     
     public RegistrationPage clickOnSecurityQuestion() {
   		
   		clickByXpath(prop.getProperty("RegistrationPage.clickOnSecurityQuestion.Xpath"));
   		return new  RegistrationPage();

       }
     public RegistrationPage selectSecurityQuestion() {
    		
    		clickByXpath(prop.getProperty("RegistrationPage.SelectSecurityQuestion.Xpath"));
    		return new  RegistrationPage();

        }
     
     public RegistrationPage enterSecurityAnswer(String data) {
 		
 		enterByXpath(prop.getProperty("RegistrationPage.securityAnswer.Xpath"), data);
 		return new  RegistrationPage();

     }
     
     public RegistrationPage clickOnContinue() {
    	 
    	 clickByXpath(prop.getProperty("RegistrationPage.clickOnContinue.Xpath"));
    	 return new RegistrationPage();
     }
     
public RegistrationPage enterFirstName(String data) {
    	 enterByXpath(prop.getProperty("RegistrationPage.Firstname.Xpath"), data);
    	 return new RegistrationPage();
     }

public RegistrationPage enterSecondName(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.SecondName.Xpath"), data);
	 return new RegistrationPage();
}
public RegistrationPage enterLastName(String data) {
	 enterByXpath(prop.getProperty("RegistraionPage.LastName.Xpath"), data);
	 return new RegistrationPage();
}    
     
public RegistrationPage clickOnOccupation() {
	 clickByXpath(prop.getProperty("RegistrationPage.ClickOnOccupation.Xpath"));
	 return new RegistrationPage();
}    
      
public RegistrationPage selectOccupation () {
	 clickByXpath(prop.getProperty("RegistrationPage.selectOccupation.Xpath"));
	 return new RegistrationPage();
}  

public RegistrationPage  clickOnDateOfBirth() {
	 clickByXpath(prop.getProperty("RegistrationPage.ClickOnDateOfBirth.Xpath"));
	 return new RegistrationPage();
}





public RegistrationPage  selectMonth(String data) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.ClickOnMonth.Xpath"), data);
	 return new RegistrationPage();
} 
public RegistrationPage  selectYear(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.SelectYear.Xpath"), Value);
	 return new RegistrationPage();
} 

public RegistrationPage clickOnDate() {
	
	clickByXpath(prop.getProperty("RegistrationPage.ClickOnDate.Xpath"));
	return new RegistrationPage();
}


public RegistrationPage  clickOnMarried() {
	 clickByXpath(prop.getProperty("RegistrationPage.ClickOnMarried.Xpath"));
	 return new RegistrationPage();
}   

public RegistrationPage  clickOnUnmarried() {
	 clickByXpath("//label[text()='Unmarried']");
	 return new RegistrationPage();
}   


     
public RegistrationPage  selectNation(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.SelectNation.Xpath"), Value);
	 return new RegistrationPage();
} 

public RegistrationPage  clickOnMale() {
			 clickByXpath("(//span[@class='ui-button-text ui-clickable ng-star-inserted'])[1]");
			 return new RegistrationPage();
		}  

public RegistrationPage  clickOnFemale() {
	 clickByXpath(prop.getProperty("RegistartionPage.ClickOnFemale.Xpath"));
	 return new RegistrationPage();
}  

public RegistrationPage  clickOnTransgender() {
	 clickByXpath("(//span[@class='ui-button-text ui-clickable ng-star-inserted'])[3]");
	 return new RegistrationPage();
}  



public RegistrationPage  enterEmailId(String data) {
	 enterByXpath(prop.getProperty("Registration.Email.Xpath"), data);
	 return new RegistrationPage();
}
public RegistrationPage  enterMobileNumber(String data) {
	 enterByXpath(prop.getProperty("Registration.Mobile.Xpath"), data);
	
	 return new RegistrationPage();
}

public RegistrationPage  selectNationality(String Value) {
	selectVisibileTextByXpath("(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]", Value);
	 return new RegistrationPage();
} 




public RegistrationPage clickOnContinue2() {
	 
	 clickByXpath(prop.getProperty("Registration.clickOnContinue2.Xpath"));
	 return new RegistrationPage();
}

public RegistrationPage enterFlatDoorNo(String data) {
	 enterByXpath(prop.getProperty("Registration.Flat/Door.Xpath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterStreet(String data) {
	 enterByXpath(prop.getProperty("Registration.Street.Xpath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterArea(String data) {
	 enterByXpath(prop.getProperty("Registration.Area.Xpath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterPincode(String data) {
	 enterByXpath(prop.getProperty("Registration.pincode.Xpath"), data);
	 return new RegistrationPage();
}  


public RegistrationPage clickOnState() {
	
	clickByXpath(prop.getProperty("Registration.ClickonState.Xpath"));
	
	return this;
}

public RegistrationPage enterState(String data) {
	 enterByXpath("//input[@name='resState']", data);
	 return new RegistrationPage();
} 

public RegistrationPage  selectCity(String Value) {
	selectVisibileTextByXpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']", Value);
	 return new RegistrationPage();
} 

public RegistrationPage  selectPostoffice(String Value) {
	selectVisibileTextByXpath("//select[@class='form-control ng-dirty ng-invalid ng-touched']", Value);
	 return new RegistrationPage();
} 

public RegistrationPage enterPhone(String data) {
	 enterByXpath("//input[@id='resPhone']", data);
	 return new RegistrationPage();
}

public RegistrationPage  clickOnYes() {
	 clickByXpath(prop.getProperty("Registration.ClickOnYes.Xpath"));
	 return new RegistrationPage();
}

public RegistrationPage  clickOnNo() {
	 clickByXpath("//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on']");
	 return new RegistrationPage();
}

public RegistrationPage clickOnTermsandConditions() {
	 
	 clickByXpath("//input[@class='ng-untouched ng-pristine ng-invalid']");
	 return new RegistrationPage();
}

public RegistrationPage cLickOnRegister() {
	 
	 clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
	 return new RegistrationPage();
}



public RegistrationPage closeAllBrowser() {
	
	closeAllBrowser();
	
	return new RegistrationPage();
}




		
		
	
	

}
