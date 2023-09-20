package SerializationAnnotations;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterPojo {
	
	private Map<String, Object> Employee;
	
    
	@JsonAnyGetter
	public Map<String, Object> getEmployee() {
		return Employee;
	}

	public void setEmployee(Map<String, Object> employee) {
		Employee = employee;
	}

}
