package POJO;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {
	
	@Test
	public void getStart() throws JacksonException {
		
		//POJO File
		Employee emp1=new Employee();
		emp1.setName("Aakash");
		emp1.setPlace("Bangalore");
		emp1.setEmail("aakash08@gmail.com");
		emp1.setSkills(Arrays.asList("selenium","Java"));
		
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPlace());
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getSkills());
		
		//POJO file converted to JSON File
		ObjectMapper mapper=new ObjectMapper();
		
		String jsonmapper=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		
		System.out.println(jsonmapper);
	}

}
