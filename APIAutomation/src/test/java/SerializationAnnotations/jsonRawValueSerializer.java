package SerializationAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonRawValueSerializer {
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonRawValuePojo Getterraw=new JsonRawValuePojo();
		
		Getterraw.setName("Aji");
		Getterraw.setId(4);
		
		ObjectMapper mapper=new ObjectMapper();
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Getterraw);
		System.out.println(json);
	}

}
