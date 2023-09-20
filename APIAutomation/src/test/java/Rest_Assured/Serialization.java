package Rest_Assured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Serialization {
	
	@Test
		
	public void getStart() {
		
		Map<String, Object> jsonbody=new HashMap<String, Object>();
		
		jsonbody.put("Name", "Aji");
		jsonbody.put("Place", "Kerala");
		jsonbody.put("Email", "Ajithudangudi@gmail.com");
		
		List<String> skills=new ArrayList<String>();
		
		skills.add("Selenium");
		skills.add("API");
		
		jsonbody.put("skills", skills);
		
		System.err.println(jsonbody);
		
		given()
		.baseUri("http://localhost:3000")
		.header("content-type","application/json")
		.body(jsonbody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();
		
				
	}

}
