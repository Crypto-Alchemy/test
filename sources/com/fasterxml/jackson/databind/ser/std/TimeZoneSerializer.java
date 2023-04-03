package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;
import java.util.TimeZone;

public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    public void serialize(TimeZone timeZone, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13860Z0(timeZone.getID());
    }

    public void serializeWithType(TimeZone timeZone, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23020f(timeZone, TimeZone.class, JsonToken.VALUE_STRING));
        serialize(timeZone, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }
}
