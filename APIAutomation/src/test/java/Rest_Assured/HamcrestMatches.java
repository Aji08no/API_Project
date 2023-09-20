package Rest_Assured;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatches {
	
	@Test
	public void validate() throws Exception {
		
		File input=new File("src/test/resources/Input.json");
		String common=FileUtils.readFileToString(input,"UTF-8");
		
		File schema=new File("src/test/resources/Schema.json");
		
		MatcherAssert.assertThat(common, JsonSchemaValidator.matchesJsonSchema(schema));
	}

}
