package InterviewSection;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class RequestSpecification1 {
	
	@Test
	public void Start() {
		
		RestAssured.baseURI="http://localhost:3000/";
		RestAssured.basePath="Players";
		RequestSpecification requestSpecification = RestAssured.given()
		.header("content-type","application/json")
		.body("{\r\n"
				+ "        \"Name\": \"AJ\",\r\n"
				+ "        \"Place\": \"UD\"\r\n"
				+ "    }");
		
		Response response=requestSpecification.request(Method.POST);
		
		QueryableRequestSpecification queryableRequestSpecification = 
				SpecificationQuerier.query(requestSpecification);
		
		System.out.println(queryableRequestSpecification.getHeaders());
		System.out.println(queryableRequestSpecification.getBasePath());
	}

}
