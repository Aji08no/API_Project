package DeserializationAnnotation;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JSonInjectDeserialize {
	
	@Test
	public void Start() throws IOException {
		
		String json="{\r\n"
				+ "  \"name\" : \"Aji\",\r\n"
				+ "  \"email\" : \"Panther08@gmail.com\"\r\n"
				+ "}";
	
	InjectableValues values=new InjectableValues.Std()
			.addValue(String.class, "Kerala");
	
	ObjectMapper mapper=new ObjectMapper();
	
	ObjectReader reader = mapper.reader(values);
	
	JsonIInjectPojo pojo = reader.readValue(json,JsonIInjectPojo.class);
	
	System.out.println(pojo.getPlace());

}
}
