package DeserializationAnnotation;

import com.fasterxml.jackson.annotation.JacksonInject;

public class JsonIInjectPojo {
	
	private String Name;
	private String Email;
	@JacksonInject
	private String Place;
	
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
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}

}
