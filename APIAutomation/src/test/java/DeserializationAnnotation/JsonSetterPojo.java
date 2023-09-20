package DeserializationAnnotation;

import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterPojo {
	
	private String Name;
	private int Id;
	private String Email;
	
	public String getName() {
		return Name;
	}
	
	@JsonSetter(value = "Playername")
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
