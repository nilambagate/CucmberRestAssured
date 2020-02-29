package com.Basics.MyGoogleRestAssured;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicOfRestAssured {

		
		@Test
		public void TestGoogle(){
		Response res=RestAssured.get("https://google.com/");
		int actualstatcode =res.getStatusCode();
		System.out.println("actualstatcode =" +actualstatcode);
		Assert.assertTrue(201==actualstatcode);
		}
         
		@Test
		public void TestF1(){
			Response res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
			int actualStatCode=res.getStatusCode();
			System.out.println("actualStatCode ="+actualStatCode);
			Assert.assertTrue(200==actualStatCode);
			String actualData =res.getBody().asString();
			System.out.println("Data ="+actualData);
			
		}
		
		/*@Test
		public void TestF2(){
			Response res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
			int actualStatCode=res.getStatusCode();
			System.out.println("actualStatCode ="+actualStatCode);
			Assert.assertTrue(200==actualStatCode);		
		}*/


}
