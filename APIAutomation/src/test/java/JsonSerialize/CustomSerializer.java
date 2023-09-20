package JsonSerialize;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializePojo> {

	public CustomSerializer(Class<JsonSerializePojo> t) {
		super(t);
	}
	
	public CustomSerializer() {
		this(null);
	}
	

	@Override
	public void serialize(JsonSerializePojo value, 
			JsonGenerator generator, 
			SerializerProvider provider) throws IOException {
	
		generator.writeStartObject();
		generator.writeStringField("Name", value.getName());
		generator.writeStringField("Last", value.getLastName());
		generator.writeEndObject();
	}
	
	

}
