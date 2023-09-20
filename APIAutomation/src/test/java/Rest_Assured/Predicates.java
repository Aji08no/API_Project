package Rest_Assured;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class Predicates {
	
	@Test(enabled = false)
	public void InlinePredicates() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		
		//Ranking > 2
		List<Object> Result=JsonPath.read(file, "$.WorldCup.Matches[?(@.Ranking>2)].Captain");
		System.out.println(Result);
	
	}
	@Test(enabled = true)
	public void AndPredicates() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		//Ranking >2 && Country=="Austrialia"
		
		List<Object> Result=JsonPath
				.read(file, "$.WorldCup.Matches[?(@.Ranking>2 && @.Country== \"Austrialia\")].Category");
		System.out.println(Result);
	}
	
	@Test(enabled = false)
	public void ORPredicates() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		
		//Ranking <2 || Country=="Austrialia"
		
		List<Object> Result=JsonPath
				.read(file, "$.WorldCup.Matches[?(@.Ranking<2 || @.Country==\"Austrialia\")].Captain");
		System.out.println(Result);
		
	}
	
	@Test(enabled = false)
	public void NorPredicates() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		
		//(!Ranking<2 || Country=="Austrialia")
		
		List<Object> Result=JsonPath
			.read(file, "$.WorldCup.Matches[?(!(@.Ranking<2 || @.Country==\"Austrialia\"))].Captain");
		System.out.println(Result);
				
	}

}
