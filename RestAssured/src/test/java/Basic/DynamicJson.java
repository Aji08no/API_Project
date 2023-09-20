package Basic;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Reuse.ReUsableMethods;
import Reuse.playLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test(dataProvider = "Panther")
	public void Start(String name) {
		
//		String json="{\r\n"
//				+ "        \"name\": \"aji\",\r\n"
//				+ "        \"participate\": 1,\r\n"
//				+ "        \"entrance\": 30,\r\n"
//				+ "    }";
		
//		File file=new File("src/test/resources/json");
		
		
		RestAssured.baseURI="http://localhost:3000/";
		String rep = given().log().all()
		.header("content-type","application/json")
//		.body(playLoad.AddId())
//		.body(playLoad.AddId("Pandya"))
		.body(playLoad.AddId(name))
		.when().post("Team")
		.then().log().all().extract().response().asString();

		
		JsonPath js = ReUsableMethods.rawToJson(rep);
//		String Name = js.getString("name");
		int Id = js.getInt("id");
		
		System.out.println("ID ="+Id);
	}
	
	//Single Dimensional Array
	@DataProvider(name="Panther")
	public Object[] getData() {
	return	new Object[] {"Hardik","Smith","Pat Cummins"};
	}
	
	//Two Dimensional Array
//	@DataProvider(name="Panther")
//	public Object[][] getData() {
//	return	new Object[][] {{"Hardik",""},{"Smith",""},{"Pat Cummins",""}};
//	}
	

}
