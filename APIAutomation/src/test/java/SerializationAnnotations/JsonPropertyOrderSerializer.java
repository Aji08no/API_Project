package SerializationAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {
	
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonPropertyOrderPojo Getterproperty=new JsonPropertyOrderPojo();
		
		Getterproperty.setId(2);
		Getterproperty.setEmail("Ninja08@gmail.com");
		Getterproperty.setName("Jack");
		
		ObjectMapper mapper=new ObjectMapper();
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Getterproperty);
		System.out.println(json);
	}

}
