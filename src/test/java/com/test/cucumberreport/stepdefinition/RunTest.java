package com.test.cucumberreport.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/test/cucumberreport/feature",
		plugin = {"json:target/surefire-reports/cucumber.json", 
				"junit:target/surefire-reports/cucumber.xml"
				}
		)
public class RunTest {

}
