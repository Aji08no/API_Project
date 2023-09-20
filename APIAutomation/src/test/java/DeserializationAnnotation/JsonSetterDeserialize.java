package DeserializationAnnotation;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserialize {
	
	@Test
	public void Start() throws JsonMappingException, JsonProcessingException {
		
		String json="{\r\n"
				+ "  \"id\" : 8,\r\n"
				+ "  \"email\" : \"Pandya@gmail.com\",\r\n"
				+ "  \"Playername\" : \"Hardik\"\r\n"
				+ "}";
		
		ObjectMapper mapper=new ObjectMapper();
	  JsonSetterPojo pojo = mapper.readValue(json, JsonSetterPojo.class);
//	  System.out.println(pojo);
	  System.out.println(pojo.getName());
	}

}
