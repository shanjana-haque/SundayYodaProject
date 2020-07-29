package bdd.stepDef;

import bdd.newtours.PageActions.NewToursConfirmPageActions;
import bdd.newtours.PageActions.NewToursRegisterPageActions;
import bdd.newtours.PageActions.NewtoursHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursRegisterSteps {
	
	NewtoursHomePageActions NewtoursHomePageActionsObj = new NewtoursHomePageActions();
	NewToursRegisterPageActions NewToursRegisterPageActionsObj = new NewToursRegisterPageActions();
	NewToursConfirmPageActions NewToursConfirmPageActionsObj = new NewToursConfirmPageActions();
	
	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		NewtoursHomePageActionsObj.loadNewTourHomePage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		NewtoursHomePageActionsObj.navigateRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		NewToursRegisterPageActionsObj.fillContactInfo();
		NewToursRegisterPageActionsObj.fillMailingInfo();
		
		
	}

	@When("^Complete creating account \"([^\"]*)\"  with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName, String Password) throws Throwable {
		NewToursRegisterPageActionsObj.fillUserInfo(UserName, Password);
		NewToursRegisterPageActionsObj.submitRegForm();
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		NewToursConfirmPageActionsObj.VerifyConfirmationPage();
	}


}
