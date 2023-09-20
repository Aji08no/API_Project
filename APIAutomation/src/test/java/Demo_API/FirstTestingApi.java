package Demo_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTestingApi {
	
	public void getMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/employees ");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		int Statuscode = connection.getResponseCode();
		System.out.println("Statuscode is ="+Statuscode);
		
		String message = connection.getResponseMessage();
		System.out.println("Status message ="+message);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader insr=new InputStreamReader(inputstream);
		
		BufferedReader br=new BufferedReader(insr);
		String Line;
		
		StringBuffer buffer=new StringBuffer();
		while((Line=br.readLine())!=null) {
			buffer.append(Line);
		}
		System.out.println(buffer);
	}
	
	public void postMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("content-type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\"name\":\"Aji\",\"salary\":\"200\",\"age\":\"23\"}";
		byte[] inputjson = jsonBody.getBytes();
		
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputjson);
		
		System.out.println("status code ="+connection.getResponseCode());
		System.out.println("status message ="+connection.getResponseMessage());
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader insr=new InputStreamReader(inputstream);
		
		String line;
		BufferedReader br=new BufferedReader(insr);
		StringBuffer buffer=new StringBuffer();
		
		while((line=br.readLine())!=null) {
			buffer.append(line);
		}
		
		System.out.println(buffer);
	}
	
	public void putMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/update/3401");
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("content-type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\"name\":\"Aji\",\"salary\":\"200\",\"age\":\"25\"}";
		byte[] inputjson = jsonbody.getBytes();
		
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputjson);
		
		System.out.println("status code ="+connection.getResponseCode());
		System.out.println("status message ="+connection.getResponseMessage());
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader insr=new InputStreamReader(inputstream);
		String line;
		BufferedReader br=new BufferedReader(insr);
		StringBuffer buffer=new StringBuffer();
		while((line=br.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	public void deleteMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/delete/3401");
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("content-type", "application/json");
		connection.setDoOutput(true);
		
		System.out.println("status code ="+connection.getResponseCode());
		System.out.println("status message ="+connection.getResponseMessage());
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader insr=new InputStreamReader(inputstream);
		String line;
		BufferedReader br=new BufferedReader(insr);
		StringBuffer buffer=new StringBuffer();
		while((line=br.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws Exception {
		FirstTestingApi out=new FirstTestingApi();
//		out.getMethod();
//		out.postMethod();
//		out.putMethod();
		out.deleteMethod();
	}
}
