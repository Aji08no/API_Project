package Rest_Assured;

import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class ExConfiguration {
	
	@Test
	public void Start() {
		
		String json="{\r\n"
				+ "	\"Name\": \"AJ\",\r\n"
				+ "	\"Place\": \"UD\"\r\n"
				+ "	}";
      
		Configuration configuration=Configuration.defaultConfiguration();
//		configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		
		List<Object> name = JsonPath.using(configuration).parse(json).read("$..Name");
		
		System.out.println(name);
	}
}
