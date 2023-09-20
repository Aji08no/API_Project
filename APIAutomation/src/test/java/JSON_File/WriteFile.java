package JSON_File;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class WriteFile {
	
	
	@Test
	public void getStart() throws Exception {
		
		JSONObject  object= new JSONObject();
		object.put("id", 1);
		object.put("Name", "panther");
		object.put("Age", 21);
		
		JSONArray array =new JSONArray();
		array.add("like");
		array.add("likely");
		
		object.put("action", array);
		
		FileWriter writer=new FileWriter("Write.json");
		writer.write(object.toJSONString());
		writer.close();
	}

}
