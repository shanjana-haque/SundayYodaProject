package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursRegisterPageLocator {

	@FindBy(xpath="//input[@name='firstName']")
	public WebElement txtFirstName;

	@FindBy(xpath="//input[@name='lastName']")
	public WebElement txtLastName;

	@FindBy(xpath="//input[@name='phone']")
	public WebElement txtPhone;

	@FindBy(xpath="//input[@id='userName']")
	public WebElement txtEmail;

	@FindBy(xpath="//input[@name='address1']")
	public WebElement txtAddress;

	@FindBy(xpath="//input[@name='city']")
	public WebElement txtCity;

	@FindBy(xpath="//input[@name='state']")
	public WebElement txtStateProvince;

	@FindBy(xpath="//input[@name='postalCode']")
	public WebElement txtPostalCode;

	@FindBy(xpath="//select[@name='country']")
	public WebElement txtCountry;

	@FindBy(xpath="//input[@id='email']")
	public WebElement txtUserName;

	@FindBy(xpath="//input[@name='password']")
	public WebElement txtPassword;

	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement txtConfirmPassword;

	@FindBy(xpath="//input[@name='submit']")
	public WebElement lnkSubmit;
	
	@FindBy(xpath="//input[@id='livesearch-imprint']")
	public WebElement txtImprint;
	
	@FindBy(xpath="//select[@id='color-select']")
	public WebElement txtColor;
	
	@FindBy(xpath="//select[@id='shape-select']")
	public WebElement txtShape;
	
	@FindBy(xpath="//input[@class='ddc-btn btn-block']")
	public WebElement lnkSearch;
	
	
}
