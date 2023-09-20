package DeserializationAnnotation;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserialize {
	
	
	@Test
	public void Start() throws JsonMappingException, JsonProcessingException {
		
     String json="{\r\n"
		+ "  \"name\" : \"Aji\",\r\n"
		+ "  \"lastName\" : \"GT\",\r\n"
		+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
		+ "}";
     
     ObjectMapper mapper=new ObjectMapper();
     JsonAnySetterPojo pojo = mapper.readValue(json, JsonAnySetterPojo.class);
     System.out.println(pojo.getPlayer());
	}

}
