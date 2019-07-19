$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Com/Second/WithExample.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters outline \"\u003cemail\u003e\" in the email field",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter outline \u003cpassword\u003e in the password feild",
  "keyword": "And "
});
formatter.step({
  "name": "Click on login",
  "keyword": "When "
});
formatter.step({
  "name": "The home page is visible",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "abcd123@gmail",
        "123"
      ]
    },
    {
      "cells": [
        "efgh456@gmail",
        "456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters outline \"abcd123@gmail\" in the email field",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepoutline.enter_in_the_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter outline 123 in the password feild",
  "keyword": "And "
});
formatter.match({
  "location": "Stepoutline.enter_in_the_password_feild(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "When "
});
formatter.match({
  "location": "Stepoutline.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The home page is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepoutline.the_home_page_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters outline \"efgh456@gmail\" in the email field",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepoutline.enter_in_the_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter outline 456 in the password feild",
  "keyword": "And "
});
formatter.match({
  "location": "Stepoutline.enter_in_the_password_feild(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "When "
});
formatter.match({
  "location": "Stepoutline.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The home page is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepoutline.the_home_page_is_visible()"
});
formatter.result({
  "status": "passed"
});
});