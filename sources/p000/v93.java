package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

/* renamed from: v93 */
/* compiled from: KeepAsJsonDeserialzier */
public class v93 extends o43<String> {
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return jsonParser.mo13980p().readTree(jsonParser).toString();
    }
}
