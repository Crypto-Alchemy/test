package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.IOException;

public class MappingJsonFactory extends JsonFactory {
    private static final long serialVersionUID = -1;

    public MappingJsonFactory() {
        this((ObjectMapper) null);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(MappingJsonFactory.class);
        return new MappingJsonFactory(this, (ObjectMapper) null);
    }

    public String getFormatName() {
        return JsonFactory.FORMAT_NAME_JSON;
    }

    public MatchStrength hasFormat(su2 su2) throws IOException {
        if (getClass() == MappingJsonFactory.class) {
            return hasJSONFormat(su2);
        }
        return null;
    }

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super((xe4) objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper((JsonFactory) this));
        }
    }

    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    public MappingJsonFactory(JsonFactory jsonFactory, ObjectMapper objectMapper) {
        super(jsonFactory, (xe4) objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper((JsonFactory) this));
        }
    }
}
