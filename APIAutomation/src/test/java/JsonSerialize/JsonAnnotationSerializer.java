package JsonSerialize;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonAnnotationSerializer {
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonSerializePojo Getterserializer=new JsonSerializePojo();
		
		Getterserializer.setName("Aji");
		Getterserializer.setEmail("Aji08@gmail.com");
		Getterserializer.setLastName("GT");
		
		ObjectMapper mapper=new ObjectMapper();
		
//		SimpleModule module=new SimpleModule();
//		module.addSerializer(JsonSerializePojo.class,new CustomSerializer());
//		mapper.registerModule(module);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Getterserializer);
		System.out.println(json);
	}

}
