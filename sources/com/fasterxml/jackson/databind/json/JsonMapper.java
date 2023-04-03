package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    /* renamed from: com.fasterxml.jackson.databind.json.JsonMapper$a */
    public static class C2035a extends vn3<JsonMapper, C2035a> {
        public C2035a(JsonMapper jsonMapper) {
            super(jsonMapper);
        }
    }

    public JsonMapper() {
        this(new JsonFactory());
    }

    public static C2035a builder() {
        return new C2035a(new JsonMapper());
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public boolean isEnabled(JsonReadFeature jsonReadFeature) {
        return isEnabled(jsonReadFeature.mappedFeature());
    }

    public C2035a rebuild() {
        return new C2035a(copy());
    }

    public Version version() {
        return rk4.f17279a;
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public static C2035a builder(JsonFactory jsonFactory) {
        return new C2035a(new JsonMapper(jsonFactory));
    }

    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    public boolean isEnabled(JsonWriteFeature jsonWriteFeature) {
        return isEnabled(jsonWriteFeature.mappedFeature());
    }

    public JsonMapper(JsonMapper jsonMapper) {
        super((ObjectMapper) jsonMapper);
    }
}
