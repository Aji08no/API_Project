package InterviewSection;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DefaultHostAndPort {
	
	@Test
	public void Start() {
		
		RestAssured.given().log().all().when().get();
	}

}
