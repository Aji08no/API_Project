package Rest_Assured;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;(import insert Static)

import static io.restassured.RestAssured.*;

import java.io.File;

public class GetAllPlayers {
  
	@Test(enabled = false)
	public void allPlayers() {
//		RestAssured.(use Static keyword)
		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/Players")
		.prettyPrint();
	}
	
	@Test(enabled = false)
	public void PostMethod() {
		given()
		.baseUri("http://localhost:3000")
		.header("content-type","application/json")
		.body("{\r\n"
				+ "    \"Name\": \"Aji08\",\r\n"
				+ "    \"Place\": \"Tamilnadu\"\r\n"
				+ "  }")
		.when()
		.post("/Players")
		.prettyPrint();
	}
	
	@Test(enabled = false)
	public void putMethod() {
		given()
		.baseUri("http://localhost:3000")
		.header("content-type","application/json")
		.body("{\r\n"
				+ "    \"Name\": \"Aji08\",\r\n"
				+ "    \"Place\": \"TN\"\r\n"
				+ "  }")
		.when()
		.put("/Players/4")
		.prettyPrint();
	}
	
	@Test(enabled = true)
	public void deleteMethod() {
		given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/Players/5")
		.prettyPrint();
	}
		
}
