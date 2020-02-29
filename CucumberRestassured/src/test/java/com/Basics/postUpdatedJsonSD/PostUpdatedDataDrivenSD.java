package com.Basics.postUpdatedJsonSD;

import static org.hamcrest.Matchers.notNullValue;

import java.io.File;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUpdatedDataDrivenSD {
	Response resp ;
	File file = new File("src/test/java/com/basics/postUpdatedJsonSD/user.json");

@Given("^enter the post request with \"([^\"]*)\" name$")
public void enter_the_post_request_with_name(String name)  {
	
	resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
			when().body(file).post("https://reqres.in/api/users");
	resp.then().log().all();
	resp.then().log().status();
	System.out.println("====="+resp.asString());
    
}

@Then("^enter the user \"([^\"]*)\" name$")
public void enter_the_user_name(String post){
	resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
			when().body(file).post("https://reqres.in/api/users");
	resp.then().log().all();
	resp.then().log().status();
	System.out.println("====="+resp.asString());
}

@Then("^enter address \"([^\"]*)\"$")
public void enter_address(String address) throws Throwable {
	resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
			when().body(file).post("https://reqres.in/api/users");
	resp.then().log().all();
	resp.then().log().status();
	System.out.println("====="+resp.asString());
}

@Then("^validate the id is not null$")
public void validate_the_id_is_not_null()  {
	//Check id is not null
	resp.then().assertThat().body("id", notNullValue());
	
	//check id is greater than zero
	String idValue = resp.getBody().jsonPath().get("id");
	int idInt = Integer.parseInt(idValue);
	Assert.assertTrue(idInt > 0);
   
}
}
