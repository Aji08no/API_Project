package Rest_Assured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadJsonPath {

	@Test(enabled = false)
	public void ParseEveryTime() throws Exception {


		File inputfile=new File("src/test/resources/Schedule.json");

		List<Object>	Rating=JsonPath.read(inputfile, "$..Ranking");
		for(Object rating:Rating ) {
			System.out.println(rating);
		}
	}

	@Test(enabled = false)
	public void ParseOneTime() throws Exception {

		InputStream file=new FileInputStream("src/test/resources/Schedule.json");
		
		Object document = Configuration
				.defaultConfiguration()
				.jsonProvider()
				.parse(file.readAllBytes());

		List<Object>country=JsonPath.read(document, "$..Country");
		
		for(Object Count:country) {
			System.out.println(Count);
		}
	}
	@Test
	public void FluentAPI() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		
		DocumentContext Context = JsonPath.parse(file);
		List<Object> Country= Context.read("$..Country");
		
		for(Object count:Country) {
			System.out.println(count);
		}
		
		Configuration configuration = Configuration.defaultConfiguration();
		List<Object> ratting=JsonPath
				.using(configuration)
				.parse(file).
				read("$..Ranking");
		
		for( Object rat:ratting) {
			System.out.println(rat);
		}
	}

}
