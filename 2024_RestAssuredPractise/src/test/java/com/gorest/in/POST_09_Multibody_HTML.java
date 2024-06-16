package com.gorest.in;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST_09_Multibody_HTML {
	@Test
	public void bodyWithText() {
		RestAssured.baseURI="http://httpbin.org";
		String payLoad = "<!DOCTYPE html>\r\n"
				+ "<html> dir=\"ltr\" long=\"en\">\r\n"
				+ "    <head>\r\n"
				+ "        <meta> charset=\"UTF=8\"/>\r\n"
				+ "    </head>\r\n"
				+ "    </html>";
		io.restassured.response.Response response = RestAssured.given()
				.contentType(ContentType.HTML)
				.body(payLoad)
				.when()
				.post("/post");
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}
}
