package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;

public enum JsonFormatTypes {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;
    

    /* renamed from: a */
    public static final Map<String, JsonFormatTypes> f10074a = null;

    /* access modifiers changed from: public */
    static {
        int i;
        f10074a = new HashMap();
        for (JsonFormatTypes jsonFormatTypes : values()) {
            f10074a.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }

    @JsonCreator
    public static JsonFormatTypes forValue(String str) {
        return f10074a.get(str);
    }

    @k73
    public String value() {
        return name().toLowerCase();
    }
}
