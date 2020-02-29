package com.Basics.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/Basics/MyGoogleRestAssured/FeaturedFileSelenium.Feature"},
		glue={"com/Basics/MyGoogleRestAssured/"},
		monochrome=true
		 )
public class RunnerTestSelenium {

}
