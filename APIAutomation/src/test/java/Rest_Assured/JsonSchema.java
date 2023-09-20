package Rest_Assured;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchema {
	
	@Test(enabled = false)
	public void UsingMatchesJsonSchemaInClasspath() {
		
		File file=new File("src/test/resources/Input.json");
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.header("content-type","application/json")
		.body(file)
		.when()
		.post("Players")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
	}
	
	@Test
	public void UsingMatchesJsonSchema() throws Exception {
		
		
		File file=new File("src/test/resources/Input.json");
		
//		 File file1=new File("src/test/resources/Schema.json");
//	     InputStream inputstream =new  FileInputStream("src/test/resources/Schema.json");
		 FileReader reader = new FileReader("src/test/resources/Schema.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("content-type","application/json")
		.body(file)
		.when()
		.post("Players")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(reader));
		
	}

}
