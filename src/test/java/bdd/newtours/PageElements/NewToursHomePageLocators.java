package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursHomePageLocators {

	//Register Link locator
	//finding xpath from page factory using @find by tag>xpath> mention public web element and locator link. ; this way we dont have to bring the driver in position; helps to avoid complicated steps
	@FindBy (xpath="//a[contains(text(),'REGISTER')]")
	public WebElement lnkRegister;
	
	}
