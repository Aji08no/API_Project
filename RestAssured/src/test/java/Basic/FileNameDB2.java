package Basic;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class FileNameDB2 {
	
	public static void main(String[] args) {
		
	
		
		File file =new File("src/test/resources/First");
		
		JsonPath js=new JsonPath(file);
		
		// int count=3;
		int count=js.getInt("name.size()");
		System.out.println(count);
		
	int	sum=0;
		for(int i=0;i<count;i++) {
			 int part=js.getInt("participate["+i+"]");
			 int ent=js.getInt("entrance["+i+"]");
			int total=part*ent;
			 System.out.println(total);
			 sum=sum+total;
		}
		System.out.println(sum);
	}
	

}
