package POJO;

import java.util.List;

public class Employee {
	
	private String Name;
	private String Place;
	private String Email;
	private List  Skills;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		this.Place = place;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public List getSkills() {
		return Skills;
	}
	public void setSkills(List skills) {
		this.Skills = skills;
	}
}
