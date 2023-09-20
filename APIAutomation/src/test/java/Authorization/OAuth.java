package Authorization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class OAuth {
	
	@Test
	public void Start() {
		
		given()
		.auth()
		.oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log()
		.body();
	}

}
