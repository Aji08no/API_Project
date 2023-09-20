package SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterPojo {
	
	private String Name;
	private int Id;
	private String Email;
	
	
	@JsonGetter(value = "Playername")
	public String getName() {
		return Name;
	}
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
