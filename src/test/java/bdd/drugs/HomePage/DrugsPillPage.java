package bdd.drugs.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.NewToursRegisterPageLocator;
import bdd.utilities.SetUpDriver;

public class DrugsPillPage {
	
	NewToursRegisterPageLocator NewToursRegisterPageLocatorObj;
	
	
	public DrugsPillPage(){
		
		NewToursRegisterPageLocatorObj = new NewToursRegisterPageLocator();
		PageFactory.initElements(SetUpDriver.driver, NewToursRegisterPageLocatorObj);
	
		
	}
	
	public void enterinfo () throws Exception {
		
		JavascriptExecutor scroll = (JavascriptExecutor) SetUpDriver.driver;
		scroll.executeScript("window.scrollBy(0,300)");
		
		NewToursRegisterPageLocatorObj.txtImprint.clear();
		NewToursRegisterPageLocatorObj.txtImprint.sendKeys("I 13");
		WebElement med = SetUpDriver.driver.findElement(By.xpath("//div[@id='ls-wrap']//a[1]"));
		med.click();
		
		Select drop = new Select(NewToursRegisterPageLocatorObj.txtColor); 
		drop.selectByVisibleText("White"); 
		
		Select down = new Select(NewToursRegisterPageLocatorObj.txtShape); 
		down.selectByVisibleText("Capsule-shape"); 
		
		
		Thread.sleep(1000);
		
		NewToursRegisterPageLocatorObj.lnkSearch.click();
		
	}

}
