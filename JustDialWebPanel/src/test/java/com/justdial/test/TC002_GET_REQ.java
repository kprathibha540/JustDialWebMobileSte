package com.justdial.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.json.simple.*;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_GET_REQ {
	@SuppressWarnings("unchecked")
	@Test
	public void postRegistrationSuccessfull()
	{
		// Base URI
		RestAssured.baseURI="https://reqres.in";
		
		// Request Object
		RequestSpecification httpReq=RestAssured.given();
		
		// Request Payload sending with post request 
		JSONObject reqParams=new JSONObject();
		
		reqParams.put("email", "eve.holt@reqres.in");
		reqParams.put("password", "pistol");
		
		
		httpReq.header("Content-Type", "application/json");
		
		httpReq.body(reqParams.toJSONString());
		
		// Response Object
		
		Response response=httpReq.request(Method.POST,"/api/register" );
		
		// Print Response in Console Window 
		
		String responseBody=response.getBody().asString();
		
		
		System.out.println(" Response body is ::" +responseBody);
		
		// To Get Status Code 
		int code = response.getStatusCode();
		
		System.out.println(" Response Code / Status Code ="+code);
		
		// Verify the Staus Code
		Assert.assertEquals(code,200);
		
		// We Need to Extract the Response code from the SUCCESS Body
		String successCode=response.jsonPath().get("token");
		
		System.out.println(" Success Token "+successCode);
		
		

		
	}
}
