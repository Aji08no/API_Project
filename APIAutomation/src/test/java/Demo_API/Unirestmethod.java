package Demo_API;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirestmethod {
	
	public void getMethod() throws UnirestException {
		HttpResponse<JsonNode> response = Unirest.get("https://dummy.restapiexample.com/api/v1/employees")
				.asJson();
		System.out.println("status code ="+response.getStatus());
		System.out.println("status message ="+response.getStatusText());
		System.out.println("response body ="+response.getBody());
	}
	
	public void postmethod() throws UnirestException {
		HttpResponse<JsonNode> response = Unirest.post("https://dummy.restapiexample.com/api/v1/create")
		.body("{\"name\":\"Aji08\",\"salary\":\"200\",\"age\":\"23\"}").asJson();
		
		System.out.println("status code ="+response.getStatus());
		System.out.println("status message ="+response.getStatusText());
		System.out.println("response body ="+response.getBody());
	}
	
	public void putMethod() throws UnirestException {
		HttpResponse<JsonNode> response = Unirest.put("https://dummy.restapiexample.com/api/v1/update/568")
		.body("{\"name\":\"AjiS\",\"salary\":\"200\",\"age\":\"25\"}").asJson();
		
		System.out.println("status code ="+response.getStatus());
		System.out.println("status message ="+response.getStatusText());
		System.out.println("response body"+response.getBody());
	}
     
	public void deleteMethod() throws UnirestException {
		HttpResponse<JsonNode> response = Unirest
				.delete("https://dummy.restapiexample.com/api/v1/delete/568").asJson();
		
		System.out.println("status code ="+response.getStatus());
		System.out.println("status message ="+response.getStatusText());
		System.out.println("response body ="+response.getBody());
	}
	
	public static void main(String[] args) throws UnirestException {
		Unirestmethod uni=new Unirestmethod();
//		uni.getMethod();
//		uni.postmethod();568
//		uni.putMethod();
		uni.deleteMethod();
	}
}
