package bdd.utilities;

import cucumber.api.java.After;

public class AfterActions {

	@After
	public void afterAction(){
//		SetUpDriver.tearDownDriver();
		System.out.println("---Test Completed---");
	}
}
//after each just close the browser.