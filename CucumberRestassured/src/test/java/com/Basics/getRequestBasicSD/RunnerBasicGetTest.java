package com.Basics.getRequestBasicSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/Basics/getRequestFF/GetBasicFF.Feature",
				"src/test/resources/com/Basics/getRequestFF/GetReqValuefromFF.Feature"},
		glue={"com/Basics/getRequestBasicSD/"},
		monochrome=true
		 )

public class RunnerBasicGetTest {

}
