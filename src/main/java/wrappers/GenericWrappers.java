package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
		 prop = new Properties();
		
		prop.load(new FileInputStream("./src/test/java/object.properties"));
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void unloadObjects() {
		
		prop=null;;
		
	}
	
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				driver = new FirefoxDriver();
				
			}
			
			else if(browser.equalsIgnoreCase("ie")) {
				
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with the givern url "+url+" sucessfully");
			
			reportStep("The browser "+browser+" is launched with the givern url "+url+" sucessfully","pass");
			
		} catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" as the url doesnot contain http/https");
			
			reportStep("The browser "+browser+" is not launched with the given url "+url+" as the url doesnot contain http/https", "fail");
		}
		
		catch (SessionNotCreatedException e) {
			
			//System.err.println("The browser "+browser+" is not launched with the url "+url+" due to session not created error");
			
			reportStep("The browser "+browser+" is not launched with the url "+url+" due to session not created error", "fail");
		}
		
		catch (WebDriverException e) {
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
			
		}
		
		
	}

	@Override
	public void enterById(String idValue, String data) {
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with id "+idValue+" is not found in the DOM");
			
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		
		}
		
		catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idValue+" is not visible in application");
			
			reportStep("The element with id \"+idValue+\" is not visible in application", "fail");
		}
		
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element id "+idValue+" is not interactable in the application");
			
			reportStep("The element id \"+idValue+\" is not interactable in the application", "fail");
			
			
		}
		
		catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			
			reportStep("The element with id \"+idValue+\" is not stable in the application", "fail");
			
		}
		catch (UnhandledAlertException e) {
			System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unexpected alert opened");
			
			reportStep("The element with id \"+idValue+\" is not entered with data \"+data+\" due to unexpected alert opened", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error");
			
			reportStep("The element with id "+idValue+" is not entered with the data \"+data+\" due to unknown error", "fail");
		}
     
	}
	

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			reportStep("The element with name "+nameValue+" is entered with the  +data", "pass");
			
			//System.out.println("The element with name "+nameValue+" is entered with the data" +data);
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			
			reportStep("The element with name \"+nameValue+\" is not found in the DOM", "fail");
			
			// TODO Auto-generated catch block
			
		}
		catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
			
			// TODO: handle exception
		}
		catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
			// TODO: handle exception
		}
		catch (ElementNotInteractableException e) {
		
			//System.err.println("The element name "+nameValue+" is not interactable in the application");
			// TODO: handle exception
			reportStep("The element name \"+nameValue+\" is not interactable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			
			System.err.println("The element name "+nameValue+" is not eneterd with data "+data+" due to unexpected alert opened");
			
			reportStep("The element name "+nameValue+" is not eneterd with data "+data+" due to unexpected alert opened", "fail");
			// TODO: handle exception
		}
		catch (WebDriverException e) {
			
			System.err.println("The element with name "+nameValue+" is not enetered with data "+data+" due to unknown error");
			// TODO: handle exception
			
			reportStep("The element with name \"+nameValue+\" is not enetered with data \"+data+\" due to unknown error", "fail");
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			System.out.println("The element with xpath "+xpathValue+" is entered with the data" +data);
			
			reportStep("The element with xpath "+xpathValue+" is entered with the data" +data,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			
			// TODO: handle exception
			
			System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathValue+" is not visible in the application","fail");
		}
		catch (StaleElementReferenceException e) {
			
			//System.err.println("The elemnet with xpath "+xpathValue+" is not stable in the application");
			// TODO: handle exception
			
			reportStep("The elemnet with xpath "+xpathValue+" is not stable in the application", "fail");
		}
		
		catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			// TODO: handle exception
			
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unexpected alert opened");
			// TODO: handle exception
			
			reportStep("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unexpected alert opened", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error");
			
			reportStep("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
	try {
		String actualTitle =driver.getTitle();
		if(actualTitle.equals(title)) {
			//System.out.println("The title of the page "+actualTitle+" is matched with the"+title);
			
			reportStep("The title of the page "+actualTitle+" is matched with the"+title, "pass");
		}
		else {
			//System.err.println("The title of the page "+actualTitle+" is not matched with the"+title);
			
			reportStep("The title of the page "+actualTitle+" is not matched with the +title", "fail");
		}
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("The title of the page "+title+" is not matched due to unknown error");
		
		reportStep("The title of the page "+title+" is not matched due to unknown error", "fail");
	}
	
	}
	

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
	
	
	try {
		String actualText=driver.findElementById(id).getText();
		if(actualText.equals(text)) {
			//System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with the expected text"+text);
		reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with the expected text"+text, "pass");
		}
		
		else {
			//System.err.println("The element with id "+id+"is holding the text "+actualText+" is not matched with the expected text"+text);
			
			reportStep("The element with id "+id+"is holding the text "+actualText+" is not matched with the expected text+text", "fail");
		}
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with id "+id+" is not found in the DOM");
		reportStep("The element with id "+id+" is not found in the DOM", "fail");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not visible in the application");
		
		reportStep("The element with id "+id+" is not visible in the application", "fail");
	}
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not interactble with the application");
		
		reportStep("The element with id "+id+" is not interactble with the application", "fail");
				
	}
	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not stable in the application");
		
		reportStep("The element with id "+id+" is not stable in the application", "fail");
	}
	catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not matched with the text "+text+" due to unexpected alert found");
		
		reportStep("The element with id "+id+" is not matched with the text "+text+" due to unexpected alert found", "fail");
	}
	catch (WebDriverException e) {
		
		//System.err.println("The element with id "+id+" is not matched with the text "+text+" due to unknown error");
		// TODO: handle exception
		
		reportStep("The element with id "+id+" is not matched with the text "+text+" due to unknown error", "fail");
	}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	try {
		String realText=driver.findElementByXPath(xpath).getText();
		
		if(realText.equals(text)) {
			//System.out.println("The element with xpath "+xpath+" holding the text "+realText+" is matched with the expected text"+text);
			reportStep("The element with xpath "+xpath+" holding the text "+realText+" is matched with the expected text +text", "pass");
		}
		else {
			//System.err.println("The element with xpath "+xpath+" is holding the text "+realText+" is not matched with the expected text"+text);
		reportStep("The element with xpath "+xpath+" is holding the text "+realText+" is not matched with the expected text +text", "fail");
		}
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
	reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not visible in the application");
		
		reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
	}
	catch (ElementNotInteractableException e) {
		
		//System.err.println("The element with xpath "+xpath+" is not interactable with the application");
		// TODO: handle exception
		
		reportStep("The element with xpath "+xpath+" is not interactable with the application", "fail");
	}
	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not stable in the application");
	reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
	}
	catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The elemnt with xpath "+xpath+" is not matched with the text "+text+" due to unexpected alert found");
		
		reportStep("The elemnt with xpath "+xpath+" is not matched with the text "+text+" due to unexpected alert found", "fail");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not matched with the expected text "+text+" due to unknown error");
		
		reportStep("The element with xpath "+xpath+" is not matched with the expected text "+text+" due to unknown error", "fail");
	}
	
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText =driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" contains the expected text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" contains the expected text "+text, "pass");
			}
			else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" contains the expected text"+text);
			reportStep("The element with xpath \"+xpath+\" is holding the text \"+actualText+\" contains the expected text\"+text", "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in DOM");
			
			reportStep("The element with xpath \"+xpath+\" is not found in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath \"+xpath+\" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable with the application");
			
			reportStep("The element with xpath \"+xpath+\" is not interactable with the application", "fail");
		}
		
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath \"+xpath+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not contains expected text "+text+" due to unexpected alert found");
			
			reportStep("The element with xpath \"+xpath+\" is not contains expected text \"+text+\" due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not contains the expected text "+text+" due to unknown error");
		reportStep("The element with xpath \"+xpath+\" is not contains the expected text \"+text+\" due to unknown error", "fail");
		
		}
		
		
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			
			//System.out.println("The element with id "+id+" is clickable");
			
			reportStep("The element with id "+id+" is clickable", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id \"+id+\" is not found in the DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the application");
			
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with  id "+id+" is not clickable");
			
			reportStep("The element with  id \"+id+\" is not clickable", "fail");
		}
		catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with id "+id+" is not interactable with the application");
			
			reportStep("The element with id \"+id+\" is not interactable with the application", "fail");
			// TODO: handle exception
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id \"+id+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clickable due to unexpected alert found");
			
			reportStep("The element with id \"+id+\" is not clickable due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The elemen with id "+id+" is not clickable due to unknown error");
			
			reportStep("The element with id \"+id+\" is not clickable due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			
			//System.out.println("The element with classname "+classVal+" is clickable");
			
			reportStep("The element with classname "+classVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+classVal+" is not found in the DOM");
			
			reportStep("The element with classname \"+classVal+\" is not found in the DOM", "fail");
			
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the application");
			
			reportStep("The element with classname \"+classVal+\" is not visible in the application", "fail");
		}
		
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clickable");
			
			reportStep("The element with classname \"+classVal+\" is not clicked", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not interactable with the application");
			
			reportStep("The element with classname \"+classVal+\" is not interactable with the application", "fail");
		}
		
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not stable in the application");
			
			reportStep("The element with the classname \"+classVal+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clickable due to unexpected alert found");
			
			reportStep("The element with classname \"+classVal+\" is not clickable due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clickable due to unknown error");
			
			reportStep("The element with classname \"+classVal+\" is not clickable due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			
			//System.out.println("The element with name "+name+" is clickable");
			
			reportStep("The element with name "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			
			reportStep("The element with name \"+name+\" is not found in the DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			
			reportStep("The element with name \"+name+\" is not visible in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clickable");
			
			reportStep("The element with name \"+name+\" is not clicked", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable with the application");
			
			reportStep("The element with name \"+name+\" is not interactable with the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			
			reportStep("The element with name \"+name+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clickable due to unexpected alert found");
			
			reportStep("The element with name \"+name+\" is not clicked due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clickable due to unknown error");
			
			reportStep("The element with name \"+name+\" is not clicked due to unknown error", "fail");
		}
		
	}
	
	
	

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with LinkText "+name+" is clickable ");
			
			reportStep("The element with LinkText "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+name+" is not found in DOM");
			
			reportStep("The element with LinkText \"+name+\" is not found in DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			
			//System.err.println("The element with LinkText "+name+" is not visible in the application");
			
			reportStep("The element with LinkText \"+name+\" is not visible in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clickable");
			
			reportStep("The element with LinkText \"+name+\" is not clicked", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable in the application");
			
			reportStep("The element with LinkText \"+name+\" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			
			reportStep("The element with LinkText \"+name+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clickable due to unexpected alert found");
			
			reportStep("The element with LinkText \"+name+\" is not clicked due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clickable due to unknown error");
			
			reportStep("The element with LinkText \"+name+\" is not clicked due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with LinkNoSnap "+name+" is clickable");
			
			reportStep("The element with LinkNoSnap "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element LinkNoSnap "+name+" is not found in DOM");
			
			reportStep("The element LinkNoSnap \"+name+\" is not found in DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not visible in the application");
			
			reportStep("The element LinkNoSnap \"+name+\" is not visible in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not clickable");
			
			reportStep("The element LinkNoSnap \"+name+\" is not clicked", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not interactable in the application");
			
			reportStep("The element LinkNoSnap \"+name+\" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not stable in the application");
			
			reportStep("The element LinkNoSnap \"+name+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not clickable due to unexpected alert");
			
			reportStep("The element LinkNoSnap \"+name+\" is not clicked due to unexpected alert", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element LinkNoSnap "+name+" is not clickable due to unknown error");
			
			reportStep("The element LinkNoSnap \"+name+\" is not clickable due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element xpath "+xpathVal+" is clickable");
			
			reportStep("The element xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element xpath "+xpathVal+" is not found in DOM");
			
			reportStep("The element xpath "+xpathVal+" is not found in DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element xpath "+xpathVal+" is not visible in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element xpath "+xpathVal+" is not clickable");
			
			reportStep("The element xpath "+xpathVal+" is not clicked", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element xpath "+xpathVal+" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element xpath "+xpathVal+" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element xpath "+xpathVal+" is not clickable due to unepected alert");
			
			reportStep("The element xpath "+xpathVal+" is not clickable due to unepected alert", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The elemt xpath "+xpathVal+" is not clickable due to unknown error");
			
			reportStep("The elemt xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with xpath "+xpathVal+" is clickable");
			
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath \"+xpathVal+\" is not found in the DOM", "fail",false);
			}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath \"+xpathVal+\" is not visible in the application", "fail",false);
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable");
			
			reportStep("The element with xpath \"+xpathVal+\" is not clicked", "fail",false);
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element with xpath \"+xpathVal+\" is not interactable in the application", "fail",false);
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not able to perform click action due to unexpected alert");
		reportStep("The element with xpath \"+xpathVal+\" is not able to perform click action due to unexpected alert", "fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not able to perform click action due to unknown error");
			
			reportStep("The element with Xpath \"+xpathVal+\" is not able to perform click action due to unknown error", "fail",false);
		}

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String Text = null;
		try {
		 Text=driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holding the text "+Text);
		 
		 reportStep("The element with id "+idVal+" is holding the text "+Text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			
			reportStep("The element with id "+idVal+" is not found in the DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not able to get the text due to unexpected alert found");
			
			reportStep("The element with id "+idVal+" is not able to get the text due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not able to get the text due to unknown error");
			
			reportStep("The element with id "+idVal+" is not able to get the text due to unknown error", "fail");
		}
		
		return Text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String Text = null;
		try {
		Text=driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The element with xpath "+xpathVal+" is able to get the text");
		
		reportStep("The element with xpath "+xpathVal+" is able to get the text", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath \"+xpathVal+\" is not found in the DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in the application");
			
			reportStep("The element with xpath \"+xpathVal+\" is not found in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element with xpath \"+xpathVal+\" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath \"+xpathVal+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not able to get the text due to unexpected alert found");
			
			reportStep("The element with xpath \"+xpathVal+\" is not able to get the text due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not able to get the text due to unknown error");
			
			reportStep("The element with xpath \"+xpathVal+\" is not able to get the text due to unknown error", "fail");
			
			System.out.println(Text);
		}
		
		return Text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement object=driver.findElementById(id);
			
			Select name = new Select(object);
			name.selectByVisibleText(value);
			
			//System.out.println("The elemnet with id "+id+" is selected with the visbile text "+value);
			
			reportStep("he elemnet with id "+id+" is selected with the visbile text "+value,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+"is selected with the visible text "+value+" is not found in the DOM");
			
			reportStep("The element with id "+id+"is selected with the visible text "+value+" is not found in the DOM", "fail");
			
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The elemnet with id "+id+" is selected with the visible text "+value+" is not selectable");
			
			reportStep("The elemnet with id "+id+" is selected with the visible text "+value+" is not selectable", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not visible in the application");
			
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not interactablein the application");
			
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not interactablein the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+"is not stablein the application");
			
			reportStep("The element with id "+id+" is selected with the visible text "+value+"is not stablein the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The elemnet with id "+id+" is not able to select due to unexpected alert found");
			
			reportStep("The elemnet with id "+id+" is not able to select due to unexpected alert found", "fail");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select due to unknown error");
			
			reportStep("The element with id "+id+" is not able to select due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement object = driver.findElementById(id);
			
			Select name = new Select(object);
			name.selectByIndex(value);
			
			//System.out.println("The element with id "+id+" is selected");
			
			reportStep("The element with id "+id+" is selected", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id \"+id+\" is not found in the DOM", "fail");
			
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected");
			
			reportStep("The element with id \"+id+\" is not selected", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id \"+id+\" is not visible in the application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			
			reportStep("The element with id \"+id+\" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id \"+id+\" is not stable in the application", "fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select due to unexpected alert found");
			
			reportStep("The element with id \"+id+\" is not able to select due to unexpected alert found", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with  id "+id+" is not able to select due to unknown error");
			
			reportStep("The element with  id \"+id+\" is not able to select due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> parentWindow = driver.getWindowHandles();
			
      for(String eachID : parentWindow ) {
				
				driver.switchTo().window(eachID);
				break;
			}
      
     // System.out.println("Switched to the parentWindow");
      
      reportStep("Switched to the parentWindow", "pass");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The required window is not be able to switch due to unexpected alert found");
			
			reportStep("The required window is not be able to switch due to unexpected alert found", "fail");
		}
		catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The required window is not be able to switch due to window name is not found");
			
			reportStep("The required window is not be able to switch due to window name is not found", "fail");
		}
		
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			
			reportStep("The required window is not able to switch due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> LastWindow = driver.getWindowHandles();
			
			for(String eachID : LastWindow ) {
				
				driver.switchTo().window(eachID);
			}
			//System.out.println("Switched to the last window");
			
			reportStep("Switched to the last window", "pass");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The required window is not able to switch due to unexpected alert found");
			
			reportStep("The required window is not able to switch due to unexpected alert found", "fail");
		}
		catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to window name not found");
			
			reportStep("The required window is not able to switch due to window name not found", "fail");
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			
			reportStep("The required window is not able to switch due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			
			//System.out.println("Alert is accepted");
			
			reportStep("Alert is accepted", "pass",false);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not accepted due to no alert found");
			
			reportStep("Alert is not accepted due to no alert found", "fail",false);
			}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not accepted due to unknown error found");
			
			reportStep("Alert is not accepted due to unknown error found", "fail",false);
		}
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("The alert got dismissed");
			
			reportStep("The alert got dismissed", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not dismissed due to no alert found");
			
			reportStep("Alert is not dismissed due to no alert found", "fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not dismissed due to unknown error");
			
			reportStep("Alert is not dismissed due to unknown error", "fail",false);
		}
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		
		
		
		String  alertText = null;
	try {
		 alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		//System.out.println("Got the text from alert");
		
		reportStep("Got the text from alert", "pass",false);
	} catch (NoAlertPresentException e) {
		// TODO Auto-generated catch block
		//System.err.println("Text is not present due to no alert found");
		
		reportStep("Text is not present due to no alert found", "fail",false);
		
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("Text is not found due to unknown error");
		
		reportStep("Text is not found due to unknown error", "fail",false);
	}
	
	
		return alertText;
	}

	
	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		
		try {
			
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			
			File temp = driver.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(temp, destination);
			
			//System.out.println("Screen shot captured sucessfully");
			
			//reportStep("Screen shot captured sucessfully", "pass");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Screenshot is not taken due to unknown error found");
			
			reportStep("Screenshot is not taken due to unknown error found", "fail", false);
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Screen shot is not captured due to IO exception");
			
			reportStep("Screen shot is not captured due to IO exception", "fail", false);
		}
		
		return number;
		
}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("browser got closed");
			 
			reportStep("browser got closed", "pass", false);
		} 
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not closed due to unknown error found");
			
			reportStep("The window is not closed due to unknown error found", "fail");
		}
	
		}
		
	

	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			
			//System.out.println("All window are closed");
			
			reportStep("The window is closed", "pass", false);
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Windows are not closed due to unknown error found");
			
			reportStep("Windows are not closed due to unknown error found", "fail");
		}
		
	}

	@Override
	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
	}

	@Override
	public void selectVisibileTextByXpath(String xpathval, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement object = driver.findElementByXPath(xpathval);
			
			Select sel = new Select(object);
			
			sel.selectByVisibleText(value);
			
			//System.out.println("The element with xpath "+xpathval+" is selcted");
			
			reportStep("The element with xpath "+xpathval+" is selcted", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathval+"is not found in the Dom");
			
			reportStep("The element with xpath "+xpathval+"is not found in the Dom", "fail");
		}
			catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The elemnet with "+xpathval+" is selected with the visible text "+value+" is not selectable");
				
				reportStep("The elemnet with "+xpathval+" is selected with the visible text "+value+" is not selectable", "fail");
			}
			catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with "+xpathval+" is selected with the visible text "+value+" is not visible in the application");
				
				reportStep("The element with "+xpathval+" is selected with the visible text "+value+" is not visible in the application", "fail");
			}
			catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with "+xpathval+" is selected with the visible text "+value+" is not interactablein the application");
			reportStep("The element with "+xpathval+" is selected with the visible text "+value+" is not interactablein the application", "fail");
			}
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with "+xpathval+" is selected with the visible text "+value+"is not stablein the application");
				
				reportStep("The element with "+xpathval+" is selected with the visible text "+value+"is not stablein the application", "fail");
			}
			catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The elemnet with "+xpathval+" is not able to select due to unexpected alert found");
				
				reportStep("The elemnet with "+xpathval+" is not able to select due to unexpected alert found", "fail");
				
			}
			catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with "+xpathval+" is not able to select due to unknown error");
				
				reportStep("The element with "+xpathval+" is not able to select due to unknown error", "fail");
			}
			
			
		
		
		
		
	}

	@Override
	public void selectVisibleTextByName(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement object = driver.findElementByName(id);
			
			Select sel = new Select(object);
			sel.selectByVisibleText(value);
			
			//System.out.println("Selected the visible text");
			
			reportStep("Selected the visible text", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+"is not found in the Dom");
			
			reportStep("The element with id \"+id+\"is not found in the Dom", "fail");
		}
			catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The elemnet with id "+id+" is selected with the visible text "+value+" is not selectable");
				
				reportStep("The elemnet with id \"+id+\" is selected with the visible text \"+value+\" is not selectable", "fail");
			}
			catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not visible in the application");
				
				reportStep("The element with id \"+id+\" is selected with the visible text \"+value+\" is not visible in the application", "fail");
			}
			catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not interactablein the application");
				
				reportStep("The element with id \"+id+\" is selected with the visible text \"+value+\" is not interactablein the application", "fail");
			}
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is selected with the visible text "+value+"is not stablein the application");
				
				reportStep("The element with id \"+id+\" is selected with the visible text \"+value+\"is not stablein the application", "fail");
			}
			catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The elemnet with id "+id+" is not able to select due to unexpected alert found");
				
				reportStep("The elemnet with id \"+id+\" is not able to select due to unexpected alert found", "fail");
				
			}
			catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not able to select due to unknown error");
				
				
				reportStep("The element with id \"+id+\" is not able to select due to unknown error", "fail");
			}
			
	}

	@Override
	public void switchToFrame(String id) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(id);
			
			//System.out.println("Switched to the required frame");
			
			reportStep("Switched to the required frame", "pass",false);
			
			
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			
			reportStep("The required window is not able to switch due to unknown error", "fail",false);
		}
		
		
	}

	@Override
	public void switchtoFrameByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			WebElement myframe = driver.findElementByXPath(xpath);
			
			driver.switchTo().frame(myframe);
			//System.out.println("switched to frame");
			
			reportStep("switched to frame", "pass",false);
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			
			reportStep("The required window is not able to switch due to unknown error", "fail",false);
		}
		
		
	}

	@Override
	public void defaultcontent() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
			
			//System.out.println("switched to default conetent");
			
			reportStep("switched to default conetent", "pass",false);
		}
	catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch  to default due to unknown error");
		
		reportStep("The required window is not able to switch  to default due to unknown error", "fail",false);
		}
		
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			
			//System.out.println("refreshed");
			
			reportStep("The page got refreshed", "pass",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Windows are not reftreshed due to unknown error found");
			
			reportStep("Windows are not reftreshed due to unknown error found", "fail",false);
		}
		
	}

	@Override
	public void sendkeys(String Value) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(Value);
			
			//System.out.println("sended Value" +Value);
			
			reportStep("sended Value" +Value, "pass",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The sendkeys are not able to send the "+Value+" due to unknown error found");
			
			reportStep("The sendkeys are not able to send the \"+Value+\" due to unknown error found", "fail",false);
		}
		
		
	}

	@Override
	public void alert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert();
			
			//System.out.println("Switched to the alert");
			
			reportStep("Switched to the alert", "pass");
			
			
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Not able to switch to alert due to unknown error found");
			
			reportStep("Not able to switch to alert due to unknown error found", "fail");
		}
		
	}

	@Override
	public void MouseHoverByXpath(String xpathValue) {
		// TODO Auto-generated method stub
		
		try {
			Actions builder = new Actions(driver);
			
			WebElement holidays =  driver.findElementByXPath(xpathValue);
			
			builder.moveToElement(holidays).perform();
			
			reportStep("The Element with value Holidays has performed click", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
	
		}
		
	}

		
	}

	

	
		
	


