package com.Basics.getRequestBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestSDValueFromFF {

	Response res;
	@Given("^race circuit app is running$")
	public void race_circuit_app_is_running(){
		System.out.println("application ready to use");
		
	}
	@When("^i hit request to get response$")
	public void i_hit_request_to_get_response() {
		res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		
		String actualStatCode=res.getBody().asString();
		System.out.println("actualStatCode ="+actualStatCode);
	}
	
	
	/*@Then("^I validate circuit \"([^\"]*)\"  value as \"([^\"]*)\" present$")
	public void I_validate_circuit_value_as_present(String jPath, String valueToBevalidated)  {
		 String attrValue=res.body().jsonPath().getString(jPath);
		    Assert.assertTrue(attrValue.equals(valueToBevalidated));
	}*/
	
	@Then("^I validate circuit \"([^\"]*)\"  value as \"([^\"]*)\" present$")
	public void i_validate_circuit_value_as_present(String jPath, String valueToBevalidated){
		String attrValue=res.body().jsonPath().getString(jPath);
	    Assert.assertTrue(attrValue.equals(valueToBevalidated));
	}
	
}
