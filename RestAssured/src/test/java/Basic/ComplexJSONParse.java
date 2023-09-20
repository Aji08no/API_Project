package Basic;

import static org.testng.Assert.assertEquals;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class ComplexJSONParse {
	
 public static void main(String[] args) {
	 
	 File file=new File("src/test/resources/Basic");
	JsonPath js=new JsonPath(file);
	
	int count = js.getInt("name.size()");
	System.out.println(count);
	
//	Object count1 = js.get("location");
//	System.out.println(count1);
//	
//	Object count2 = js.get("name[24]");
//	System.out.println(count2);
	
	/* for(int i=0;count>i;i++) {
			
		String getname = js.get("name["+i+"]");
		
		System.out.println("name :"+getname);
		System.out.println("location :"+ js.get("location["+i+"]"));
		} */
	
//	for(int i=0;i<count;i++) {
//		String getname = js.get("name["+i+"]");
//		if(getname.equalsIgnoreCase("Aj")) {
//			String getrole = js.get("role["+i+"]");
//			
//			System.out.println(getrole);
//		}
//	}
	
	int counter = 0;
	for(int i=0;count>i;i++) {
		String getrole = js.get("role["+i+"]");
		
		if(getrole.equalsIgnoreCase("employee")) {
			String getname = js.get("name["+i+"]");
			
			System.out.println(getname);
			counter+=1;
		}
	}
		System.out.println("Total Employee :"+counter);
//		assertEquals(counter, 8);
	
		
	
		/* for(int i=0;i<count;i++) {
			String getname = js.get("name["+i+"]");
			if(getname.equalsIgnoreCase("Aji")) {
			int	getrole=js.get("id["+i+"]");
			System.out.println(getrole);
			
			}
		} */
}
}
