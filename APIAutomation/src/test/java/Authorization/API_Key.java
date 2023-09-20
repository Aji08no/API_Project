package Authorization;

import static  io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class API_Key {
	
	@Test(enabled = false)
	public void Auth() {
		
		given()
	
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=Exton&appid=859a33aa71224e2e3bc51beb3cbc2e86")
		.prettyPrint();
	}
	
	@Test(enabled = false)
	public void APIUsingParameter() {
		given()
		.queryParam("q", "Kerala")
		.queryParam("appid", "859a33aa71224e2e3bc51beb3cbc2e86")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then().log().body();
	}
	
	@Test
	public void APIUsingHeader() {
		given()
		.queryParam("q", "TamilNadu")
//		.header("appid", "859a33aa71224e2e3bc51beb3cbc2e86")
		.queryParam("appid", "859a33aa71224e2e3bc51beb3cbc2e86")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log()
		.body();
	}

}
