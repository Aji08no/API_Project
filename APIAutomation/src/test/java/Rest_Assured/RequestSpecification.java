package Rest_Assured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class RequestSpecification {
	
	io.restassured.specification.RequestSpecification RS;
	
	@BeforeTest
	public void Request() {
		
		RS=given()
		.baseUri("http://localhost:3000")
		.basePath("/Players");
		//This line  Can we define multiple request specification? 
		RestAssured.requestSpecification=RS;
	
	}
	
	//Given() & With()same method
	@Test(enabled = false)
	public void AllPlayer() {
		
		with()
//		.spec(requestSpecification)
		.when()
		.get()
		.prettyPrint();
	}
	
	@Test(enabled = false)
	public void player() {
		
		given()
//		.spec(requestSpecification)
		.when()
		.get("/2")
		.prettyPrint();
	}
	
//-----*--------*------------*-----------
	
	//using for Request specification builder;
	@Test
	public void RequestSpecBuilder() {
		
		io.restassured.builder.RequestSpecBuilder builder=new io.restassured.builder.RequestSpecBuilder();
		builder.setBaseUri("http://localhost:3000");
		builder.setBasePath("/Players");
		io.restassured.specification.RequestSpecification spec = builder.build();
		RestAssured.given().spec(spec).get().prettyPrint();
		
		//Another model in same method
		
//		io.restassured.specification.RequestSpecification scep1 = builder
//				.setBaseUri("http://localhost:3000")
//				.setBasePath("/Players")
//				.build();
//		
//		RestAssured.given(scep1).get("/4").prettyPrint();
		
	}

}
