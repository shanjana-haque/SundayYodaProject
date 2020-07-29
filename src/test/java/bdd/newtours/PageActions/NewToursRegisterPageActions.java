package bdd.newtours.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.newtours.PageElements.NewToursRegisterPageLocator;
import bdd.utilities.ExcelDraft;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetUpDriver;

public class NewToursRegisterPageActions {
	
	NewToursRegisterPageLocator NewToursRegisterPageLocatorObj;
	
	public NewToursRegisterPageActions(){
		NewToursRegisterPageLocatorObj = new NewToursRegisterPageLocator();
		PageFactory.initElements(SetUpDriver.driver, NewToursRegisterPageLocatorObj);
	}

	public void fillContactInfo() throws Exception{
		
		WebElement element1 = SetUpDriver.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click();
	    
		NewToursRegisterPageLocatorObj.txtFirstName.clear();
		NewToursRegisterPageLocatorObj.txtFirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		NewToursRegisterPageLocatorObj.txtLastName.clear();
		NewToursRegisterPageLocatorObj.txtLastName.sendKeys(ReadExcelSheetData.getMapData("LastName"));
		NewToursRegisterPageLocatorObj.txtPhone.clear();
		NewToursRegisterPageLocatorObj.txtPhone.sendKeys(ReadExcelSheetData.getMapData("Phone"));
		NewToursRegisterPageLocatorObj.txtEmail.clear();
		NewToursRegisterPageLocatorObj.txtEmail.sendKeys(ReadExcelSheetData.getMapData("Email"));
	}
	
	public void fillMailingInfo(){
		NewToursRegisterPageLocatorObj.txtAddress.sendKeys("3234 Alma Drive");
		NewToursRegisterPageLocatorObj.txtCity.sendKeys("Plano");
		NewToursRegisterPageLocatorObj.txtStateProvince.sendKeys("Texas");
		NewToursRegisterPageLocatorObj.txtPostalCode.sendKeys("46363");
		Select dropdown = new Select(NewToursRegisterPageLocatorObj.txtCountry); //calling object
		dropdown.selectByValue("UNITED STATES");  // entering value; 
		//use select class for static type like this that doesnt change
		
		
	}
	public void fillUserInfo(String UserName, String Password){
		NewToursRegisterPageLocatorObj.txtUserName.sendKeys(UserName);
		NewToursRegisterPageLocatorObj.txtPassword.sendKeys(Password);
		NewToursRegisterPageLocatorObj.txtConfirmPassword.sendKeys(Password);
		
	}
	public void submitRegForm(){
		WebDriverWait wait = new WebDriverWait(SetUpDriver.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(NewToursRegisterPageLocatorObj.lnkSubmit));

		
		NewToursRegisterPageLocatorObj.lnkSubmit.click();

	}
} 

