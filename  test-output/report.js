$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/KundanSirProject/TescoDemo/src/test/java/com/qa/example/features/shopGroceries.feature");
formatter.feature({
  "line": 1,
  "name": "Tesco Website Application Test",
  "description": "",
  "id": "tesco-website-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Ordering the Product",
  "description": "",
  "id": "tesco-website-application-test;validate-ordering-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User logs into the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User searches the product",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "User adds the required product and checksout",
  "keyword": "And "
});
formatter.match({
  "location": "ShopGroceriesStepDefinition.user_logs_into_the_application()"
});
formatter.result({
  "duration": 25529008700,
  "status": "passed"
});
formatter.match({
  "location": "ShopGroceriesStepDefinition.user_searches_the_product()"
});
formatter.result({
  "duration": 4252529800,
  "status": "passed"
});
formatter.match({
  "location": "ShopGroceriesStepDefinition.user_adds_the_required_product_and_checksout()"
});
formatter.result({
  "duration": 5294985000,
  "status": "passed"
});
});