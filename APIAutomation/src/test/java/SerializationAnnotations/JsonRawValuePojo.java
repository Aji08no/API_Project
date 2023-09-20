package SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePojo {
	
	private String Name;
	private int Id;
	
	@JsonRawValue
	private String skills="java";
	
//	private String skills="{[\"java\"],[\"Selenium\"]}";
	
	
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getSkills() {
		return skills;
	}
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

}
