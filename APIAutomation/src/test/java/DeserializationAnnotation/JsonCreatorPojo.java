package DeserializationAnnotation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;


public class JsonCreatorPojo {
	
	private String Name;
	private String Email;
	private int Id;
	
	@JsonCreator
	public JsonCreatorPojo(
			@JsonProperty("id")
			int id,
			@JsonProperty("Playername")
			String name,
			@JsonProperty("email")
			String email) {
		
		this.Id=id;
		this.Name=name;
		this.Email=email;
		
	}
	
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public int getId() {
		return Id;
	}
	
	
}
