package com.qa.example.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="F:\\KundanSirProject\\TescoDemo\\src\\test\\java\\com\\qa\\example\\features\\shopGroceries.feature",
        glue = {"com\\qa\\example\\stepDefinitions"},
        format ={"pretty", "html: test-output", "json: json_output/cucumber.json", "junit: junit_xml/cucumber.xml"},
        strict = true,
        dryRun = false,
        monochrome = true
        )
public class TestRunner {
}
