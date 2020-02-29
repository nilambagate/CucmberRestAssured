package com.Basics.HeaderBasicSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/Basics/HeaderBasicFF/HeaderBasicFF.Feature"},
		glue={"com/Basics/HeaderBasicSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22711.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)
public class RunnerHeaderTest {

}
