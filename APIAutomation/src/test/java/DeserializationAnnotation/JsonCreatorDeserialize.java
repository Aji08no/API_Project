package DeserializationAnnotation;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorDeserialize {
	
	@Test
	public void Start() throws JsonMappingException, JsonProcessingException {
		
		String json="{\r\n"
				+ "  \"id\" : 8,\r\n"
				+ "  \"email\" : \"Pandya@gmail.com\",\r\n"
				+ "  \"Playername\" : \"Hardik\"\r\n"
				+ "}";
		
		ObjectMapper mapper=new ObjectMapper() ;
		 JsonCreatorPojo pojo = mapper.readValue(json, JsonCreatorPojo.class);
		System.out.println(pojo.getEmail());
		System.out.println(pojo.getName());
		System.out.println(pojo.getId());
	}

}
