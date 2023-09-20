package SerializationAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRootNameSerializer {
	
	
	@Test
	public void Start() throws JsonProcessingException {
		
		JsonRootNamePojo Getter=new JsonRootNamePojo();
		
		Getter.setLastName("GT");
		Getter.setName("Aji");
		List<String> Skillslist=new ArrayList<String>();
		Skillslist.add("Java");
		Skillslist.add("Selenium");
		
		Getter.setSkills(Skillslist);
		
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Getter);
		System.out.println(json);
	}
	

}
