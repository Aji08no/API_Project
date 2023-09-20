package Reuse;

public class playLoad {
    
	public static String start() {
		return "{\r\n"
				+ "    \"id\": \"80\",\r\n"
				+ "    \"orgId\": \"2\"\r\n"
				+"}";
	}
	                          
	//Add parameter String name
	public static String AddId(String name) {
		String json=" {\r\n"
//				+ "        \"name\": \"aji\",\r\n"
     			+ "        \"name\": \""+name+"\",\r\n"
				+ "        \"participate\": 1,\r\n"
				+ "        \"entrance\": 40\r\n"
				+ "    }";
		
		return json;
	}
}
