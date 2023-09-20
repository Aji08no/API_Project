package Demo_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredMethod {
	
	@Test(enabled = false)
	public void getAllMethod() {
		
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"Players");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	@Test(enabled = false)
	public void PostMethod() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured
				.given()
				.header("content-type","application/json")
				.body("{\r\n"
						+ "        \"Name\": \"AJ\",\r\n"
						+ "        \"Place\": \"UD\"\r\n"
						+ "    }");
		Response response=requestSpecification.request(Method.POST,"Players");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}
	
	@Test(enabled = false)
	public void putMethod() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured
				.given()
				.header("content-type","application/json")
				.body("{\r\n"
						+ "        \"Name\": \"AJ\",\r\n"
						+ "        \"Place\": \"Udangudi\"\r\n"
						+ "    }");
		Response response=requestSpecification.request(Method.PUT,"Players/4");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}
	
	@Test(enabled = false)
	public void deleteMethod() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.DELETE,"Players/4");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}
	
	@Test
	public void getSingleUser() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"Players/2");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}

}
