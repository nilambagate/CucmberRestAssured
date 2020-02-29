package com.Basics.datatableForGetRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/Basics/datatableForGetRequestFF/DataTableGetRequestDataDriven.feature"},
		glue={"com/Basics/datatableForGetRequestSD/"},
		monochrome = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1141.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerDataTableGETRequestTest {

}
