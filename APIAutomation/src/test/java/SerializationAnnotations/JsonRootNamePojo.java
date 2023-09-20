package SerializationAnnotations;

import java.util.List;

public class JsonRootNamePojo {
	
	private String Name;
	private String LastName;
	private List<String> Skills;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}

}
