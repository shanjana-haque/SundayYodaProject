@newtour @regression
Feature: Users ability to create account 

Scenario Outline: User should able to create account using Register 

	Given Browse to Newtours homepage
	When Navigate to Register page 
	And Fill form with some basic information 
	And Complete creating account "<UserName>"  with "<Password>"
	Then Verify account created successfully 
	
	Examples: 
		|UserName | Password |
		|Angela	  | abc123   |
		
		