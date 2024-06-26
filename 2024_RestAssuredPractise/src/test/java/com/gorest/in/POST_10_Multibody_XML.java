package com.gorest.in;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST_10_Multibody_XML {
	@Test
	public void bodyWithText() {
		RestAssured.baseURI="http://httpbin.org";
		String payLoad = "<note>\r\n"
				+ "<to>Tove</to>\r\n"
				+ "<from>Jani</from>\r\n"
				+ "<heading>Reminder</heading>\r\n"
				+ "<body>Don't forget me this weekend!</body>\r\n"
				+ "</note>";
				
		io.restassured.response.Response response = RestAssured.given()
				.contentType(ContentType.XML)
				.body(payLoad)
				.when()
				.post("/post");
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}
}
