package org.web3j.protocol.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class RawResponseDeserializer extends StdDeserializer<ag5> implements xe5 {
    private final o43<?> defaultDeserializer;

    public RawResponseDeserializer(o43<?> o43) {
        super((Class<?>) ag5.class);
        this.defaultDeserializer = o43;
    }

    private String getRawResponse(JsonParser jsonParser) throws IOException {
        InputStream inputStream = (InputStream) jsonParser.mo13931G();
        if (inputStream == null) {
            return "";
        }
        inputStream.reset();
        return streamToString(inputStream);
    }

    private String streamToString(InputStream inputStream) throws IOException {
        return new Scanner(inputStream, yl0.UTF_8.name()).useDelimiter("\\Z").next();
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ((xe5) this.defaultDeserializer).resolve(deserializationContext);
    }

    public ag5 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ag5 ag5 = (ag5) this.defaultDeserializer.deserialize(jsonParser, deserializationContext);
        ag5.setRawResponse(getRawResponse(jsonParser));
        return ag5;
    }
}
