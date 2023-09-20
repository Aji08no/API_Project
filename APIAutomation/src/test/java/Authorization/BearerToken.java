package Authorization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BearerToken {
	
	@Test
	public void Start() {
		String Token="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";
		
		given()
//		.header("Authorization","Bearer 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")
		.header("Authorization", "Bearer "+Token)
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log()
		.body();
	}

}
