package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUpDriver {

	public static WebDriver driver;
	
	public static void setupDriver(){  // set up driver for our framework
		
		System.setProperty("webdriver.chrome.driver",  "C:/TTsoftware/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();    //argument: dont show me any notification from chrome.
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
	}
	public static WebDriver getDrive(){   //encapsulation
		return driver;
	}
	public static void tearDownDriver(){
		driver.quit();   //quit the driver
		
	}
}
