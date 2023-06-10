package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class HotelPage  extends GenericWrappers{
	
	
	public HotelPage switchToHotelWindow() {
		switchToLastWindow();
		return new HotelPage();
	}
	
public GuestUserLogin clickOnLogin() {
		
		clickByXpath(prop.getProperty("HotelPage.ClickOnLogin.Xpath"));
		
		return  new GuestUserLogin();
	}
	
	
	


	

public HotelPage enterDestination(String data) {
	
	enterByXpath(prop.getProperty("HotelPage.EnterDestination.Xpath"), data);
	
	return new HotelPage();
	
}

public HotelPage Waitproperty() {
	
	waitproperty(1000);
	
	return new HotelPage();
}

public HotelPage ClickOnCity() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOncity.Xpath"));
	
	return  this;
}

public HotelPage ClickOnDate1() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOndate1.Xpath"));
	
	return new HotelPage();
}


public HotelPage click1OnYear() {
	
	clickByXpath(prop.getProperty("HotelPage.Click1onYear.Xpath"));
	
	return this;
}

public HotelPage ClickOnYear() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnYear.Xpath"));
	
	return new HotelPage();
}


public HotelPage ClickOnMonth() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnMonth.Xpath"));
	
	return this;
}

public HotelPage ClickOnDate() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOndate.Xpath"));
	
	return this;
}






		public HotelPage ClickOnReturnDateOfTravel() {
			
			clickByXpath(prop.getProperty("HotelPage.ReturnDateofTravel.Xpath"));
			
			return new HotelPage();
		}
		
		
		public HotelPage ClickOnYear1() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnYear1.Xpath"));
			
			return this;
		}
		
		
		public HotelPage clickOnReturnYear() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnreturnYear.Xpath"));
			return this;
			
			
		}
		
		public HotelPage clickOnreturnMonth() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnreturnMonth.Xpath"));
			return this;
		}
		
		public HotelPage ClickOnReturnDate() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnreturnDate.Xpath"));
			return this;
		}
		








public HotelPage ClickOnGuest() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnGuest.Xpath"));
	
	return new HotelPage();
}


public HotelPage selectRooms(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("HotelPage.SelectRooms.Xpath"), data);
	
	return new HotelPage();
}

public HotelPage selectAdults(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("HotelPage.Selectadults.Xpath"), data);
	
	return new HotelPage();
}

public HotelPage ClickOnDone() {
	
	clickByXpath(prop.getProperty("HotelPage.clickondone.Xpath"));
	
	return new HotelPage();
}

public HotelSerachPage ClickOnFindHotel() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnfindHotel.Xpath"));
	
	return new HotelSerachPage();
}





	










}
