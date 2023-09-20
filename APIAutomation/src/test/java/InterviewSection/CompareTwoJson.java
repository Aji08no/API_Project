package InterviewSection;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {
	
	@Test
	public void Start() throws JsonMappingException, JsonProcessingException {
		
		String json1="{\r\n"
				+ "  \"name\" : \"Aji\",\r\n"
				+ "  \"lastName\" : \"GT\",\r\n"
				+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
				+ "}";
		
		String json2="{\r\n"
				+ "  \"lastName\" : \"GT\",\r\n"
				+ "  \"name\" : \"Aji\",\r\n"
				+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
				+ "}";
		
		ObjectMapper mapper=new ObjectMapper();
		
		JsonNode file1 = mapper.readTree(json1);
		
		JsonNode file2 = mapper.readTree(json2);
		System.out.println(file1.equals(file2));
	}

}
