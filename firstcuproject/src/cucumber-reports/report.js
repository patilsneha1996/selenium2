$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/caseLogin.feature");
formatter.feature({
  "name": "TestMeApp feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login and addto cart scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "URL of TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "caselogin.url_of_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login credientials",
  "keyword": "When "
});
formatter.match({
  "location": "caselogin.login_credientials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds new product",
  "keyword": "And "
});
formatter.match({
  "location": "caselogin.user_adds_new_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "caselogin.product_is_added_successfully()"
});
formatter.result({
  "status": "passed"
});
});