package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i, str4, str5, (String) null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }

    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i;
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            int i2 = -1;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = "";
            String str5 = str4;
            String str6 = str5;
            while (true) {
                JsonToken O0 = jsonParser.mo13940O0();
                if (O0 == JsonToken.END_OBJECT) {
                    return constructValue(deserializationContext, str4, str5, str6, i2, str, str2, str3);
                }
                String f = jsonParser.mo13964f();
                if ("className".equals(f)) {
                    str4 = jsonParser.mo13947W();
                } else if ("classLoaderName".equals(f)) {
                    str3 = jsonParser.mo13947W();
                } else if ("fileName".equals(f)) {
                    str6 = jsonParser.mo13947W();
                } else if ("lineNumber".equals(f)) {
                    if (O0.isNumeric()) {
                        i = jsonParser.mo13933I();
                    } else {
                        i = _parseIntPrimitive(jsonParser, deserializationContext);
                    }
                    i2 = i;
                } else if ("methodName".equals(f)) {
                    str5 = jsonParser.mo13947W();
                } else if (!"nativeMethod".equals(f)) {
                    if ("moduleName".equals(f)) {
                        str = jsonParser.mo13947W();
                    } else if ("moduleVersion".equals(f)) {
                        str2 = jsonParser.mo13947W();
                    } else if (!"declaringClass".equals(f) && !"format".equals(f)) {
                        handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, f);
                    }
                }
                jsonParser.mo13959c1();
            }
        } else if (g != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        } else {
            jsonParser.mo13938N0();
            StackTraceElement deserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.mo13938N0() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return deserialize;
        }
    }
}
