package com.gorest.in;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class POST_06_SchemaValidation {
	@Test
	public void addUserSchemaTest() {
		RestAssured.baseURI="https://gorest.co.in";
		//Schema Type in this = Object
		//1. Add user Test
		System.out.println("-------------Schema Type = object----------------");
		RestAssured.given()
		 .contentType(ContentType.JSON)
		 .body(new File("./src/test/resources/addUser.json"))
			.header("Authorization", "Bearer 4d5ca2826ef627bc6b000b82bb7df8c26831266a1b936e701a3c06f3f1e9bf77")
			.when().log().all()
			.post("/public/v2/users")
			.then().log().all()
			.assertThat() 
			.statusCode(201)
			.and()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("createuserschema.json"));
	}
	
	@Test
	public void getUserSchemaTest() {
		RestAssured.baseURI="https://gorest.co.in";
		//Schema Type in this = array
		System.out.println("-------------Schema Type = array----------------");
		//1. Add user Test
		RestAssured.given()
		 .contentType(ContentType.JSON)
		 .body(new File("./src/test/resources/addUser2.json"))
			.header("Authorization", "Bearer 4d5ca2826ef627bc6b000b82bb7df8c26831266a1b936e701a3c06f3f1e9bf77")
			.when().log().all()
			.post("/public/v2/users")
			.then().log().all()
			.assertThat() 
			.statusCode(201)
			.and()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("geteuserschema.json"));
	}
}
