package Basic;


import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import Reuse.ReUsableMethods;
import Reuse.playLoad;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;




public class EludeUserGet {
	
	@Test(enabled = false)
	public void Start1() {
		
//		String json="{\r\n"
//				+ "    \"name\": \"d\",\r\n"
//				+ "    \"participate\": 1,\r\n"
//				+ "    \"entrance\": 40\r\n"
//				+ "}";
		
		File file=new File("src/test/resources/First");
		
		baseURI="http://89.116.230.242:4000/";
		 Response rep = given().log().all().header("content-type","application/json")
		.body(file)
		.when()
		.post("emp-attendance/getUser").then().log().all()
		.assertThat().statusCode(200).body("mobile", equalTo("+912323232323"))
		.header("Connection", "keep-alive")
		.extract().response();
		
//		 		 System.out.println(rep);
//		 		 System.out.println(rep.asPrettyString());
//		 		 System.out.println(rep.statusCode());

	}
	
	@Test(enabled = true)
	public void Start2() {
      
//		File file=new File("src/test/resources/First");
		baseURI="http://89.116.230.242:4000/";
		String rep = given().header("content-type","application/json")
				.body(playLoad.start()).when().post("emp-attendance/getUser")
		.then().extract().response()
		.asString();
		
		JsonPath js = ReUsableMethods.rawToJson(rep);
  
		String mail = js.getString("name");
		System.out.println(mail);
//		assertEquals(mail, "starblessing2@gmail.com");
	}
	
}
