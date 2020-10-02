package com.visionit.automation.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature",
		glue = "stepdefs",
		tags ="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
				 },
		dryRun = true
		)
public class TestRunner {
 //nothing goes in class
}
