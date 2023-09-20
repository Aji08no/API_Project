package Rest_Assured;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import POJO.Employee;
import io.restassured.common.mapper.TypeRef;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class Deserialization {
	
	String json="{\r\n"
			+ "  \"name\" : \"Aakash\",\r\n"
			+ "  \"place\" : \"Bangalore\",\r\n"
			+ "  \"skills\" : [ \"selenium\", \"Java\" ],\r\n"
			+ "  \"email\" : \"aakash08@gmail.com\"\r\n"
			+ "}";
	
	//ObjectMapper 
	@Test(enabled = false)
	public void UsingObjectMapper() throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper=new ObjectMapper();
		
		Employee emp= mapper.readValue(json, Employee.class);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPlace());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
	}
	
	//JacksonMappingProvider,Configuration & JsonPath
	@Test(enabled = false)
	public void UsingJaywayPath() {
		JacksonMappingProvider mapperProvider=new JacksonMappingProvider();
		
		Configuration configuration = Configuration
		.builder()
		.mappingProvider(mapperProvider)
		.build();
		
		Employee emp = JsonPath.using(configuration).parse(json).read("$",Employee.class);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPlace());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
	}
	
	//JsonPath & getObject
	@Test(enabled = false)
	public void UsingRestAssured() {
		
		io.restassured.path.json.JsonPath jsonpath=
				io.restassured.path.json.JsonPath.from(json);
		
		Employee emp = jsonpath.getObject("$", Employee.class);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPlace());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
	}
	
	//UsingAsFunction(extract,body & as)
	@Test
	public void UsingAsFunction() {
		
		Map<String, Object> response = given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/Players/4")
		.then()
		.extract()
		.body()
		.as(new TypeRef<Map<String, Object>>() {
		});
		
		System.out.println(response);
		System.out.println(response.get("Name"));
		System.out.println(response.get("Place"));
	}
}
