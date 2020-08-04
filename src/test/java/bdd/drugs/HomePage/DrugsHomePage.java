package bdd.drugs.HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import bdd.utilities.SetUpDriver;

public class DrugsHomePage {

public void PillIdentifier () throws Exception{
		
		SetUpDriver.driver.manage().window().maximize();
		SetUpDriver.driver.get("https://www.drugs.com/");
		SetUpDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement pillidentifier = SetUpDriver.driver.findElement(By.xpath("//li[@class='ddc-header__nav-item']//a[contains(text(),'Pill Identifier')]"));
		pillidentifier.click();
		
		JavascriptExecutor js = (JavascriptExecutor) SetUpDriver.driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement accept = SetUpDriver.driver.findElement(By.xpath("//a[@class='ddc-btn']"));
		Thread.sleep(1000);
		accept.click();
		
		}
}
