package RA_08B_AuthAPIs;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class H4_PreemptiveBasicAuthTest {

	
	@Test
	public void basicAuthTest() {
	RestAssured.baseURI="https://the-internet.herokuapp.com";
	
	String responseBody = RestAssured.given()
			.auth().preemptive().basic("admin", "admin")
			.when()
			.get("/basic_auth")
			.then().assertThat() 
			.statusCode(200)
			.extract().body().asString();
	
	System.out.println(responseBody);
}
}
