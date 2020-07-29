package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewToursHomePageLocators;
import bdd.utilities.SetUpDriver;

public class NewtoursHomePageActions {
//initialize the object in class level
	
	NewToursHomePageLocators NewToursHomePageLocatorsObj ;
	//call the register locator by connecting action class to locator class through constructor
	public NewtoursHomePageActions(){
		//create object to connect to locator class
		NewToursHomePageLocatorsObj = new NewToursHomePageLocators();   //giving the value to the object
		PageFactory.initElements(SetUpDriver.driver, NewToursHomePageLocatorsObj);  //letting my page factory know that my driver is the chrome driver, so it shows webdriver and object page
	}
	
//load the page
	public void loadNewTourHomePage(){
		//maximize the browser
		SetUpDriver.driver.manage().window().maximize();
		//load the homepage by url
		SetUpDriver.driver.get("http://demo.guru99.com/test/newtours/");
		//set time to load the page
		SetUpDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element1 = SetUpDriver.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click(); //close pop up window on every action class
		
		//SetUpDriver.driver.switchTo().alert().accept();
		//SetUpDriver.driver.switchTo().alert().dismiss();
		//To dismiss confirmation.  
	}
	
	
	
	//sign up on register
	public void navigateRegisterPage(){
		NewToursHomePageLocatorsObj.lnkRegister.click();
//calling the object and selecting lnk from locator class


	}
}

