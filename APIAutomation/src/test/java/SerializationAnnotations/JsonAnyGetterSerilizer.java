package SerializationAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerilizer {
	
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonAnyGetterPojo GetterPojo=new JsonAnyGetterPojo();
		
		Map<String, Object> mapval=new HashMap<String, Object>();
		
		mapval.put("FirstName", "Ajith");
		mapval.put("LastName", "A");
		mapval.put("Email", "Panther08@gmail.com");
		mapval.put("Skills",Arrays.asList("Batting","Bowling"));
		
		GetterPojo.setEmployee(mapval);
		
		ObjectMapper mapper=new ObjectMapper();
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(GetterPojo);
		System.out.println(json);
		
	}

}
