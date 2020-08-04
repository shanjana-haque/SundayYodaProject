package bdd.happylark.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bdd.utilities.SetUpDriver;

public class HappylarkHomePage {
	
	public void HoverOver () throws Exception{
		
		SetUpDriver.driver.manage().window().maximize();
		SetUpDriver.driver.get("https://www.usps.com/");
		SetUpDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//hover over
		Actions actions = new Actions(SetUpDriver.driver);
		WebElement business = SetUpDriver.driver.findElement(By.xpath("//a[@class='menuitem'][contains(text(),'Business')]"));
		actions.moveToElement(business);
		actions.perform();
        
		//click on element
		WebElement prices = SetUpDriver.driver.findElement(By.xpath("//ul[3]//li[7]//a[1]"));
		prices.click();
		
		//hover over by visibility >find element >click
		JavascriptExecutor js = (JavascriptExecutor) SetUpDriver.driver;
		WebElement Element = SetUpDriver.driver.findElement(By.linkText("Newsroom"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(1000);
		
		Element.click();
		
		
	}

}
