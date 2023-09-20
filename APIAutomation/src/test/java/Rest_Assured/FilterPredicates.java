package Rest_Assured;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicates {
	
	@Test(enabled = false)
	public void FilterAPI() throws Exception {
		File file =new File("src/test/resources/Schedule.json");
		Filter ranking = Filter.filter(
				Criteria.where("Ranking").lt(2)
				);
		List<Map<String, Object>> result = JsonPath.parse(file).read("$.WorldCup.Matches[?]",ranking);
		
		System.out.println(result.get(0).get("Captain"));
	}
	
	@Test
	public void AND() throws Exception {
		
		File file=new File("src/test/resources/Schedule.json");
		
		Filter ranking = Filter.filter(
				Criteria.where("Ranking").gt(2).and("Country").is("Austrialia")
				);
		
	List<Map<String, Object>>	result=JsonPath.parse(file).read("$.WorldCup.Matches[?]",ranking);
	
	System.out.println(result);
	}

}
