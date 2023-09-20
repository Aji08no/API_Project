package DeserializationAnnotation;

import com.fasterxml.jackson.annotation.JsonAlias;

public class JsonAliasPojo {
	
	@JsonAlias({"Playername","pname"})
	private String Name;
	private String Email;
    private int Id;
    
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
