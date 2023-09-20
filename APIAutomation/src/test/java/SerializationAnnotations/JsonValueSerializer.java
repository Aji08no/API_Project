package SerializationAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueSerializer {
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonValuePojo GetterValue=new JsonValuePojo();
		
		GetterValue.setName("Oneplus");
		GetterValue.setEmail("Oneplus@gmail.com");
		GetterValue.setTeam("India");
		
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(GetterValue);
		System.out.println(json);
	}

}
