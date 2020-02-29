package com.Basics.getRequestBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBasicSD {
	Response res;
	@Given("^race circulate application is running$")
	public void race_circulate_application_is_running(){
		System.out.println("application ready to use");
		
	}
	@When("^i hit get request to get response$")
	public void i_hit_get_request_to_get_response() {
		res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		
		String actualStatCode=res.getBody().asString();
		System.out.println("actualStatCode ="+actualStatCode);
	}

	@Then("^I validate circulate limit value$")
	public void i_validate_circulate_limit_value() {
	    String limitValue=res.body().jsonPath().getString("MRData.limit");
	    Assert.assertTrue(limitValue.equals("30"));
	}
	@Then("^Validate circuitID$")
	public void validate_circuitID() {
		String totalValue=res.body().jsonPath().getString("MRData.total");
		int totalIntV = Integer.parseInt(totalValue);
		
		for(int i=0;i < totalIntV;i++){
			String idValue=res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
			if(idValue.equals("americas")){
				Assert.assertTrue(idValue.equals("americas"));
				break;
			}else{
				if(i==totalIntV-1){
					Assert.assertTrue(false);
				}
			}
		}		
	}
	@Then("^Validate cicruit total$")
	public void validate_cicruit_total() {
		String totalValue1=res.body().jsonPath().getString("MRData.total");
		int totalIntV = Integer.parseInt(totalValue1);
		System.out.println("total value" +totalIntV);
		
	   
	}

}
