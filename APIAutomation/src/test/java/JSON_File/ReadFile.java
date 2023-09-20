package JSON_File;



import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadFile {
	
	
	@Test
	public void getStart() throws Exception {
		
		JSONParser parse=new JSONParser();
		
		FileReader reader=new FileReader("write.json");
	
		Object parseobject = parse.parse(reader);
		
		JSONObject Object=(JSONObject)parseobject;
		
		String name=(String)Object.get("Name");
		System.out.println("Read Name "+name);
		
	   Long age=(Long)Object.get("Age");
	   System.out.println("Read Age :"+age);
		
	JSONArray	array=(JSONArray)Object.get("action");
	
	Iterator iterator =array.iterator();
	
	while (iterator.hasNext()) {
		System.out.println("Read ACtion  :"+iterator.next());
	}
	}
	}

