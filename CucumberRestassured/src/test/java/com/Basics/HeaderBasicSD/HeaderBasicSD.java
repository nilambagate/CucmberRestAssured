package com.Basics.HeaderBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;

import io.restassured.http.Headers;
import io.restassured.response.Response;


public class HeaderBasicSD {

	Response res;
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() {
		 System.out.println("Starting of the GET request");
	}

	@Then("^user checks headers \"([^\"]*)\" hvae \"([^\"]*)\" value$")
	public void user_checks_headers_hvae(String headerName, String headerValue)  {
	   res=RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api");
	   String completeResponse = res.asString();
	   System.out.println("=================="+completeResponse);
	   
	   //get all Headers
	   Headers heds=res.getHeaders();
	   String actulHeaderValue = heds.getValue(headerName);
	 //  Assert.assertTrue(actulHeaderValue.equals(headerValue));
	   Assert.assertTrue(actulHeaderValue.equals(headerValue));
	}

}
