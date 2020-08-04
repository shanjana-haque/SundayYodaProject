$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewtoursRegister.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to create account",
  "description": "",
  "id": "users-ability-to-create-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newtour"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"\u003cUserName\u003e\"  with \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 13,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;1"
    },
    {
      "cells": [
        "Angela",
        "abc123"
      ],
      "line": 14,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3074669600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"Angela\"  with \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 3412926800,
  "status": "passed"
});
formatter.match({
  "location": "NewToursRegisterSteps.navigate_to_Register_page()"
});
formatter.result({
  "duration": 1011131900,
  "status": "passed"
});
formatter.match({
  "location": "NewToursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 3387010800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Angela",
      "offset": 27
    },
    {
      "val": "abc123",
      "offset": 42
    }
  ],
  "location": "NewToursRegisterSteps.complete_creating_account_with(String,String)"
});
formatter.result({
  "duration": 1142377500,
  "status": "passed"
});
formatter.match({
  "location": "NewToursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 2434181800,
  "status": "passed"
});
formatter.after({
  "duration": 132500,
  "status": "passed"
});
});