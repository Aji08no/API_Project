package SerializationAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerializer {
	
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonGetterPojo Getterpojo=new JsonGetterPojo();
		
		Getterpojo.setId(8);
		Getterpojo.setEmail("Pandya@gmail.com");
		Getterpojo.setName("Hardik");
		
		ObjectMapper mapper=new ObjectMapper();
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Getterpojo);
		System.out.println(json);
	}

}
