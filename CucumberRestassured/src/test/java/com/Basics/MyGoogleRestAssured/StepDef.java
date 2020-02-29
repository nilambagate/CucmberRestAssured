package com.Basics.MyGoogleRestAssured;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDef {
	Response res;
	
	@Given("google have website")
	public void google_have_website(){
		System.out.println("yes");
		
	}
	@When("hit google application")
	public void hit_google_application(){
		res=RestAssured.get("https://google.com/");
	}
	
	@Then("I validate status code")
	public void I_validate_statuscode(){
		int actualstatcode =res.getStatusCode();
		System.out.println("actualstatcode =" +actualstatcode);
		Assert.assertTrue(200==actualstatcode);
	}
	
	@Given("ergastcom have website")
	public void ergastcom_have_website(){
		System.out.println("yes");
		
	}
	@When("Hit ergastcom")
	public void Hit_ergastcom(){
		res=RestAssured.get("http://ergast.com/mrd/");
	}
	
	@Then("Validate status for ergastcom")
	public void Validate_status_for_ergastcom(){
		int actualstatcode =res.getStatusCode();
		System.out.println("actualstatcode =" +actualstatcode);
		Assert.assertTrue(200==actualstatcode);
	}
	
}
