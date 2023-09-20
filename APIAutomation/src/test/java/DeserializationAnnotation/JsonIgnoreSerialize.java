package DeserializationAnnotation;

import java.util.Date;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreSerialize {
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonIgnorePojo pojo=new JsonIgnorePojo();
		pojo.setId(0);
		pojo.setName(null);
		pojo.setEmail("Ninja08@gmail.com");
		Date date=new Date();
		pojo.setDateofBirth(date);
		
	    ObjectMapper mapper=new ObjectMapper();
	   String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
	   
	   System.out.println(json);
	}

}
