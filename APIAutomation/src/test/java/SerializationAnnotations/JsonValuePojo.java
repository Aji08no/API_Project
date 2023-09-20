package SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonValue;

public class JsonValuePojo {
	
	private String Name;
	private String Team;
	private String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@JsonValue
	public String useValue() {
		return Name;
	}
	

}
