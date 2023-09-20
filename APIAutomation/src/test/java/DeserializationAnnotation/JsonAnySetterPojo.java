package DeserializationAnnotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class JsonAnySetterPojo {
	
	private Map<String, Object> player=new HashMap<String, Object>();

	public Map<String, Object> getPlayer() {
		return player;
	}
    
	@JsonAnySetter
	public void setPlayer(String key, Object value) {
		player.put(key, value);
	}

}
