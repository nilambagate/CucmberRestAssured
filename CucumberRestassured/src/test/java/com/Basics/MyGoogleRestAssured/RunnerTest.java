package com.Basics.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/Basics/MyGoogleRestAssured/MyFeautredFile.feature",
				"src/test/resources/com/Basics/MyGoogleRestAssured/MyFeautredfile2.feature",
				"src/test/resources/com/Basics/MyGoogleTestPack/MyFeatureFile.feature"},
		glue={"com/Basics/MyGoogleRestAssured/"},
		monochrome=true
		 )
public class RunnerTest {
	



}
