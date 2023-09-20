package SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"email","name","id"})
public class JsonPropertyOrderPojo {
	
	private String Name;
	private String Email;
	private int Id;
	
	@JsonGetter(value = "aname")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

}
