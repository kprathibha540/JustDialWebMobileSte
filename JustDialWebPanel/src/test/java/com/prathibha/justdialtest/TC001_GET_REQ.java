package com.prathibha.justdialtest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.JSON;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_REQ {
	
	@Test
	public void getListUser()
	{
		// Base URI
		RestAssured.baseURI="https://reqres.in";
		
		// Request Object
		RequestSpecification httpReq=RestAssured.given();
		
		// Response Object
		
		Response response=httpReq.request(Method.GET,"/api/users?page=2" );
		
		// Print Response in Console Window 
		
		String responseBody=response.getBody().asString();
		
		
		System.out.println(" Response body is ::" +responseBody);
		
		// To Get Status Code 
		int code = response.getStatusCode();
		
		System.out.println(" Response Code / Status Code ="+code);
		
		// Verify the Staus Code
		Assert.assertEquals(code,200);
		
		// Status Line Verification 
		String statusLine=response.getStatusLine();
		System.out.println(" STATUS Line =="+statusLine);
		
		// Verification of Staus Line
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

		
	}
}
