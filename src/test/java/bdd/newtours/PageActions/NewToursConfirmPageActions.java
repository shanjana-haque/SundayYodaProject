package bdd.newtours.PageActions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewToursConfirmPageLocator;
import bdd.utilities.SetUpDriver;
import junit.framework.Assert;


public class NewToursConfirmPageActions {

	NewToursConfirmPageLocator NewToursConfirmPageLocatorObj;

	public NewToursConfirmPageActions(){
		NewToursConfirmPageLocatorObj = new NewToursConfirmPageLocator();
		PageFactory.initElements(SetUpDriver.driver, NewToursConfirmPageLocatorObj);

	}

	public void VerifyConfirmationPage() throws Exception{
		
		WebElement element1 = SetUpDriver.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click();
	    
	    
		String confirmMsg = NewToursConfirmPageLocatorObj.txtThankYou.getText(); //calling locator
		Assert.assertEquals(confirmMsg, "Thank you for registering. You may now sign-in using the user name and password you've just entered."); //it is used for validation; " then" verification part. every web page needs this.
	//	SetUpDriver.driver.navigate().back();
		
		//Screenshot
		File screenshot = ((TakesScreenshot)SetUpDriver.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\TTsoftware\\Screenshot\\screenshot.jpg"));
		

	}

}
