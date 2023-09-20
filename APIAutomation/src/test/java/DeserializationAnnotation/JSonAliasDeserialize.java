package DeserializationAnnotation;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSonAliasDeserialize {
	
	@Test
	public void Start() throws JsonMappingException, JsonProcessingException {
		
		String json="{\r\n"
				+ "  \"id\" : 8,\r\n"
				+ "  \"email\" : \"Pandya@gmail.com\",\r\n"
				+ "  \"Playername\" : \"Hardik\"\r\n"
				+ "}";
		
//		ObjectMapper mapper=new ObjectMapper();
//		JsonAliasPojo pojo = mapper.readValue(json, JsonAliasPojo.class);
		
		JsonAliasPojo pojo = new ObjectMapper().readerFor(JsonAliasPojo.class).readValue(json);
		System.out.println(pojo.getName());
	}

}
