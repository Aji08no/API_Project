package Rest_Assured;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkntJsonSchema {
	
	@Test 
	public void validator() throws Exception {
		
		ObjectMapper mapper=new ObjectMapper();
		
		JsonSchemaFactory factory=JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File file=new File("src/test/resources/Input.json");
		InputStream input = new FileInputStream("src/test/resources/Schema.json");
		
		JsonNode jsonNode=mapper.readTree(file);
		JsonSchema schema = factory.getSchema(input);
		
		Set<ValidationMessage> result = schema.validate(jsonNode);
		
		if(result.isEmpty()) {
			System.out.println("No Validate error");
		}
		else {
			for(ValidationMessage message:result) {
				System.out.println(message);
			}
		}

	}

}
