package Rest_Assured;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class ReadFile {
	@Test
	public void externalFile() {
		File Jsonfile=new File("PostPlayer.json");
		given()
		.baseUri("http://localhost:3000")
		.header("content-type","application/json")
		.body(Jsonfile)
		.when()
		.post("/Players")
		.prettyPrint();
	}

}
