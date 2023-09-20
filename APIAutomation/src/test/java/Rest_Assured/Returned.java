package Rest_Assured;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class Returned {


	//Indefinite Path
	@Test(enabled = false)
	public void Indefinite() throws Exception {

		File file=new File("src/test/resources/Schedule.json");

		List<Object> name=JsonPath.read(file, "$..Country");

		for( Object output:name) {
			System.out.println(output);
		}

	}

	//Definite Path
	@Test
	public void  Definite() throws Exception {

		File file =new File("src/test/resources/Schedule.json");

		String captain=JsonPath.read(file, "$.WorldCup.Matches[0].Captain");
		
//		System.out.println(captain);
//		for(Object output:captain) {
//			System.out.println(output);
//		}
		
	}

}
